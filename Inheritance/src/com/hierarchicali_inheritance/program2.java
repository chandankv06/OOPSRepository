package com.hierarchicali_inheritance;
class vehicle{
    String model;
    vehicle(String model){
      this.model=model;
        System.out.println("model type");
    }
}
class bike extends vehicle{
    String model;
    bike(String model){
        super(model);
        System.out.println("bike model"+model);
    }
}
class car extends vehicle{
    String model;
    car(String model){
        super(model);
        System.out.println("bike model"+model);
    }

}
public class program2 {
    public static void main(String args[]){
        bike ob=new bike("hunter");
        car obj=new car("thar");
    }
}
