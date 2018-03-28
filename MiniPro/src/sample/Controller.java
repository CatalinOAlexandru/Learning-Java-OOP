 package sample;

 import java.util.*;
 import java.text.*;
 import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 import javafx.scene.control.TextArea;
 import javafx.scene.control.TextField;
 import sample.Market;
 import java.net.*;
 import java.io.*;

 public class Controller
{
    public static String getTime()
    {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss");
        return ("[" + ft.format(dNow)+ "] ");
    }

    public static String getTimeDate()
    {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("hh.mm.ss"+"_"+"dd-MM-yyyy");
        return (ft.format(dNow));
    }

    public double getValue()
    {
        Double value = 0.0;
        if (ans.equals("Bitcoin") || ans.equals("Litecoin") || ans.equals("Ethereum")) {

            value = Coin1.getM24Low();
        } else if (ans.equals("Apple") || ans.equals("Google") || ans.equals("Samsung")) {
            value =  tech1.getM24Low();
        } else if (ans.equals("Audi") || ans.equals("Porsche") || ans.equals("Volkswagen")) {
            value = car1.getM24Low();
        } else
            terminal.appendText(getTime() + "ERROR 05: Can't get value.\n");
        return value;
    }

    public String getNameDate()
    {
        String ans = name + "_" + getTimeDate() + "_";
        return ans;
    }

    public void resetSelection()
    {
        amount = 0;
        totalAmount.setText(String.valueOf(amount));
        amountPressed = false;
        operationSelected = "";
        marketSelected = false;
    }

    protected @FXML TextArea terminal;
    protected @FXML TextField userName;
    protected @FXML TextField userMoney;
    protected @FXML TextField totalAmount;

    protected static boolean accountSetUp = false;
    protected static boolean marketSelected = false;
    protected static Portofolio user1;
    protected static Market Coin1;
    protected static Market car1;
    protected static Market tech1;

    protected static String ans = "";
    protected static int amount = 0;
    protected static String operationSelected = "";
    private boolean isAccountSetup = false;
    private boolean confirmButtonPressed = false;
    private boolean amountPressed = false;
    private String name ="";

    private ArrayList<String> analytics = new ArrayList<String>();


