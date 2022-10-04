package labs_examples.objects_classes_methods.labs.objects.plane;

public class AllComponents {

    public static void main(String[] args){

        PlaneEngine planeEngine = new PlaneEngine(2.2f);

        Radar myRadar = new Radar("AN/APQ-120\n");

        Plane myPlane = new Plane(planeEngine, myRadar, "McDonnell Douglas", "F4 Phantom");

        System.out.println("I fly a " + myPlane.planeName + " " + myPlane.manufacturer + " with a "

                + myPlane.radar.type + "radar, and a mach " + myPlane.planeEngine.machSpeed + " engine, with a " +
                "fuel capacity of " +myPlane.fuelCapacity + " gallons");

    }
}
