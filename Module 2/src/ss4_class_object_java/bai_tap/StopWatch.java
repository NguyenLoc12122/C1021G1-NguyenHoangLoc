package ss4_class_object_java.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public float getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch sc = new StopWatch();
        sc.start();
        System.out.println(sc.getStartTime());
        for (int i = 0; i < 100; i++) {
            sc.stop();
            System.out.println(sc.getEndTime());

        }
        System.out.println(sc.getElapsedTime());
    }
}