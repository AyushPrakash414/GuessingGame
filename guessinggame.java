import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class gussingNumberGame {
   static int point=0;
     static int NegativePoint=0;
     static int BonusPointCount=0;
    String name;
    gussingNumberGame(){
        ShowRulesAndRegulation();
        GetUserData();
    }
    public void ShowRulesAndRegulation(){
        System.out.println("!!!Welcome to Number Guessing Game!!!");
        System.out.println("If you want to exit press -1");
        System.out.println("Rules-->For every 3 correct continues guess you will awarded 5 points.");
        System.out.println("Press 1-->Easy(0-5 Range)");
        System.out.println("Press 2-->Easy(0-10 Range)");
        System.out.println("Press 3-->Easy(0-20 Range)");

    }

    public void GetUserData(){
        System.out.print("Enter the name of an player:");
        Scanner sc=new Scanner(System.in);
        name= sc.nextLine();
    }
    public int levelOfAgame(int x){
        Random random=new Random();
        switch(x){
            case 1:
                return (random.nextInt())%5;
            case 2:
                return (random.nextInt())%10;
            case 3:
                return (random.nextInt())%20;

        }
        return 404;
    }
    public void PointCalculater(boolean x,int ExtraPoint){
        if(x==true){
            if (ExtraPoint==3){
                System.out.println("Correct!!");
                System.out.println("Bonus point+5");
                point+=5;
                BonusPointCount++;
            }
            else{
                System.out.println("Correct!!");
                point++;
            }
        }
        else {
            System.out.println("False!!");
            NegativePoint++;
        }
    }
    public void ShowDashBoard(){
        System.out.println("The is end Now and The Total Point:");
        System.out.println("*-----------------------------------------*");
        System.out.println("The Total Point Is:"+point);
        System.out.println("Total Bonus point Is:"+BonusPointCount*5);
        System.out.println("Total Negative point Is:"+NegativePoint);
        System.out.println("*-----------------------------------------*");
    }
}

