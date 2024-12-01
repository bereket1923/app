package Assignment12;

import java.util.Scanner;

public class Salary{
    static final double BASE_SALARY=5000.00;
    static final double BONUS_PERCENTAGE=0.1;
    static final double TAX_PERCENTAGE=0.15;

    static double bonusCalculate(double baseSalary){
        return baseSalary*0.1;
    }
    static double salaryAfterBonus(double baseSalary,double bonus){
        return baseSalary + bonus;
    }
    static double taxAfterBonus(double salaryAfterBonus){
        return salaryAfterBonus*0.15;
    }
    static double finalSalaryAfterTax(double salaryAfterBonus, double tax){
        return salaryAfterBonus -tax;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary=sc.nextDouble();
        System.out.println();
        double bonus = bonusCalculate(BASE_SALARY);
        double salaryAfterBonus =salaryAfterBonus(BASE_SALARY, bonus);
        double tax =taxAfterBonus(salaryAfterBonus);
        double finalSalary = finalSalaryAfterTax(salaryAfterBonus, tax);
        System.out.println("baseSalary: "+BASE_SALARY);
        System.out.println("the final salary: "+finalSalary);
    }
}
