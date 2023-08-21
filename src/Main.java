public class Main {
    public static void main(String[] args) {
        bodyMassIndex bodyMassIndex = new bodyMassIndex();
        int weight = 98;
        double height = 1.87;
        int index = bodyMassIndex. calculate (weight,height );

        System.out.println(index);
    }
}