import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class CollectionExample {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String Name ,Department,newEmpName , newEmpDept;
        double Salary, newEmpSal;
        ArrayList <String> emp =new ArrayList<String>();
        ArrayList <String> Dept =new ArrayList<String>();
        ArrayList <Double>  Sal=new ArrayList<Double>();
        // ArrayList <Double> salary =new ArrayList<Double>();
        while(true){
            System.out.println("************************\nApplication starts:\nWelcome to Employee Management Systsem:\nPlease choose one of the below option:\n1 - Show all the employee records \n2 - Add employee \n3 - Remove employee\n4 - get employee details \n5 - update employee details\n-1 - Exit application \n**********************************");
            int ch=sc.nextInt();
        if(ch==-1){
            System.out.println("exit the console");
            break;}
        else{
        switch(ch){
            case 1: 
            {
                if(emp.isEmpty())
                System.out.println("************No records************\n\n");
                else 
                {System.out.println("---------------------------------------------------------------------------");
                System.out.println("employeeName\t\t department\t\t Salary");
                System.out.println("---------------------------------------------------------------------------");
                for (int i = 0; i < emp.size(); i++){
                System.out.println("|"+emp.get(i)+"\t\t\t"+ Dept.get(i)+"\t\t\t"+Sal.get(i));
                }
                }
            } break;
            case 2:
            {
            System.out.print("\nName: ");
            Name=sc.next();
            System.out.print("\nDepartment: ");
            Department=sc.next();
            System.out.print("\nSalary: ");
            Salary=sc.nextDouble();
            emp.add(Name);
            Dept.add(Department);
            Sal.add(Salary);
            System.out.println("\n************successfully added one record ************\n");
            }break;
            case 3:{
            System.out.println("Enter employee name and department and salary to delete record :\n");
            System.out.print("\nName: ");
            Name=sc.next();
            System.out.print("\nDepartment: ");
            Department=sc.next();
            System.out.print("\nSalary: ");
            Salary=sc.nextDouble();
            if(emp.contains(Name)==Dept.contains(Department) && Dept.contains(Department)==Sal.contains(Salary) ){
                int position = emp.indexOf(Name);
                emp.remove(position);
                Dept.remove(position);
                Sal.remove(position);
                System.out.println("\n************successfully deleted one record ************\n");
            }
            else 
            System.out.println("************there is no such record in employee table :************");
            }break;
            case 4: System.out.println("************please enter option 1 to retrieve complete employee details************"); break;
            case 5:
            {
            System.out.println("Enter old employee name and department and salary to update record :\n");
            System.out.print("\nName: ");
            Name=sc.next();
            System.out.print("\nDepartment: ");
            Department=sc.next();
            System.out.print("\nSalary: ");
            Salary=sc.nextDouble();
            if(emp.contains(Name)==Dept.contains(Department) && Dept.contains(Department)==Sal.contains(Salary) ){
                int position = emp.indexOf(Name);
                System.out.print("\nEnter new Employee Name: ");
                newEmpName=sc.next();
                System.out.print("\nEnter new Employee Department: ");
                newEmpDept=sc.next();
                System.out.print("\nEnter new Employee Salary: ");
                newEmpSal=sc.nextDouble();
                emp.set(position , newEmpName);
                Dept.set(position, newEmpDept);
                Sal.set(position , newEmpSal);
                System.out.print("\n************successfully updated one record ************\n\n\n");
            }
            else 
            System.out.println("************there is no such record in employee table :************");
            }break;
            default : System.out.println("************you entered wrong choice************");
        }}}
    }
}
