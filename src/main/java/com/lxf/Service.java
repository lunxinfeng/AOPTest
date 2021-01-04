package com.lxf;


public class Service implements IService, IService2 {

    @Deprecated
    public int log() {
        System.out.println("log");
        return 1;
    }

    public void log2() {
        System.out.println("log2");
    }

    public void log3(int a) {
        System.out.println("log3");
    }

    public void log4() throws ArrayIndexOutOfBoundsException {
        System.out.println("log4");
    }

    public void log5(@Deprecated String a,int b,boolean c){
        System.out.println("log5");
    }

    @Override
    public void interfaceTest() {
        System.out.println("interfaceTest");
    }

    @Override
    public void interfaceTest2() {
        System.out.println("interfaceTest2");
    }
}