    public void setupButtonClicked()
    {
        analytics.add("setupButton Clicked\r\n");
        if(isAccountSetup == false) {
            name = userName.getText();
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
        analytics.add("bitcoinButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else
        {
            Coin1 = new Bitcoin();
            ans = "Bitcoin";
            terminal.appendText(getTime() + "Bitcoin market selected.\n");
            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void ethereumButtonClicked()
    {
        analytics.add("ethereumButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Coin1 = new Ethereum();
            ans = "Ethereum";
            terminal.appendText(getTime() + "Ethereum market selected.\n");
            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void litecoinButtonClicked()
    {
        analytics.add("litecoinButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            Coin1 = new Litecoin();
            ans = "Litecoin";
            terminal.appendText(getTime() + "Litecoin market selected.\n");
            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void appleButtonClicked()
    {
        terminal.appendText(getTime() + "Apple market selected.\n");
        analytics.add("appleButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            double currentPrice = getCurrentValue();
            terminal.appendText(getTime() + "Current Price: "+ currentPrice +" USD \n");
            double volume = 0;
            //terminal.appendText(getTime() + "Volume: "+ volume +"\n");
            double highestValue = getHighestValue();
            terminal.appendText(getTime() + "Highest value recorded: "+ highestValue +" USD \n");
            double high24 = getH24Value();
            terminal.appendText(getTime() + "Highest value in the last 24 hours: "+ high24 +" USD \n");
            double low24 = getL24Value();
            terminal.appendText(getTime() + "Lowest value in the last 24 hours: "+ low24 +" USD \n");


            tech1 = new Apple(currentPrice, highestValue, volume, high24, low24);
            ans = "Apple";

            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void samsungButtonClicked()
    {
        analytics.add("samsungButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            tech1 = new Samsung();
            ans = "Samsung";
            terminal.appendText(getTime() + "Samsung market selected.\n");
            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void googleButtonClicked()
    {
        analytics.add("googleButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            tech1 = new Google();
            ans = "Google";
            terminal.appendText(getTime() + "Google market selected.\n");
            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void audiButtonClicked()
    {
        analytics.add("audiButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            car1 = new Audi();
            ans = "Audi";
            terminal.appendText(getTime() + "Audi market selected.\n");
            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void porscheButtonClicked()
    {
        analytics.add("porscheButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            car1 = new Porsche();
            ans = "Porsche";
            terminal.appendText(getTime() + "Porsche market selected.\n");
            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void volkswagenButtonClicked()
    {
        analytics.add("volkswagenButton Clicked\r\n");
        if(accountSetUp == false)
        {terminal.appendText(getTime() + "You have to set-up your account first\n");}
        else {
            car1 = new Volkswagen();
            ans = "Volkswagen";
            terminal.appendText(getTime() + "Volkswagen market selected.\n");
            marketSelected = true;
            operationSelected = "";
            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
        }
    }

    public void buyButtonClicked()
    {
        analytics.add("buyButton Clicked\r\n");
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
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setBitcoin(user1.getBitcoin() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Litecoin")){
                newCapital = Coin1.buy(amount, user1.getUserCapital(), ans);
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setLitecoin(user1.getLitecoin() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Ethereum")){
                newCapital = Coin1.buy(amount, user1.getUserCapital(), ans);
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setEthereum(user1.getEthereum() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Porsche")){
                newCapital = car1.buy(amount, user1.getUserCapital(), ans);
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setPorsche(user1.getPorsche() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Volkswagen")){
                newCapital = car1.buy(amount, user1.getUserCapital(), ans);
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setWolkswagen(user1.getVolkswagen() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Audi")){
                newCapital = car1.buy(amount, user1.getUserCapital(), ans);
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setAudi(user1.getAudi() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Apple")){
                newCapital = tech1.buy(amount, user1.getUserCapital(), ans);
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setApple(user1.getApple() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Google")){
                newCapital = tech1.buy(amount, user1.getUserCapital(), ans);
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setGoogle(user1.getGoogle() + amount);
                user1.setUserCapital(newCapital);}
            else if(ans.equals("Samsung")){
                newCapital = tech1.buy(amount, user1.getUserCapital(), ans);
                if(newCapital == -9999.01) {resetSelection(); return;}
                user1.setSamsung(user1.getSamsung() + amount);
                user1.setUserCapital(newCapital);}
            else
                terminal.appendText(getTime() + "ERROR 07: There was an Error. The value was not saved into your account.");

            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
            operationSelected = "";
            marketSelected = false;
        }
        else
        { terminal.appendText(getTime() + "ERROR 01: There was an Error in buying method.\n");}


    }

    public void sellButtonClicked()
    {
        analytics.add("sellButton Clicked\r\n");
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
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setBitcoin(user1.getBitcoin() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Litecoin")){
                newCapital = Coin1.sell(amount, user1.getUserCapital(), ans, user1.getLitecoin());
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setLitecoin(user1.getLitecoin() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Ethereum")){
                newCapital = Coin1.sell(amount, user1.getUserCapital(), ans, user1.getEthereum());
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setEthereum(user1.getEthereum() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Porsche")){
                newCapital = car1.sell(amount, user1.getUserCapital(), ans, user1.getPorsche());
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setPorsche(user1.getPorsche() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Volkswagen")){
                newCapital = car1.sell(amount, user1.getUserCapital(), ans, user1.getVolkswagen());
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setWolkswagen(user1.getVolkswagen() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Audi")){
                newCapital = car1.sell(amount, user1.getUserCapital(), ans, user1.getAudi());
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setAudi(user1.getAudi() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Apple")){
                newCapital = tech1.sell(amount, user1.getUserCapital(), ans, user1.getApple());
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setApple(user1.getApple() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Google")){
                newCapital = tech1.sell(amount, user1.getUserCapital(), ans, user1.getGoogle());
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setGoogle(user1.getGoogle() - amount);
                    user1.setUserCapital(newCapital);}}
            else if(ans.equals("Samsung")){
                newCapital = tech1.sell(amount, user1.getUserCapital(), ans, user1.getSamsung());
                if(newCapital == -9999.01) {resetSelection(); return;}
                else{
                    user1.setSamsung(user1.getSamsung() - amount);
                    user1.setUserCapital(newCapital);}}
            else
                terminal.appendText(getTime() + "ERROR 06: The value was not saved into your account.\n");

            amount = 0;
            totalAmount.setText(String.valueOf(amount));
            amountPressed = false;
            operationSelected = "";
            marketSelected = false;
        }
        else
        { terminal.appendText(getTime() + "ERROR 02: There was an Error in selling method.\n");}


    }

    public void statisticsButtonClicked()
    {
        analytics.add("statisticsButton Clicked\r\n");
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

    public double getPrice(String ans, int amount)
    {
        double total;
        if (ans.equals("Bitcoin") || ans.equals("Litecoin") || ans.equals("Ethereum"))
        {
            total = amount * Coin1.getValue();
        }
        else if (ans.equals("Apple") || ans.equals("Google") || ans.equals("Samsung"))
        {
            total = amount * tech1.getValue();
        }
        else if (ans.equals("Audi") || ans.equals("Porsche") || ans.equals("Volkswagen"))
        {
            total = amount * car1.getValue();
        }
        else
        {
            total = 0;
            terminal.appendText(getTime() + "ERROR 08: method getPrice\n");
        }
        return total;
    }

    public String getValuesOfTerminal(){
        return terminal.getText();
    }

    public ArrayList<String> getAnalytics() {return analytics;}

    public void printInTerminal() { terminal.appendText(getTime() + "The Application was closed.\n");}

    public void saveButtonClicked() throws IOException
    {
        analytics.add("saveButton Clicked\r\n");
        if(isAccountSetup == true) {
            String fileName = name +"_"+getTimeDate();

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Accounts/"+fileName+"_account.txt"), "utf-8"))) {
                writer.write("Account registered on the name of " + user1.getUserName() + "\r\n");
                writer.write("Owns the following:\r\n");
                writer.write("Money: " + user1.getUserCapital() + " USD\r\n");
                writer.write("Bitcoin: " + user1.getBitcoin() + "\r\n");
                writer.write("Litecoin: " + user1.getLitecoin() + "\r\n");
                writer.write("Ethereum: " + user1.getEthereum() + "\r\n");
                writer.write("Apple: " + user1.getApple() + "\r\n");
                writer.write("Google: " + user1.getGoogle() + "\r\n");
                writer.write("Samsung: " + user1.getSamsung() + "\r\n");
                writer.write("Porsche: " + user1.getPorsche() + "\r\n");
                writer.write("Volkswagen: " + user1.getVolkswagen() + "\r\n");
                writer.write("Audi: " + user1.getAudi() + "\r\n");
                writer.write("\r\n");
                writer.close();

                terminal.appendText(getTime() + "The account was saved.\n");
            }catch(Exception e){
                terminal.appendText(getTime() + "ERROR 03: The account was not saved.\n");
                System.out.println(e.getMessage());
            }


        }
        else
            terminal.appendText(getTime() + "Make sure the account is fully set-up before you try to save it.\n");
    }

    public void amount1ButtonClicked()
    {
        analytics.add("amount1Button Clicked\r\n");
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.\n");}
        else {
            if(amountPressed == false) {
                amount = amount + 1;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 1 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction of "+ getPrice(ans, amount) +" USD.\n");
            }
            else {
                amount = amount + 1;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount2ButtonClicked()
    {
        analytics.add("amount2Button Clicked\r\n");
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.\n");}
        else {
            if(amountPressed == false) {
                amount = amount + 2;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 2 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction of "+ getPrice(ans, amount) +" USD.\n");
            }
            else {
                amount = amount + 2;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount5ButtonClicked()
    {
        analytics.add("amount5Button Clicked\r\n");
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.\n");}
        else {
            if(amountPressed == false) {
                amount = amount + 5;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 5 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction of "+ getPrice(ans, amount) +" USD.\n");
            }
            else {
                amount = amount + 5;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount10ButtonClicked()
    {
        analytics.add("amount10Button Clicked\r\n");
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.\n");}
        else {
            if(amountPressed == false) {
                amount = amount + 10;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 10 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction of "+ getPrice(ans, amount) +" USD.\n");
            }
            else {
                amount = amount + 10;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount25ButtonClicked()
    {
        analytics.add("amount25Button Clicked\r\n");
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.\n");}
        else {
            if(amountPressed == false) {
                amount = amount + 25;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 25 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction of "+ getPrice(ans, amount) +" USD.\n");
            }
            else {
                amount = amount + 25;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void amount100ButtonClicked()
    {
        analytics.add("amount100Button Clicked\r\n");
        if (operationSelected == "")
        {terminal.appendText(getTime() + "Please make sure you press the Buy/Sell button before selecting an amount.\n");}
        else {
            if(amountPressed == false) {
                amount = amount + 100;
                totalAmount.setText(String.valueOf(amount));
                amountPressed = true;
                terminal.appendText(getTime() + "You selected to " + operationSelected + " 100 coin/share of " + ans + ".\n");
                terminal.appendText(getTime() + "Press the " + operationSelected + " button to confirm the transaction of "+ getPrice(ans, amount) +" USD.\n");
            }
            else {
                amount = amount + 100;
                totalAmount.setText(String.valueOf(amount));
            }
        }
    }

    public void portofolioButtonClicked()
    {
        analytics.add("portofolioButton Clicked\r\n");
        if(isAccountSetup == true) {
            terminal.appendText(getTime() + "\n");
            terminal.appendText(getTime() + "Account registered on the name of " + user1.getUserName() + "\n");
            terminal.appendText(getTime() + "Owns the following:\n");
            terminal.appendText(getTime() + "Money: " + user1.getUserCapital() + " USD\n");
            terminal.appendText(getTime() + "Bitcoin: " + user1.getBitcoin() + "\n");
            terminal.appendText(getTime() + "Ethereum: " + user1.getEthereum() + "\n");
            terminal.appendText(getTime() + "Litecoin: " + user1.getLitecoin() + "\n");
            terminal.appendText(getTime() + "Apple: " + user1.getApple() + "\n");
            terminal.appendText(getTime() + "Google: " + user1.getGoogle() + "\n");
            terminal.appendText(getTime() + "Samsung: " + user1.getSamsung() + "\n");
            terminal.appendText(getTime() + "Audi: " + user1.getAudi() + "\n");
            terminal.appendText(getTime() + "Porsche: " + user1.getPorsche() + "\n");
            terminal.appendText(getTime() + "Volkswagen: " + user1.getVolkswagen() + "\n");
            terminal.appendText(getTime() + "\n");
        }
        else
            terminal.appendText(getTime() + "Make sure you set-up your account before you try to see the portofolio.\n");
    }

    public void resetButtonClicked() {
        analytics.add("resetButton Clicked\r\n");
        amount = 0;
        totalAmount.setText(String.valueOf(amount));
        amountPressed = false;
        operationSelected = "";
        terminal.appendText(getTime() + "You cancelled the operation.\n");
    }

    public double getCurrentValue()
    {
        double priceDouble = 0;
        String price = "Not Found";
        try {
            final String SYM = "AAPL";
            URL url = new URL("https://www.nasdaq.com/symbol/aapl/real-time");
            URLConnection urlConn = url.openConnection();
            InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
            BufferedReader buff = new BufferedReader(inStream);

            int i = 0;

            String line = buff.readLine();
            while (line != null) {
                if (i == 0 && line.contains("quotes_content_left__LastSale")) {
                    System.out.println(line);
                    i++;

                    int target = line.indexOf("quotes_content_left__LastSale");
                    int decipoint = line.indexOf(".", target);
                    int start = decipoint;
                    int end = decipoint;

                    while (line.charAt(start) != '>') {
                        start--;
                    }
                    while (line.charAt(end) != '<') {
                        end++;
                    }
                    price = line.substring(start + 1, end);

                    System.out.println("Price found: " + price);
                }
                line = buff.readLine();
            }
            priceDouble = Double.parseDouble(price);
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }
        return priceDouble;
    }

    public double getRealVolume()
    {
        String price = "Not Found";
        try {
            final String SYM = "AAPL";
            URL url = new URL("https://www.nasdaq.com/symbol/aapl/real-time");
            URLConnection urlConn = url.openConnection();
            InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
            BufferedReader buff = new BufferedReader(inStream);

            int i = 0;

            String line = buff.readLine();
            while (line != null) {
                if (i == 0 && line.contains("quotes_content_left__Volume")) {
                    System.out.println(line);
                    i++;

                    int target = line.indexOf("quotes_content_left__Volume");
                    int decipoint = line.indexOf(",", target);
                    int start = decipoint;
                    int end = decipoint;

                    while (line.charAt(start) != '>') {
                        start--;
                    }
                    while (line.charAt(end) != '<') {
                        end++;
                    }
                    price = line.substring(start + 1, end);

                    System.out.println("Price found: " + price);
                }
                line = buff.readLine();
            }
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }
        price = price.replace(",","");
        double priceDouble = Double.parseDouble(price);
        return priceDouble;
    }

    public double getH24Value()
    {
        String price = "Not Found";
        try {
            final String SYM = "AAPL";
            URL url = new URL("https://www.nasdaq.com/symbol/aapl/real-time");
            URLConnection urlConn = url.openConnection();
            InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
            BufferedReader buff = new BufferedReader(inStream);

            int i = 0;

            String line = buff.readLine();
            while (line != null) {
                if (i == 0 && line.contains("quotes_content_left__TodaysHigh")) {
                    System.out.println(line);
                    i++;

                    int target = line.indexOf("quotes_content_left__TodaysHigh");
                    int decipoint = line.indexOf(".", target);
                    int start = decipoint;
                    int end = decipoint;

                    while (line.charAt(start) != '>') {
                        start--;
                    }
                    while (line.charAt(end) != '<') {
                        end++;
                    }
                    price = line.substring(start + 1, end);

                    System.out.println("Price found: " + price);
                }
                line = buff.readLine();
            }
        }
        catch (Exception e)
        {
            return 0.0;
        }
        price = price.replace("$", "");
        double priceDouble = Double.parseDouble(price);
        return priceDouble;
    }

    public double getL24Value()
    {
        String price = "Not Found";
        try {
            final String SYM = "AAPL";
            URL url = new URL("https://www.nasdaq.com/symbol/aapl/real-time");
            URLConnection urlConn = url.openConnection();
            InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
            BufferedReader buff = new BufferedReader(inStream);

            int i = 0;

            String line = buff.readLine();
            while (line != null) {
                if (i == 0 && line.contains("quotes_content_left__TodaysLow")) {
                    System.out.println(line);
                    i++;

                    int target = line.indexOf("quotes_content_left__TodaysLow");
                    int decipoint = line.indexOf(".", target);
                    int start = decipoint;
                    int end = decipoint;

                    while (line.charAt(start) != '>') {
                        start--;
                    }
                    while (line.charAt(end) != '<') {
                        end++;
                    }
                    price = line.substring(start + 1, end);

                    System.out.println("Price found: " + price);
                }
                line = buff.readLine();
            }
        }
        catch (Exception e)
        {
            return 0.0;
        }
        price = price.replace("$", "");
        double priceDouble = Double.parseDouble(price);
        return priceDouble;
    }

    public double getHighestValue()
    {
        String price = "Not Found";
        try {
            final String SYM = "AAPL";
            URL url = new URL("https://www.nasdaq.com/symbol/aapl/real-time");
            URLConnection urlConn = url.openConnection();
            InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
            BufferedReader buff = new BufferedReader(inStream);

            int i = 0;

            String line = buff.readLine();
            while (line != null) {
                if (i == 0 && line.contains("quotes_content_left__52WeekHigh")) {
                    System.out.println(line);
                    i++;

                    int target = line.indexOf("quotes_content_left__52WeekHigh");
                    int decipoint = line.indexOf(".", target);
                    int start = decipoint;
                    int end = decipoint;

                    while (line.charAt(start) != '>') {
                        start--;
                    }
                    while (line.charAt(end) != '<') {
                        end++;
                    }
                    price = line.substring(start + 1, end);

                    System.out.println("Price found: " + price);
                }
                line = buff.readLine();
            }
        }
        catch (Exception e)
        {
            return 0.0;
        }
        price = price.replace("$", "");
        double priceDouble = Double.parseDouble(price);
        return priceDouble;
    }
}