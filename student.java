import java.util.Scanner;
class student {
    public static void main(String[] args) {

        int roll;
        String name;
        float Marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll no: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the Marks: ");
        Marks = sc.nextLine();
         System.out.println("Roll no: " + roll + "\nName: " + name + "\nMarks: " + Marks);
    }
}