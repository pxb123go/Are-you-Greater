import java.util.Scanner;

class Greater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any INTEGER: ");
        int i1=sc.nextInt();
        if (i1>10) {
          System.out.println("INTEGER is greater than 10");  
        }
        else{
            System.out.println("INTEGER is not greater than 10");  
        }
    }
}