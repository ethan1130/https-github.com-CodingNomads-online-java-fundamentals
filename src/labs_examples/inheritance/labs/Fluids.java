package labs_examples.inheritance.labs;

public class Fluids extends Externals {
     private int fuelTankCapacity;
     private int wiperFluidCapacity;

     public int getFuelTankCapacity() {
          return fuelTankCapacity;
     }

     public int getWiperFluidCapacity() {
          return wiperFluidCapacity;
     }

     public void setFuelTankCapacity(int fuelTankCapacity) {
          this.fuelTankCapacity = 20;
     }
     public void setWiperFluidCapacity(int trunkDoor) {
          this.wiperFluidCapacity = 10;
     }
}
