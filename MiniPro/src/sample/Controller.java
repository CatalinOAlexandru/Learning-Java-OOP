 package sample;

 import java.util.*;
 import java.text.*;
 import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 import javafx.scene.control.TextArea;
 import javafx.scene.control.TextField;
 import sample.Market;

 public class Controller
{
    public static String getTime()
    {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss");
        return ("[" + ft.format(dNow)+ "] ");

    }

    @FXML TextArea terminal;
    @FXML TextField userName;
    @FXML TextField userMoney;
    @FXML TextField otherAmount;
    public static boolean accountSetUp = false;
    public static boolean marketSelected = false;
    public static String ans = "";


    public void setupButtonClicked()
    {
        Portofolio user1 = new Portofolio(userName.getText(), Double.parseDouble(userMoney.getText()));
        terminal.appendText(getTime() + "Your account is fully setup!\n");
        terminal.appendText(getTime() + "You can start trading\n");
        accountSetUp = true;
    }

    public void bitcoinButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else
        {
            Market Coin1;
            Coin1 = new Bitcoin();
            ans = "Bitcoin";
            terminal.appendText(getTime() + "Bitcoin market selected\n");
        }
    }

    public void ethereumButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Market Coin1;
            Coin1 = new Ethereum();
            ans = "Ethereum";
            terminal.appendText(getTime() + "Ethereum market selected\n");
        }
    }

    public void litecoinButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Market Coin1;
            Coin1 = new Litecoin();
            ans = "Litecoin";
            terminal.appendText(getTime() + "Litecoin market selected\n");
        }
    }

    public void appleButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Market tech1;
            tech1 = new Apple();
            ans = "Apple";
            terminal.appendText(getTime() + "Apple market selected\n");
        }
    }



    public void samsungButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Market tech1;
            tech1 = new Samsung();
            ans = "Samsung";
            terminal.appendText(getTime() + "Samsung market selected\n");
        }
    }

    public void googleButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Market tech1;
            tech1 = new Google();
            ans = "Google";
            terminal.appendText(getTime() + "Google market selected\n");
        }
    }

    public void audiButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Market car1;
            car1 = new Audi();
            ans = "Audi";
            terminal.appendText(getTime() + "Audi market selected\n");
        }
    }

    public void porscheButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Market car1;
            car1 = new Porsche();
            ans = "Porsche";
            terminal.appendText(getTime() + "Porsche market selected\n");
        }
    }

    public void volkswagenButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Market car1;
            car1 = new Volkswagen();
            ans = "Volkswagen";
            terminal.appendText(getTime() + "Volkswagen market selected\n");
        }
    }

    public void buyButtonClicked()
    {
        terminal.appendText(getTime() + "You selected to buy " +ans+ " coins. Please select the amount\n");
    }

    public void sellButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void statisticsButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void exitButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void amount1ButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void amount2ButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void amount5ButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void amount10ButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void amount25ButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void amount100ButtonClicked()
    {
        System.out.println("Clicked!");
    }
}