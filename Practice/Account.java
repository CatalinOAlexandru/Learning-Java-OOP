public class Account
{
//instance variables
private double balance;

//constructors
 public Account(double initialBalance) {
 balance = initialBalance;
 }

 public Account() {
 balance = 0.0;
 } 
 //instance methods
 public void withdraw(double amount) {
 balance -=amount;
 }
 public void deposit(double amount) {
 balance +=amount;
 }
 public double getBalance() {
 return balance;
 }
 public void close() {
 balance = 0.0;
 }
}