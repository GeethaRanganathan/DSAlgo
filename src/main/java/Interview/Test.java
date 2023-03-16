package Interview;

import java.util.ArrayList;
import java.util.List;

public class Test {
    //1, 2, 4, 3, 0
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,1,-1};

        int[] plSum = new int[arr1.length];
        int[] prSum = new int[arr1.length];
        plSum[0] = arr1[0];
        prSum[arr1.length-1] = arr1[arr1.length-1];
        int j= arr1.length-2;
        for (int i=1;i< arr1.length-1;i++){
            plSum[i] = arr1[i] + plSum[i-1];
            prSum[j] = arr1[j] + arr1[j+1];
            j--;
        }
        int start =0;
        int end =arr1.length-1;
        while(start<end){
            if (plSum[start] == prSum[end]){
                System.out.println(start+1);
            }
            start++;
            end--;
        }
        List names = new ArrayList<>();
        names.add("Gee");
        String name = (String) names.get(0);
        System.out.println(names.get(0));
        names.add(7);
        int number = (int) names.get(1);
        System.out.println(names.get(1));
    }
}
