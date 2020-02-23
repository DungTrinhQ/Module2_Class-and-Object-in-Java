public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){

    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void end(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}