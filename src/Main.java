public class Main {
    public static void main(String[] args) {
        doubleFromString(5,val -> Double.valueOf(val));
    }
    public static double doubleFromString(int value, Worker worker) {
        return worker.rework(value);
    }
    public interface Worker {
        double rework(int value);
    }
}