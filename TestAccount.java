
class Account{  
int acc_no;  
String name;  
float amount;  
//Method to initialize object  
void insert(int a,String n,float amt){  
acc_no=a;  
name=n;  
amount=amt;  
}  
//deposit method  
void deposit(float amt){  
amount=amount+amt;  
System.out.println(amt+" deposited");  
}  
//withdraw method  
void withdraw(float amt){  
if(amount>amt){  
    amount=amount-amt;  
System.out.println(amt+" withdrawn"); 
 
}else{  
 System.out.println("Insufficient Balance"); 
}  

}  
void saving(float amt){  
if(amount>amt){  
    amount +=amt;
System.out.println("saved"+ " "+amt);  
}else{  
// amount=amount+saving;  
System.out.println(" not enoough");  
} } 
//method to check the balance of the account  
void checkBalance(){System.out.println("Balance is: "+amount);}  
//method to display the values of an object  
void display(){System.out.println(acc_no+" "+name+" "+amount);}  
public static void main(String[] args){  
Account a1=new Account();  
a1.insert(832345,"Gilbert",100);  
a1.display();  
a1.checkBalance();  
a1.deposit(1000);  
a1.checkBalance();  
a1.withdraw(200); 
a1.checkBalance();  
a1.saving(300); 
a1.checkBalance(); 
}
}  
