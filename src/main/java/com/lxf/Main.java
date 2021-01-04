package com.lxf;



public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.log();
        service.log2();
        service.log3(1);
        service.log4();
        service.log5("a", 2, true);
        service.interfaceTest();
        service.interfaceTest2();
    }
}
