import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        int salary;
        System.out.println("enter the salary: ");

        Scanner take=new Scanner(System.in);
        salary=take.nextInt();
        if (salary>25000){
            salary+=2000;

        }
        else if(salary>15000) {
            salary+=1000;

        }

        else{
            salary+=500;
        }
        System.out.println("new salary: "+salary);
    }
}
