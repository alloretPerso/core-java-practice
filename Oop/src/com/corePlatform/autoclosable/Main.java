package com.corePlatform.autoclosable;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Main {
    public static void main(String args []){
        doTryCatchFinally();
    }
    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("file1.txt");
            while ((length = reader.read(buff)) >= 0){
                System.out.println("\n length:" + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        }catch (IOException e){
            System.out.println(e.getCause());
        }finally {
            try {
                if(reader != null) reader.close();

            }catch (IOException e2){
                System.out.println(e2.getCause());
            }
        }
    }

    public static void doTryWithResources(){
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt")){
            while ((length = reader.read(buff)) >= 0){
                System.out.println("\n length:" + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        }catch (IOException e) {
            System.out.println(e.getCause());
        }
    }

    public static void doTryWithMultiResources(){
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt");
             Writer writer = Helper.openWriter("file1.txt")){
            while ((length = reader.read(buff)) >= 0){
                System.out.println("\n length:" + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        }catch (IOException e) {
            System.out.println(e.getCause());
        }
    }


}
