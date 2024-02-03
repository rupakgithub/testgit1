package org.example;

public class Genericsexmplae {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();

        GenericsTest demo = new GenericsTest();
        String res = demo.<String>genericMethod("Hello world");
        System.out.println(res);
    }
}

class GenericsTest {
    public <T> T genericMethod(T data){
        System.out.println("data is: "+ data);
        return data;
    }
}
