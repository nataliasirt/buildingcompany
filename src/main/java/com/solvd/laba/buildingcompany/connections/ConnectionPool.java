package com.solvd.laba.buildingcompany.connections;


import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    public static ConnectionPool connectionPool;
    private List<Connection> connections;

    private ConnectionPool() {
        connections = new ArrayList<>();
        initializeConnections();
    }


    public static synchronized ConnectionPool getInstance () {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
        }
        return connectionPool;
    }


    private void initializeConnections() {
        for (int i = 0; i < 5; i++) {
            Connection connection = new Connection("com.solvd.connectionpool.Connection"+i);
            connections.add(connection);
        }
    }

    public synchronized Connection getConnection () throws InterruptedException {
        while (connections.isEmpty()){
            wait();
        }
        Connection connection = connections.remove(connections.size()-1);
        return connection;
    }

    public synchronized void releaseConnection(Connection connection){
        connections.add(connection);
        notify();
    }
}