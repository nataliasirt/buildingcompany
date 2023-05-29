package com.solvd.laba.buildingcompany.connections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    // connection pool object is not created at class compilation, allowing for lazy initialization
    public static ConnectionPool connectionPool;
    private List<Connection> connections;

    // constructor must be private
    private ConnectionPool() {
        connections = new ArrayList<>();
        initializeConnections();
    }

    // ensures thread safety + single instance of com.solvd.connectionpool.Connection Pool
    public static synchronized ConnectionPool getInstance () {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
        }
        return connectionPool;

    }

    // initializing 5 instances of com.solvd.connectionpool.Connection
    private void initializeConnections() {
        for (int i = 0; i < 5; i++) {
            Connection connection = new Connection("com.solvd.connectionpool.Connection"+i);
            connections.add(connection);
        }
    }

    // returns connection if the connections list is not empty
    public synchronized Connection getConnection () throws InterruptedException {
        while (connections.isEmpty()){
            wait();
        }
        Connection connection = connections.remove(connections.size()-1);
        return connection;
    }
    // ads connection back to the list, notifies if waiting for connection
    public synchronized void releaseConnection(Connection connection){
        connections.add(connection);
        notify();
    }
}