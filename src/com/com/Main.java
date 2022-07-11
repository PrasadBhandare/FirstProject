package com.com;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    void MainMenu() {
        System.out.println("Choose the file Operations You want to perform :");
        System.out.println("1. List the Files.");
        System.out.println("2. Operations on Files.");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) {
        System.out.println(" !!!! Welcome Screen !!!!");
        System.out.println(" Developer :  Prasad Bhandare  ");
        Main a = new Main();
        a.MainMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Choice");
        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                File fileDir = new File("C:\\Users\\Admin\\Desktop\\Prasad");
                if (fileDir.isDirectory()) {
                    List<String> listFile = Arrays.asList(fileDir.list());
                    Collections.sort(listFile);
                    for (String s : listFile) {
                        System.out.println(s);
                    }

                }
                break;

            case 2 :
                System.out.println("1. Add a File");
                System.out.println("2. Delete a File");
                System.out.println("3. Search a File");
                System.out.println("4. Navigate to Main Menu");

                System.out.println("Please Enter Your Choice");
                int ch1=sc.nextInt();

                switch(ch1){

                    case 1:
                    System.out.println("Enter The File Name You Want To Add");
                    String str = sc.next();

                    File file = new File("C:\\Users\\Admin\\Desktop\\Prasad" + str);

                        try {

                            boolean value = file.createNewFile();
                            if (value) {
                                System.out.println("New Java File is created.");
                            }
                            else {
                                System.out.println("The file already exists.");
                            }
                        }
                        catch(Exception e) {
                            e.getStackTrace();
                        }

                        break;

                    case 2 :
                        System.out.println("  Enter The File Name You Want To Delete ");
                        String str1 = sc.next();
                        File f = new File("C:\\Users\\Admin\\Desktop\\Prasad" + str1);
                        try {
                            if(f.exists()) {

                                if(f.delete()) {
                                    System.out.println("File Deleted : "+f.getName());
                                }
                                else {
                                    System.out.println("Failed");
                                }
                            }
                            else {
                                System.out.println("Incorrect File Name, File Doesn't Exists");
                            }
                        }
                        catch(Exception e) {
                            e.getMessage();
                        }

                        break;

                    case 3 :
                        System.out.println("  Enter The File Name You Want To Search ");
                        String str2 = sc.next();
                        File f1=new File("C:\\Users\\Admin\\Desktop\\Prasad" + str2);

                        if (f1.exists()) {
                            System.out.println("Found Your File : "+f1);
                        }
                        else {
                            System.out.println("File Does Not Exists !!!");
                        }

                        break;

                    case 4 :
                        a.MainMenu();
                        break;
                }


            case 3 :

                break;


                }


        }
    }
