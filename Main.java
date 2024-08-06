import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        printeven();
    }
    public static void printeven(){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int b= sc.nextInt();
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        int d=a+b;
        System.out.println("Total= " +d);
        System.out.println("Thanks");
    }
}