package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Overloading {

    int addition(int a, int b){
        return a + b;
    }

    int addition(int a, int b, int c){
        return a + b + c;
    }

    int addition(double a, double b, double c){
        return ((int)(a + b + c));
    }
}
