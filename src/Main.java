public class Main {

    public static void main(String[] args) {


        // Double
        GenericOne<Double> genericDouble = new GenericOne<>();

        genericDouble.add(22.2, 20.0);
        genericDouble.getValue();

        System.out.println("\n------------Double---------------------");
        System.out.println(genericDouble.getValue());
        System.out.println(genericDouble.getValue2());



        //Integer
        GenericOne<Integer> genericInt = new GenericOne<>();

        genericInt.add(5, 7);
        System.out.println("\n------------Integer---------------------");
        System.out.println(genericInt.getValue());
        System.out.println(genericInt.getValue2());

        //Float
        GenericOne<Float> genericFloat = new GenericOne<>();

        System.out.println("\n------------Float---------------------");
        genericFloat.add(12.12345f, 54321.21f);
        System.out.println(genericFloat.getValue());
        System.out.println(genericFloat.getValue2());
    }
}

