public class Main {

    public static void main(String[] args) {



        GenericOne<Double> genericDouble = new GenericOne<>();
        genericDouble.setJustOne(22.0);
        genericDouble.setJustOne1(20.0);

        System.out.println(genericDouble.getJustOne());
        System.out.println(genericDouble.getJustOne1());

        genericDouble.addAndIncr();

        // Integer
        GenericOne<Integer> generiInt = new GenericOne<>();
        
        generiInt.setJustOne(4);
        generiInt.setJustOne1(6);
        generiInt.addAndIncr();

    }
}

