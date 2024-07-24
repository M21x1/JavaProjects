public class bankCheckingAccount{
    private String name;
    private int balance;
    private String id;

    public bankCheckingAccount(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public void addFunds(int fundsToAdd){
        balance += fundsToAdd;
    }

    public void getInfo(){
        System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }

    public static void main(String[] args){
        bankCheckingAccount accountOne = new bankCheckingAccount("Zeus", 100, "1");
        bankCheckingAccount accountTwo = new bankCheckingAccount("Hades", 200, "2");
        System.out.println(accountOne.name);
        accountOne.addFunds(5);
        accountOne.getInfo();
    }

}