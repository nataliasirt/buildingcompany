package com.solvd.laba.buildingcompany.connections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                ConnectionPool connectionPool = ConnectionPool.getInstance();
                Connection connection = null;
                try {
                    connection = connectionPool.getConnection();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                assert connection != null;
                System.out.println(connection.getName());
                connectionPool.releaseConnection(connection);
            }
        };


        List<Thread> threadList = new ArrayList<>();
        for (int i=0; i<7; i++){
            threadList.add(new Thread(runnable));
        }

        ExecutorService executorService = Executors.newFixedThreadPool(7);

        for (Thread t: threadList){
            executorService.execute(t);
        }
        executorService.shutdown();

    }
}



