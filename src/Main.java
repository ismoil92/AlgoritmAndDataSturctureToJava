public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{12,11,13,5,6,7};

        HeapSort.sort(array);

        System.out.println("Sorted array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
}