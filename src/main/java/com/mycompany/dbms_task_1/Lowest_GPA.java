
package com.mycompany.dbms_task_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Lowest_GPA {
    public static void main(String[] args) {
        int id;
        String name="";
        int sem=0;
        double low_gpa=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        id = input.nextInt();
        boolean found1 = false;
        boolean found2 = false;
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Person\\studentInfo.txt")))
        {
            String line;
            while((line = reader.readLine())!=null)
            {
                String parts[] = line.split(";");
                int ID = Integer.parseInt(parts[0]);
                if(id==ID)
                {
                    found1=true;
                    name = parts[1];
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Test\\grade.txt")))
        {
            String line;
            low_gpa=Double.MAX_VALUE;
            while((line = reader.readLine())!=null)
            {
                String parts[] = line.split(";");
                int ID = Integer.parseInt(parts[0]);
                if(id==ID)
                {
                    found2=true;
                    double gpa = Double.parseDouble(parts[1]);
                    if(gpa<low_gpa)
                    {
                        low_gpa = gpa;
                        sem = Integer.parseInt(parts[2]);                     
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
        if(found1==true && found2==true)
        {
            System.out.println("Name: "+name);
            System.out.println("LOWEST GPA: "+low_gpa);
            System.out.println("SEMESTER: "+sem);
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
