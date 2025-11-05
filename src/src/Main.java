
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int sumDigits(int n){
        if (n%10==n){
            return n;
        }
        return (n%10+sumDigits(n/10));
    }
    public static int binarySearch(int[] arr, int target, int low, int upp){
        int mid = (low+upp)/2;
        if (arr[mid]==target){
            return mid;
        }
        else if (upp-low==1)
            return -1;
        else if (target>arr[mid]){
            return (binarySearch(arr, target, mid+1,upp));
        }
        else if (target<arr[mid]){
            return (binarySearch(arr, target, low, mid-1));
        }
        else return -1;
    }
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int upp = arr.length-1;
        return binarySearch(arr, target, low, upp);
    }
    public static String toBinary(int n){
        if (n==0)
            return "0";
        if (n==1)
            return "1";
        else
            return (toBinary(n/2))+(n%2);
    }
    public static void main(String[] args) {
        System.out.println(toBinary(0)); // 0
        System.out.println(toBinary(1)); // 1
        System.out.println(toBinary(5)); // 101
        System.out.println(toBinary(10)); // 1010
        System.out.println(toBinary(42)); // 101010
    }
}