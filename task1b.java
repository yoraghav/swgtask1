
public class task1b {
    public static void main(String[] args){
    }
}

class Truck extends Car{
     int weight;
     int sp;
     public Truck(){}
     void getSaleprice(){
        sp=Saleprice(50);
     }
}
class Car{
    int speed,regularprice;
    String color;
    public Car(){}
    int Saleprice(int discount){
        double k = regularprice;
        k = (1-(discount/100))*k;
        return (int)k;
    }
}
