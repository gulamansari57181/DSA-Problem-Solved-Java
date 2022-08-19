

// Lets start again to learn OOPs in java

//Task : Create MotorBike java Class and a couple of objects

public class MotorBike {

    public static void main(String []args){
    //   Creating two instances
    MotorBikeRunner ferrari = new MotorBikeRunner();

    //Calling method via objects
         ferrari.start();
         ferrari.stop();
    

    }
    
}


class MotorBikeRunner {

    public  void start(){
        System.out.println("MotorBike has started");
    }

    public void stop(){
        System.out.println("MotorBike has been  stopped");
    }
    
}
 


