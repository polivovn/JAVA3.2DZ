public class bodyMassIndex {
    public int calculate(int weight, double height ) {
        int bodyMassindex = (int) (weight/(height * height));
        return bodyMassindex;
    }
}

