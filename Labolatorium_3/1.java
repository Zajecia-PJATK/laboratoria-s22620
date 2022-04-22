class Account{
    private String ID;
    private String name;
    private int balance = 0;
    
    public Account(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }    
    public Account (String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
   }
    
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        balance += amount;
    }
    public void debit(int amount){
        if(amount <= balance){
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account[" + "id=" + ID + ",name=" + name + ",balance=" + balance +"]";
    }
}
