public class testStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long[] arr = new long[10000000];
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}