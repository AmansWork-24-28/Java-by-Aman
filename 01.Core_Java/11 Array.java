import java.util.* ;

class Array {
    public static void main(String[] args) {
        System.out.println("Array");
        
        // 1way of declaring array
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=5;
        arr[2]=3;
		arr[3]=9
        System.out.println("Array elements "+arr[0]);
        
        // another way of declaring array
        int[] ar1 = {1,2,3,4,5};
        
        // print array
        for(int i=0;i<ar1.length;i++){
             System.out.println("Array elements "+ar1[i]);
        }
        
    }
}