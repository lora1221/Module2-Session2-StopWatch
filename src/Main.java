public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random());
        }

        System.out.println("Start time: "+stopWatch.getStartTime());
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("End time: "+ stopWatch.getEndTime());
        System.out.println("Time to operate: "+ stopWatch.getElapsedTime());
    }
}
