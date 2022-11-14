class Employee{  
    int id;  
    String fullName;  
    float wage;  
    void insert(int i, String n, float s) {  
        id=i;  
       fullName=n;  
        wage=s;  
    }  
    void display(){System.out.println(id+" "+fullName+" "+wage);}  
public static void main(String[] args){
Employee x1=new Employee();  
    Employee x2=new Employee();  
    Employee x3=new Employee();  
    x1.insert(108,"gilbert iturushimbabazi",80000);  
    x2.insert(105,"fidelle ituruhafi",100000);  
    x3.insert(109,"Muhoza John",95000);  
    x1.display();  
    x2.display();  
    x3.display();  

}
     
}  
