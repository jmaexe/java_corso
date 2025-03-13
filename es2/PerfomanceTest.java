public class PerfomanceTest {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Integer sumBoxed = 0;
        for (Integer i = 0; i < 1_000_000; i++) {
            sumBoxed += i;
        }
        long endTime = System.nanoTime();
        System.out.println("Boxed sum :\t" + sumBoxed + "\t");
        System.out.println("Time:\t" + (endTime - startTime) + "ns");
        System.out.println();
        startTime = System.nanoTime();
        int sumPrimitive = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sumPrimitive += i;
        }
        endTime = System.nanoTime();

        System.out.println("Primitive sum:\t" + sumPrimitive + "\t");
        System.out.println("Time : \t" + (endTime - startTime) + "ns");
    }

}
