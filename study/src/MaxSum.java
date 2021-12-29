// 최대 연속 부분 구간 합 구하기(종만북 4장 117~119p 참고)

public class MaxSum {
    static int MIN = Integer.MIN_VALUE;
    static int[] arr = {-7, 4, -3, 6, 3, -8, 3, 4};

    public static void main(String[] args) {
        System.out.println("inefficientMaxSum - 결과: " + inefficientMaxSum(arr));
        System.out.println();

        System.out.println("betterMaxSum - 결과: " + betterMaxSum(arr));
        System.out.println();

        int low = 0, high = arr.length-1;
        System.out.println("fastMaxSum - 결과: " + fastMaxSum(arr, low, high));
        System.out.println();

        System.out.println("fastestMaxSum - 결과: " + fastestMaxSum(arr));
        System.out.println();
    }

    /**
     * 주어진 배열의 모든 부분 구간을 순회하면서 합 구하기
     * - 시간 복잡도: O(N^3)
     */
    public static int inefficientMaxSum(int[] arr) {
        int n = arr.length;
        int result = MIN;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    result = Math.max(result, sum);
                }
            }
        }
        return result;
    }

    /**
     * 모든 부분 구간 순회하면서 합 구하기(개선)
     * - 시간 복잡도: O(N^2)
     */
    public static int betterMaxSum(int[] arr) {
        int n = arr.length;
        int result = MIN;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                result = Math.max(result, sum);
            }
        }
        return result;
    }

    /**
     * 분할 정복 기법 적용
     * - 시간 복잡도: O(NlogN)
     */
    public static int fastMaxSum(int[] arr, int lo, int hi) {
        if (lo == hi) return arr[lo];

        int mid = (lo + hi) / 2;

        int lt = MIN, rt = MIN, sum = 0;
        for (int i = mid; i >= lo; i--) {
            sum += arr[i];
            lt = Math.max(lt, sum);
        }

        sum = 0;
        for (int j = mid+1; j <= hi; j++) {
            sum += arr[j];
            rt = Math.max(rt, sum);
        }

        int single = Math.max(fastMaxSum(arr, lo, mid), fastMaxSum(arr, mid+1, hi));
        return Math.max(lt + rt, single);
    }

    /**
     * 동적 계획법 적용
     * arr[i]에서 끝나는 최대 합 부분 구간은 항상 arr[i] 하나만으로 구성되어 있거나,
     * arr[i-1]을 오른쪽 끝으로 갖는 최대 합 부분 구간의 오른쪽에 arr[i]를 붙인 형태로 구성되어 있음을 적용.
     * - 점화식: maxAt(i) = max(0, maxAt(i-1)) + arr[i]
     * - 시간 복잡도: O(N)
     */
    public static int fastestMaxSum(int[] arr) {
        int n = arr.length, result = MIN, dp = 0;
        for (int i = 0; i < n; i++) {
            dp = Math.max(dp, 0) + arr[i];
            result = Math.max(dp, result);
        }
        return result;
    }
}
