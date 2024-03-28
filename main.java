import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        gussingNumberGame ayush=new gussingNumberGame();
        System.out.println("Enter the level of an Game:");
        int Level=input.nextInt();
        int Input,GameInput,extraPoint=0;
        while(true){
            System.out.print("->");
            Input=input.nextInt();
            switch (Input){
                case -1:
                    ayush.ShowDashBoard();
                    break;
                default:
                    GameInput=ayush.levelOfAgame(Level);
                    if (GameInput==Input){
                        extraPoint++;
                        ayush.PointCalculater(true,extraPoint);
                    }
                    else{
                        extraPoint=0;
                        ayush.PointCalculater(false,extraPoint);
                    }
            };
            if (Input==-1){
                break;
            }
        }
    }
}
