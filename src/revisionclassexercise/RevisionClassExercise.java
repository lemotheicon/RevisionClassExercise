/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionclassexercise;

import java.util.Scanner;

/**
 *
 * @author 21267111(Omolemo)
 */
public class RevisionClassExercise {

  
    public static void main(String[] args) {
       String moduleName;
       int code;
       int credit;
       int marks;
       new RevisionClassExercise();
      
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the module name:");
        moduleName = input.nextLine();
        input.nextLine();
        System.out.println("Enter module code:");
        code = input.nextInt();
        System.out.println("Enter module credit:");
        credit = input.nextInt();
        System.out.println("Enter module marks");
        marks = input.nextInt();
        
        
    }

  
    public RevisionClassExercise()
    {
        int marks;
        int assignment = 0;
        int ice = 0;
        int test = 0;
        marks = assignment + ice + test;
        assignment++;
        test++;
        ice++;
       
    }
}
