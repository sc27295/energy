import java.util.Scanner;
public class Energy {

    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the amount of water in kgs?: ");
        double water=keyboard.nextDouble();
        System.out.print("Enter the initial temperautue: ");
        double initial_temp=keyboard.nextDouble();
        System.out.print("Enter the initial temperautue: ");
        double fianl_temp=keyboard.nextDouble();

        double Q=water*(fianl_temp-initial_temp);

        System.out.print("The energy needed is: "+Q);

    }
}
