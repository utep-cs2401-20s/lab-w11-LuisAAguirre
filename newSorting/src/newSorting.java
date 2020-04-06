public class newSorting {

    public static void newSorting(int[] A, int size){
        if(A.length <= size){
            quickSort(A, 0, A.length - 1);
        } else {
            int[] left = new int[A.length / 2];
            int[] right = new int[A.length - left.length];

            for(int i = 0; i < left.length; i++){
                left[i] = A[i];
            }
            for(int i = 0; i < right.length; i++){
                right[i] = A[left.length + i];
            }
            newSorting(left, size);
            newSorting(right, size);
            mergeSortedHalves(A, left, right);
        }
    }

    public static void quickSort(int[] A, int low, int high){
        int pivot = A[low];
        int i = low;
        int j = high;

        while(i < j){
            while(A[i] <= pivot && i < j){
                i++;
            }
            while(A[j] > pivot){
                j--;
            }
            if(i < j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        A[low] = A[j];
        A[j] = pivot;

        if(low < j - 1){
            quickSort(A, low, j - 1);
        }

        if(j + 1 < high){
            quickSort(A, j + 1, high);
        }
    }

    public static void mergeSortedHalves(int[] A, int[] left, int[] right){
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                A[k++] = left[i++];
            } else{
                A[k++] = right[j++];
            }
        }

        while(i < left.length){
            A[k++] = left[i++];
        }

        while(j < right.length){
            A[k++] = right[j++];
        }
    }
}
