public class Account {
    private int accountNo;
    private String name ;
    private  float amount ;
     public void insert(int accountNo , String name , float amount){
         this.accountNo = accountNo;
         this.name = name;
         this.amount = amount;
     }
     // إيداع
   public void deposit(float amount){
         this.amount = this.amount + amount;
       System.out.println(amount+" deposited");
     }
        //سحب
     public void withdraw(float amount){
        if (this.amount < amount) {
            System.out.println("Insufficient Balance");
        }
            else{
                this.amount = this.amount - amount;
            System.out.println(amount+" withdrawn");
        }
     }
     public void checkBalance(){
         System.out.println("your balance is:"+this.amount);
     }
     public String toString(){
         return "Account{"+"accountNo="+ accountNo +", name="+ name + ", amount"+ amount;
     }
}
