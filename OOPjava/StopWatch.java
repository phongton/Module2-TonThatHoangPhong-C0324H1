package OOPjava;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;

    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return getEndTime()-getStartTime();
    }

    public static void main(String[] args) {
        int []arr = new int[100000];
        for (int i = 0; i < arr.length ;i++) {
            arr[i]= (int) (Math.random()*100000);

        }
        StopWatch stopWatch  = new StopWatch();
        stopWatch.start();
        selectionSort(arr);
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());

    }
    public static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int min = 0;
            for (int j = i+1; j < arr.length ; j++) {
                if(min>arr[j]){
                    min = j;
                }

            }
            int temp= arr[min];
             arr[min] = arr[i];
             arr[i] = temp;


        }

    }
}

