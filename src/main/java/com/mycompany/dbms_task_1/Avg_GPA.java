
package com.mycompany.dbms_task_1;
import java.io.BufferedReader;
import java.io.FileReader;
public class Avg_GPA {
    public static void main(String[] args) {
       double total_Gpa = 0 ;
       int total_student = 0;
       
       try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Person\\grades.txt")))
       {
           String line;
           while((line = reader.readLine())!= null)
           {
               String[] parts = line.split(";");
               double gpa = Double.parseDouble(parts[1]);
               total_Gpa += gpa;
               total_student++;
           }
           if(total_student>0)
           {
               double avgGpa = total_Gpa/total_student;
               System.out.printf("AVG GPA: %.2f%n",avgGpa);
           }
           else
           {
               System.out.println("No Students");
           }
       }
       catch(Exception e)
        {
           System.out.println("Ex: "+e);
        }
    }
}
