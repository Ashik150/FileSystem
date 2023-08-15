
package com.mycompany.dbms_task_1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class New_Info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Id: ");
        int id = input.nextInt();
        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();
        System.out.print("Enter Semester: ");
        int sem = input.nextInt();
        if(gpa>=2.50 && gpa<=4.00)
        {
            String New = id +";" + gpa +";"+ sem;
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\Person\\grades.txt",true)))
            {
                writer.write(New);
                writer.newLine();
                System.out.println("Successfull");
            }
            catch(Exception e)
            {
                System.out.println("Ex: "+e);
            }
        }
        else
        {
            System.out.println("Invalid GPA");
        }
    }
}
