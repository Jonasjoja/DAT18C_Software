public class CarBrooker
{

   public static void main(String[] args)
   {
      //lav en ny bil
      Car myCar = new Car();
      
      myCar.setCar(4400, 4, "Audi R8", "Min Audi");
      myCar.printCar();
      
      Car car2 = new Car(5000,6,"Tesla","Jaaeeh");
      car2.printCar();
   
      Car myOtherCar = new Car();
      
      //udskriv myOtherCar
      
      myOtherCar.setCar(1000,4,"Kia C/eed","BB27.688");
      myOtherCar.printCar();
      Car bil1 = new Car();
      Car bil2 = new Car();
   
      Car bil10 = new Car();
   }

}