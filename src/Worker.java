public interface Worker {
    default void work() { // строка 1
        getWorking();
    }

    private static void getWorking() {
        System.out.println("Working");
    }

    void workHard(String s);
}
