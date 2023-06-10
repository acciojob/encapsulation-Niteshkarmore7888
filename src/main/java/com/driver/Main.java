package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwonly =new RWOnly();

        // Expected 0 arguments but found 1


        rwonly.setName("Nitesh");
        rwonly.getName();
    }
  
}