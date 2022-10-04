package labs_examples.objects_classes_methods.labs.objects.plane;

//    General Electric J79
public class PlaneEngine {
     float machSpeed;

    public PlaneEngine(float machSpeed){

        this.machSpeed = machSpeed;

    }

    @Override
    public String toString() {
        return "PlaneEngine{" +
                "machSpeed=" + machSpeed +
                '}';
    }
}
