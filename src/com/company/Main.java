package com.company;

import jdk.management.resource.ResourceType;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        System.err.println("first");
        System.err.println("second");
        try {
            Process process = Runtime.getRuntime().exec("d:\\intelij\\Test\\resources\\generator-windows-amd64.exe");
//            Runtime.getRuntime().getLocalizedInputStream()
//            ResourceType.STDIN_READ


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.err.println("third");


        try {
            System.console().writer().print("ttt");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
//        printings will not be redirected with System.setOut(myPrintStream); – oliholz Mar 22 '11 at 11:08


//        System.setOut(myPrintStream);


        try {
            System.setOut(new PrintStream(new File("log.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        com.company.Main.main(args);


        {
            PrintStream orgStream   = null;
            PrintStream fileStream  = null;
            try
            {
                // Saving the orginal stream
                orgStream = System.out;
                fileStream = new PrintStream(new FileOutputStream("out.txt",true));
                // Redirecting console output to file
                System.setOut(fileStream);
                // Redirecting runtime exceptions to file
                System.setErr(fileStream);
                throw new Exception("Test Exception");

            }
            catch (FileNotFoundException fnfEx)
            {
                System.out.println("Error in IO Redirection");
                fnfEx.printStackTrace();
            }
            catch (Exception ex)
            {
                //Gets printed in the file
                System.out.println("Redirecting output & exceptions to file");
                ex.printStackTrace();
            }
            finally
            {
                //Restoring back to console
                System.setOut(orgStream);
                //Gets printed in the console
                System.out.println("Redirecting file output back to console");

            }

        }


        System.err.println("test!");
        System.out.println("out1");


                com.company.Main.main(args);

    }
}
