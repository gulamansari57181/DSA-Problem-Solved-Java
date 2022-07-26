import java.util.*;


public class Main{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Lawyer[]l=new Lawyer[n];
        
        for(int i=0;i<n;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            double salary =sc.nextDouble();sc.nextLine();
            int age=sc.nextInt();sc.nextLine();  
            
            l[i]=new Lawyer(id,name, salary,age);  
        }
        
        String lname=sc.nextLine();
        double avgAge=findAverageAgeOfLawyer(l);
            if(avgAge >0.0){
                  System.out.println("Average of age "+avgAge);
    
}
                else{
                System.out.println("No Lawyer found with mentioned attribute.");
    
                }
        
        Lawyer r=searchLawyerByName(l,lname);
        if(r==null){
            
            System.out.println("No Lawyer found with mentioned attribute.");
        }
        else{
            System.out.println("id-"+r.getId());
            System.out.println("name-"+r.getName());
            System.out.println("salary-"+r.getSalary());
            System.out.println("age-"+r.getAge());
              
              
        }

        

}

public static double findAverageAgeOfLawyer(Lawyer[] laws)
{
    double avg=0.0;
    if(laws !=null){
        
        for(int i=0;i<laws.length;i++){
            avg =avg+laws[i].getAge();
        }
        
    }
        if(avg==0.0){
            return 0.0;
        }else{
            return avg/laws.length;
        }
}


public static Lawyer searchLawyerByName(Lawyer[] laws, String lname) 
{

Lawyer m=null;

if(laws !=null && lname.length()>0){
    
    for(int i=0;i<laws.length;i++){
        if(laws[i].getName().equalsIgnoreCase(lname)){
            m=laws[i];
        }
    }
    
}

if(m==null){
    return null;
}
else{
    return m;
}
}

}









class Lawyer
{

int id;
String name;
double salary;
int age;
//Parametarized Constructor
Lawyer(int id , String name, double salary,int age){
    
    
    this.id=id;
    this.name=name;
    this.salary=salary;
    this.age=age;
}
//Setters

public int getId(){
    return id;
}

public String getName(){
    return name;
}

public double getSalary(){
    
    return salary;
}
public int getAge(){
    return age;
}


}