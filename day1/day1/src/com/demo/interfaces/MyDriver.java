package com.demo.interfaces;

public interface MyDriver {
   String releaseNo="1.0";
    String getConnection();
    String getDbVersion();

   default boolean isClusterSupported(){
       return false;
   }

   static void mystaticMethod(){
       System.out.println("Static methode in interface");
   }

    private void myPrivateMethod(){
        System.out.println("Private methode in interface");
    }

}
