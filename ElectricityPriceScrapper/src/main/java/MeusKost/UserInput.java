package MeusKost;

import java.util.Scanner;

public class UserInput {

    int priceWillingToPay = 0;
    UserInput(){
        this.priceWillingToPay = 0;
    }
    public void ask(String text){
        Scanner myObj = new Scanner(System.in);
        System.out.println(text);
        priceWillingToPay = myObj.nextInt();
    }


    public int retrieve(){
        return priceWillingToPay;
    }
}
