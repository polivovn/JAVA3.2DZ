public class Main {
    public static void main(String[] args) {
        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        int weight = 98;
        double height = 1.87;
        int index = BodyMassIndex. calculate (weight,height );
        System.out.println(index);
    }
}
