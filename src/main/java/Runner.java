/*
    MiniProject: Student Management System
        1. Create Student Management System that can be
            used by any educational institution
        2. User (Admin) can: CRUD (Create, Read, Update, Delete)
            -register user (id, name, lastName, city, age fields)
            -list/display students/student
            -update student by id
            -delete student by id
 */

// 1- Create Control Menu for the app
// 2- Create Student Class
// 3- Create Service class to write methods(business logic)
// 4- Create Repository Class to communicate with DB

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        Scanner inp = new Scanner(System.in);
        int select;
        do{
            System.out.println("======================");
            System.out.println("***** Student Admin Panel ****");
            System.out.println("1-Student Register");
            System.out.println("2-List All Students");
            System.out.println("3-Update Student");
            System.out.println("4-Delete Student");
            System.out.println("5-Display Student Detail");
            System.out.println("0-Exit");

            select = inp.nextInt();
            inp.nextLine(); //to call next enter
            int id;
            switch (select){
                case 1:
                    //register
                    break;
                case 2:
                    //display all student list
                    break;
                case 3:
                    //update student
                    id = getStudentId(inp);
                    break;
                case 4:
                    //delete student
                    id = getStudentId(inp);
                    break;
                case 5:
                    //find student by id
                    id = getStudentId(inp);
                    break;
                case 0:
                    //exit
                    System.out.println("Thank you for using app. Have a nice day");
                    break;
                default:
                    System.out.println("Please enter valid number");

            }

        }while (select !=0);
    }
    //method to ask user to enter student id
    private static int getStudentId(Scanner input){
        System.out.println("Enter student id: ");
        int id = input.nextInt();
        input.nextLine();
        return id;
    }

}