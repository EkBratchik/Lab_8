package com.bsu;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\in.txt"))) {
            while (sc.hasNext()) {
                String str = sc.nextLine();
                if (checkValidNumbers(str)) {
                    System.out.println(str);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static boolean checkValidNumbers(String str)
    {
        return str.matches("^\\d{1,3}([, ]\\d{3})*([.,]\\d+)?$");
    }
    }




