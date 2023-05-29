package SortingLecture;

public class SortingTypes {
    public static void main(String[] args) {
        int[] array = new int[]{
                4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5
        };
        quickSort(array, 0 , array.length-1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print(binarySearch(array, 3, 0, array.length - 1));
    }

    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value, int min, int max) {
        int midpoint;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }
        if (array[midpoint] < value) {
            return binarySearch(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value) {
                return binarySearch(array, value, min, midpoint - 1);
            } else {
                return array[midpoint];
            }
        }
    }
    public static void quickSort(int[] array, int startPosition, int endPosition){
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition+endPosition)/2];
        do{
            while (array[leftPosition]<array[pivot]) {
                leftPosition++;
            }
            while(array[rightPosition]>array[pivot]){
                rightPosition--;
            }
            if (leftPosition<=rightPosition){
                if(leftPosition<rightPosition){
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while(leftPosition<=rightPosition);
        if(leftPosition<endPosition){
            quickSort(array, leftPosition, endPosition);
        }
        if(startPosition<rightPosition){
            quickSort(array, startPosition,rightPosition);
        }
    }
    public static void heapSort(int[] array){
        for (int i = array.length/2-1; i>=0; i--){
            heapify(array, array.length, i);
        }
        for (int i = array.length-1; i>=0;i--){
            int temp = array[0];
            array[0]=array[i];
            array[i]=temp;
            heapify(array, i,0);
        }
    }
    public static void heapify(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex;
        int leftChild = 2* rootIndex +1;
        int rightChild = 2* rootIndex +2;

        if(leftChild>heapSize && array[leftChild]>array[largest])
            largest = leftChild;

        if(rightChild>heapSize && array[rightChild]>array[largest])
            largest = rightChild;

        if(largest!=rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest]=temp;
            heapify(array,heapSize,largest);
        }


    }
}
