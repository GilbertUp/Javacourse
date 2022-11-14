// class Student{ 
//     void call ( String name, int Age){ 
//         System.out.printf("The Name of Student is %s, and Age  is %d ",name,Age);
//     }

//     public static void main (String[] args){
//         Student obj1 = new Student();

//         obj1.call("Gilz",23);
//     }
//  }
 

 
 
 
class Student{
    int id;
    String name;
    int age;
     public static void main(String args[]){ 

         Student s1=new Student();  
  Student s2=new Student();  
  //Initializing objects  
  s1.id=101;  
  s1.name="Sonoo";  
  s1.age=20;
  s2.id=102;  
  s2.name="Amit"; 
  s2.age=21; 
  //Printing data  
  System.out.println(s1.id+" "+s1.name +" "+s1.age);  
  System.out.println(s2.id+" "+s2.name+" " +s2.age);  
     }

} 
 