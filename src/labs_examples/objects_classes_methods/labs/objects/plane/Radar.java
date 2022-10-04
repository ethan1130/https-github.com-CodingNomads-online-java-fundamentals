package labs_examples.objects_classes_methods.labs.objects.plane;
//AN/APQ-120
public class Radar {
    String type;

    public Radar(String type){

        this.type = type;

    }

    @Override
    public String toString() {
        return "Radar{" +
                "type='" + type + '\'' +
                '}';
    }
}
