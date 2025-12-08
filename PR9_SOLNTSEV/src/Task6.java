import java.awt.*;
import java.io.File;
import java.util.Random;

public class Task6 {
    public static class StopWatch {
        private long startTime;
        private long endTime;
        public StopWatch() {
            startTime = System.currentTimeMillis();
        }
        public void start() {
            startTime = System.currentTimeMillis();
        }
        public void stop() {
            endTime = System.currentTimeMillis();
        }
        public long getElapsedTime() {
            return endTime - startTime;
        }
        public long getStartTime() {
            return startTime;
        }
        public long getEndTime() {
            return endTime;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        sw.stop();
        System.out.println("Время сортировки: " + sw.getElapsedTime() + " мс");
    }
}
