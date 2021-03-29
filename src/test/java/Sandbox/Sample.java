package Sandbox;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class Sample {
    public void envStage() {
        try {
            File myObj = new File("target/allure-results/environment.xml");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("target/allure-results/environment.xml");
            myWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?><environment><parameter><key>Build server</key><value>Stage</value></parameter><parameter><key>Build.Version</key><value>2.6.65.debug_stage(2665)</value></parameter><parameter><key>URL backend</key><value>https://stage.develop.toplyvo.app/admin</value></parameter></environment>");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void envProd() {
        try {
            File myObj = new File("target/allure-results/environment.xml");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("target/allure-results/environment.xml");
            myWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?><environment><parameter><key>Build server</key><value>Prod</value></parameter><parameter><key>Build.Version</key><value>2.6.65.debug_prod(2665)</value></parameter><parameter><key>URL backend</key><value>https://api.toplyvo.app/admin</value></parameter></environment>");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}