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

    protected @FXML TextArea terminal;
    protected @FXML TextField userName;
    protected @FXML TextField userMoney;
    protected @FXML TextField totalAmount;
    protected static boolean accountSetUp = false;
    protected static boolean marketSelected = false;
    protected static String ans = "";
    protected static int amount = 0;
    protected static String operationSelected = "";
    protected static Portofolio user1;
    protected static Market Coin1;
    protected static Market car1;
    protected static Market tech1;
    private boolean isAccountSetup = false;
    private boolean confirmButtonPressed = false;
    private boolean amountPressed = false;


    public void setupButtonClicked()
    {
        if(isAccountSetup == false) {
            String name = userName.getText();
            Double money = 0.0;
            try {
                money = Double.parseDouble(userMoney.getText());
            }
            catch (Exception E)
            {}
            if (name.equals("") || money == 0.0){
                terminal.appendText(getTime() + "Make sure the fields are properly filled!\n");
            }
            else{
                user1 = new Portofolio(name, money);
                terminal.appendText(getTime() + "Your account is fully setup!\n");
                terminal.appendText(getTime() + "You can start trading\n");
                accountSetUp = true;
                isAccountSetup = true;
            }
        }
        else {terminal.appendText(getTime() + "You already fully set-up your account. You can start trading.\n");}
    }

    public void bitcoinButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else
        {
            Coin1 = new Bitcoin();
            ans = "Bitcoin";
            terminal.appendText(getTime() + "Bitcoin market selected.\n");
            marketSelected = true;
        }
    }

    public void ethereumButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Coin1 = new Ethereum();
            ans = "Ethereum";
            terminal.appendText(getTime() + "Ethereum market selected.\n");
            marketSelected = true;
        }
    }

    public void litecoinButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Coin1 = new Litecoin();
            ans = "Litecoin";
            terminal.appendText(getTime() + "Litecoin market selected.\n");
            marketSelected = true;
        }
    }

    public void appleButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            tech1 = new Apple();
            ans = "Apple";
            terminal.appendText(getTime() + "Apple market selected.\n");
            marketSelected = true;
        }
    }



    public void samsungButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            tech1 = new Samsung();
            ans = "Samsung";
            terminal.appendText(getTime() + "Samsung market selected.\n");
            marketSelected = true;
        }
    }

    public void googleButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            tech1 = new Google();
            ans = "Google";
            terminal.appendText(getTime() + "Google market selected.\n");
            marketSelected = true;
        }
    }

    public void audiButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            car1 = new Audi();
            ans = "Audi";
            terminal.appendText(getTime() + "Audi market selected.\n");
            marketSelected = true;
        }
    }

    public void porscheButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            car1 = new Porsche();
            ans = "Porsche";
            terminal.appendText(getTime() + "Porsche market selected.\n");
            marketSelected = true;
        }
    }

    public void volkswagenButtonClicked()
    {
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            car1 = new Volkswagen();
            ans = "Volkswagen";
            terminal.appendText(getTime() + "Volkswagen market selected.\n");
            marketSelected = true;
        }
    }

    public void buyButtonClicked()
    {
        if(marketSelected == false) {
            terminal.appendText(getTime() + "Make sure you select a Market before you try to make any transactions.\n");
        }
        else if(marketSelected == true && amount == 0) {
            terminal.appendText(getTime() + "You selected to buy " + ans + " Coins/Shares. Please select the amount.\n");
            operationSelected = "buy";
        }
        else if(operationSelected.equals("buy") && amount > 0){

            Double newCapital;
            if(ans.equals("Bitcoin")) {
                newCapital = Coin1.buy(amount, user1.getUserCapital(), ans);
                user1.setBitcoin(user1.getBitcoin() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Litecoin")){
                newCapital = Coin1.buy(amount, user1.getUserCapital(), ans);
                user1.setLitecoin(user1.getLitecoin() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Ethereum")){
                newCapital = Coin1.buy(amount, user1.getUserCapital(), ans);
                user1.setEthereum(user1.getEthereum() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Porsche")){
                newCapital = car1.buy(amount, user1.getUserCapital(), ans);
                user1.setPorsche(user1.getPorsche() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Wolkswagen")){
                newCapital = car1.buy(amount, user1.getUserCapital(), ans);
                user1.setWolkswagen(user1.getVolkswagen() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Audi")){
                newCapital = car1.buy(amount, user1.getUserCapital(), ans);
                user1.setAudi(user1.getAudi() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Apple")){
                newCapital = tech1.buy(amount, user1.getUserCapital(), ans);
                user1.setApple(user1.getApple() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Google")){
                newCapital = tech1.buy(amount, user1.getUserCapital(), ans);
                user1.setGoogle(user1.getGoogle() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Samsung")){
                newCapital = tech1.buy(amount, user1.getUserCapital(), ans);
                user1.setSamsung(user1.getSamsung() + amount);
                user1.setUserCapital(newCapital);}
            else
                terminal.appendText(getTime() + "There was an Error. The value was not saved into your account.");

        }
        else
        { terminal.appendText(getTime() + "ERROR 01: There was an Error in buying method.\n");}
        amount = 0;
        totalAmount.setText(String.valueOf(amount));
        amountPressed = false;
        operationSelected = "";
    }

    public void sellButtonClicked()
    {
        if(marketSelected == false) {
            terminal.appendText(getTime() + "Make sure you select a Market before you try to make any transactions.\n");
        }
        else if(marketSelected == true && amount == 0) {
            terminal.appendText(getTime() + "You selected to sell " + ans + " Coins/Shares. Please select the amount.\n");
            operationSelected = "sell";
        }
        else if(operationSelected.equals("sell") && amount > 0){

            Double newCapital;
            if(ans.equals("Bitcoin")) {
                newCapital = Coin1.sell(amount, user1.getUserCapital(), ans, user1.getBitcoin());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setBitcoin(user1.getBitcoin() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Litecoin")){
                newCapital = Coin1.sell(amount, user1.getUserCapital(), ans, user1.getLitecoin());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setLitecoin(user1.getLitecoin() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Ethereum")){
                newCapital = Coin1.sell(amount, user1.getUserCapital(), ans, user1.getEthereum());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setEthereum(user1.getEthereum() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Porsche")){
                newCapital = car1.sell(amount, user1.getUserCapital(), ans, user1.getPorsche());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setPorsche(user1.getPorsche() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Wolkswagen")){
                newCapital = car1.sell(amount, user1.getUserCapital(), ans, user1.getVolkswagen());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setWolkswagen(user1.getVolkswagen() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Audi")){
                newCapital = car1.sell(amount, user1.getUserCapital(), ans, user1.getAudi());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setAudi(user1.getAudi() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Apple")){
                newCapital = tech1.sell(amount, user1.getUserCapital(), ans, user1.getApple());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setApple(user1.getApple() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Google")){
                newCapital = tech1.sell(amount, user1.getUserCapital(), ans, user1.getGoogle());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setGoogle(user1.getGoogle() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Samsung")){
                newCapital = tech1.sell(amount, user1.getUserCapital(), ans, user1.getSamsung());
                if(newCapital == -9999.01) {return;}
                else{
                    user1.setSamsung(user1.getSamsung() - amount);
                    user1.setUserCapital(newCapital);}}
            else
                terminal.appendText(getTime() + "There was an Error. The value was not saved into your account.\n");

        }
        else
        { terminal.appendText(getTime() + "ERROR 02: There was an Error in selling method.\n");}
        amount = 0;
        totalAmount.setText(String.valueOf(amount));
        amountPressed = false;
        operationSelected = "";
    }

    public void statisticsButtonClicked()
    {
        if(marketSelected == true) {
            if (ans.equals("Bitcoin") || ans.equals("Litecoin") || ans.equals("Ethereum")) {
                terminal.appendText(getTime() + ans + "'s statistics at this moment:\n");
                terminal.appendText(getTime() + "Current Value: " + Coin1.getValue() + "\n");
                terminal.appendText(getTime() + "Highest Value recorded: " + Coin1.getHighestValue() + "\n");
                terminal.appendText(getTime() + "Highest Value in the last 24 hours: " + Coin1.getM24High() + "\n");
                terminal.appendText(getTime() + "Lowest Value in the last 24 hours: " + Coin1.getM24Low() + "\n");
            } else if (ans.equals("Apple") || ans.equals("Google") || ans.equals("Samsung")) {
                terminal.appendText(getTime() + ans + "'s statistics at this moment:\n");
                terminal.appendText(getTime() + "Current Value: " + tech1.getValue() + "\n");
                terminal.appendText(getTime() + "Highest Value recorded: " + tech1.getHighestValue() + "\n");
                terminal.appendText(getTime() + "Highest Value in the last 24 hours: " + tech1.getM24High() + "\n");
                terminal.appendText(getTime() + "Lowest Value in the last 24 hours: " + tech1.getM24Low() + "\n");
            } else if (ans.equals("Audi") || ans.equals("Porsche") || ans.equals("Volkswagen")) {
                terminal.appendText(getTime() + ans + "'s statistics at this moment:\n");
                terminal.appendText(getTime() + "Current Value: " + car1.getValue() + "\n");
                terminal.appendText(getTime() + "Highest Value recorded: " + car1.getHighestValue() + "\n");
                terminal.appendText(getTime() + "Highest Value in the last 24 hours: " + car1.getM24High() + "\n");
                terminal.appendText(getTime() + "Lowest Value in the last 24 hours: " + car1.getM24Low() + "\n");
            } else
                terminal.appendText(getTime() + "Make sure you select a Market before you try to get the statistics.\n");
        }
        else
            terminal.appendText(getTime() + "Make sure you select a Market before you try to see the statistics.\n");
    }

    public void saveButtonClicked()
    {
        System.out.println("Clicked!");
    }

    public void amount1ButtonClicked()
    {
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.");}
        else {
            if(amountPressed == false) {
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 1 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction.\n");
                amount = amount + 1;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
            }
            else {
                amount = amount + 1;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount2ButtonClicked()
    {
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.");}
        else {
            if(amountPressed == false) {
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 2 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction.\n");
                amount = amount + 2;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
            }
            else {
                amount = amount + 2;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount5ButtonClicked()
    {
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.");}
        else {
            if(amountPressed == false) {
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 5 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction.\n");
                amount = amount + 5;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
            }
            else {
                amount = amount + 5;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount10ButtonClicked()
    {
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.");}
        else {
            if(amountPressed == false) {
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 10 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction.\n");
                amount = amount + 10;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
            }
            else {
                amount = amount + 10;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount25ButtonClicked()
    {
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.");}
        else {
            if(amountPressed == false) {
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 25 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction.\n");
                amount = amount + 25;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
            }
            else {
                amount = amount + 25;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount100ButtonClicked()
    {
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.");}
        else {
            if(amountPressed == false) {
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 100 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Increase the amount or/and press the " + operationSelected + " button to confirm the transaction.\n");
                amount = amount + 100;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
            }
            else {
                amount = amount + 100;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void portofolioButtonClicked()
    {
        if(isAccountSetup == true) {
            terminal.appendText(getTime() + "\n");
            terminal.appendText(getTime() + "Account registered on the name of " + user1.getUserName() + "\n");
            terminal.appendText(getTime() + "Owns the following:\n");
            terminal.appendText(getTime() + "Money: " + user1.getUserCapital() + " USD\n");
            terminal.appendText(getTime() + "Bitcoin: " + user1.getBitcoin() + "\n");
            terminal.appendText(getTime() + "Litecoin: " + user1.getLitecoin() + "\n");
            terminal.appendText(getTime() + "Ethereum: " + user1.getEthereum() + "\n");
            terminal.appendText(getTime() + "Apple: " + user1.getApple() + "\n");
            terminal.appendText(getTime() + "Google: " + user1.getGoogle() + "\n");
            terminal.appendText(getTime() + "Samsung: " + user1.getSamsung() + "\n");
            terminal.appendText(getTime() + "Porsche: " + user1.getPorsche() + "\n");
            terminal.appendText(getTime() + "Volkswagen: " + user1.getVolkswagen() + "\n");
            terminal.appendText(getTime() + "Audi: " + user1.getAudi() + "\n");
            terminal.appendText(getTime() + "\n");
        }
        else
            terminal.appendText(getTime() + "Make sure you set-up your account before you try to see the portofolio.\n");
    }
}