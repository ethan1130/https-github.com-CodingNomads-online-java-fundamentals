package labs_examples.objects_classes_methods.labs.objects.plane;

//    "F4 Phantom";
//    "McDonnell Douglas";
public class Plane {

    double fuelCapacity = 1994;
    PlaneEngine planeEngine;

    Radar radar;

    String manufacturer;

    String planeName;



    public Plane(PlaneEngine planeEngine, Radar radar, String manufacturer, String planeName){

        this.planeEngine = planeEngine;

        this.radar = radar;

        this.manufacturer = manufacturer;

        this.planeName = planeName;

    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeEngine=" + planeEngine.toString() +
                ",\n radar=" + radar.toString() +
                ",\n manufacturer='" + manufacturer + '\'' +
                ",\n planeName='" + planeName + '\'' +
                '}';
    }
}
