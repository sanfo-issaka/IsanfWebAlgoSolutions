package com.Isanf.service;

class A { 
    /** 
     * Executes the service with the given connection. 
     */ 
    void a(Service s, Connection c) { 
        try {
            s.setConnection(c); 
            s.execute();
            c.commit();
        } catch (Exception e) {
            try {
                c.rollback();
            } catch (Exception rollbackException) {
                e.addSuppressed(rollbackException);
            }
            throw new RuntimeException(e);
        } finally {
            try {
                c.close();
            } catch (Exception closeException) {
                // Handle exception during close if necessary
            }
        }
    } 
} 

interface Service { 
    void execute() throws Exception; 
    void setConnection(Connection c); 
} 

interface Connection { 
    void commit() throws Exception; 
    void rollback() throws Exception; 
    void close() throws Exception; 
}
