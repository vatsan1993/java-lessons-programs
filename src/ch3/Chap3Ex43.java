package ch3;

// largest consecutive values count.
public class Chap3Ex43 {
    public static void main(String[] args) {
        int[] arr= {3,6,3,7,47,3,4,5, 7,8,9,10, 5,6};
        int maxCount= 1;
        for(int i=0 ; i< arr.length; i++){
            int count= 1;
            for(int j= i; j< arr.length-1; j++){ // arr.length-1 as we dont want to reach last value with j, as j+1 will give us error
                if(arr[j]+1== arr[j+1]){
                    count++;
                    if(count>maxCount){
                        maxCount= count;
                    }
                }
                else{
                    count=1;
                    i= j; // after scanning multiple values, j goes ahead. to make i follow after scanned values we are resetting i (for efficiency)
                    break; // we dont want the j loop to check everything in the array for each outer loop.
                }
            }
        }
        System.out.println(maxCount);

    }
}
