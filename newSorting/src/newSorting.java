public class newSorting {

    public void newSorting(int[] A, int size){

        // Base case
        if(A.length <= size){
            quickSort(A, 0, A.length - 1);
        } else {
            int[] left = new int[A.length / 2];                     // New array created from left side of array to middle index
            int[] right = new int[A.length - left.length];          // New array created from middle + 1 to end of array

            // Copy elements from original array to left
            for(int i = 0; i < left.length; i++){
                left[i] = A[i];
            }

            // Copy elements from original array to right
            for(int i = 0; i < right.length; i++){
                right[i] = A[left.length + i];
            }

            newSorting(left, size);                     // Recursive call for left side of A array
            newSorting(right, size);                    // Recursive call for right side of A array
            mergeSortedHalves(A, left, right);          // Merge sorted halves
        }
    }

    public void quickSort(int[] A, int low, int high){
        int pivot = A[low];         // Pivot will always be index 0
        int i = low;                // Counter for finding elements lower than pivot
        int j = high;               // Counter for finding elements higher than pivot

        // Swap elements based on index
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

        // Swap pivot to middle of array
        A[low] = A[j];
        A[j] = pivot;

        // Recursive call for elements less than pivot
        if(low < j - 1){
            quickSort(A, low, j - 1);
        }

        // Recursive call for elements greater than pivot
        if(j + 1 < high){
            quickSort(A, j + 1, high);
        }
    }

    public void mergeSortedHalves(int[] A, int[] left, int[] right){
        int i = 0, j = 0, k = 0;

        // Merge elements in order
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                A[k++] = left[i++];
            } else{
                A[k++] = right[j++];
            }
        }

        // Copy remaining elements of left if there are any left
        while(i < left.length){
            A[k++] = left[i++];
        }

        // Copy remaining elements of right if there are any left
        while(j < right.length){
            A[k++] = right[j++];
        }
    }
}
