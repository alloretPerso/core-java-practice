package com.corePlatform.autoclosable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        doWithBuffereStreams();
    }

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try {
            reader = Helper.openReader("file1.txt");
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\n length:" + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getCause());
        } finally {
            try {
                if (reader != null) reader.close();

            } catch (IOException e2) {
                System.out.println(e2.getCause());
            }
        }
    }

    public static void doTryWithResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\n length:" + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
    }

    public static void doTryWithMultiResources() {
        char[] buff = new char[8];
        int length;
        try (Reader reader = Helper.openReader("file1.txt");
             Writer writer = Helper.openWriter("file1.txt")) {
            while ((length = reader.read(buff)) >= 0) {
                System.out.println("\n length:" + length);
                for (int i = 0; i < length; i++) {
                    System.out.println(buff[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
    }

    public static void doWithBuffereStreams() {
        try (BufferedReader br = new BufferedReader(new FileReader("file1.txt"))) {
            int val;
            while ((val = br.read()) >= 0) {
                char charval = (char) val;
                System.out.println(charval);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeData(String[] data){
        //String value = "Hello \n regreg \n regerg\n";
        try(BufferedWriter br = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String value: data){
                br.write(value);
                br.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readData() throws IOException{
        try (BufferedReader br = Files.newBufferedReader(Paths.get("data.txt"))){
            String intValue;
            while ((intValue = br.readLine())!= null){
                System.out.println(intValue);
            }
        }
    }

    void readThemAll() throws IOException{
        //Not for big files
        List<String> lines =
                Files.readAllLines(Paths.get("file1.txt"));
        for (String line:lines) System.out.println(line);
    }


}
