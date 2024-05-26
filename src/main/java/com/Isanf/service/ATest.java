package com.Isanf.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;

public class ATest {

//    @Test
//    public void testCommitOnSuccess() throws Exception {
//        Service service = Mockito.mock(Service.class);
//        Connection connection = Mockito.mock(Connection.class);
//
//        A instance = new A();
//        instance.a(service, connection);
//
//        Mockito.verify(service).setConnection(connection);
//        Mockito.verify(service).execute();
//        Mockito.verify(connection).commit();
//        Mockito.verify(connection).close();
//        Mockito.verify(connection, Mockito.never()).rollback();
//    }
//
//    @Test
//    public void testRollbackOnException() throws Exception {
//        Service service = Mockito.mock(Service.class);
//        Connection connection = Mockito.mock(Connection.class);
//
//        Mockito.doThrow(new Exception("Execution failed")).when(service).execute();
//
//        A instance = new A();
//        Exception exception = assertThrows(RuntimeException.class, () -> {
//            instance.a(service, connection);
//        });
//
//        assertEquals("Execution failed", exception.getCause().getMessage());
//        Mockito.verify(service).setConnection(connection);
//        Mockito.verify(service).execute();
//        Mockito.verify(connection).rollback();
//        Mockito.verify(connection).close();
//    }
//
//    @Test
//    public void testCloseCalledEvenIfRollbackFails() throws Exception {
//        Service service = Mockito.mock(Service.class);
//        Connection connection = Mockito.mock(Connection.class);
//
//        Mockito.doThrow(new Exception("Execution failed")).when(service).execute();
//        Mockito.doThrow(new Exception("Rollback failed")).when(connection).rollback();
//
//        A instance = new A();
//        Exception exception = assertThrows(RuntimeException.class, () -> {
//            instance.a(service, connection);
//        });
//
//        assertEquals("Execution failed", exception.getCause().getMessage());
//        assertTrue(exception.getCause().getSuppressed()[0].getMessage().contains("Rollback failed"));
//        Mockito.verify(service).setConnection(connection);
//        Mockito.verify(service).execute();
//        Mockito.verify(connection).rollback();
//        Mockito.verify(connection).close();
//    }
//
//    @Test
//    public void testCloseCalledOnCommitException() throws Exception {
//        Service service = Mockito.mock(Service.class);
//        Connection connection = Mockito.mock(Connection.class);
//
//        Mockito.doThrow(new Exception("Commit failed")).when(connection).commit();
//
//        A instance = new A();
//        Exception exception = assertThrows(RuntimeException.class, () -> {
//            instance.a(service, connection);
//        });
//
//        assertEquals("Commit failed", exception.getCause().getMessage());
//        Mockito.verify(service).setConnection(connection);
//        Mockito.verify(service).execute();
//        Mockito.verify(connection).commit();
//        Mockito.verify(connection).close();
//    }
}

