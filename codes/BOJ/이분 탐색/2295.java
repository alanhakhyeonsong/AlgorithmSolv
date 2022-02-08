// BOJ 2295번: 세 수의 합
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        ArrayList<Integer> twoSum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                twoSum.add(arr[i] + arr[j]);
            }
        }
        Collections.sort(twoSum);
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (binarySearch(twoSum, arr[i]-arr[j])) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }

    public static boolean binarySearch(ArrayList<Integer> list, int target) {
        int lt = 0; int rt = list.size()-1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (list.get(mid) == target) {
                return true;
            } else if (target < list.get(mid)) {
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }
        return false;
    }
}