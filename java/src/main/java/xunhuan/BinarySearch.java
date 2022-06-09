package xunhuan;

/**
 * @Author wsl
 * @Date 2022-03-03
 * @Description
 * @Version 1.0
 */
public class BinarySearch {
    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        int middle = (low + high) / 2;            //初始中间位置
        if (arr[middle] > key) {
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }

    }

    public static int binarySerach(int[] a, int target) {

        int low = 0;
        int high = a.length - 1;

        int mid;

        while (low <= high) {

            mid = (low + high) >> 1;//这样写是有问题的，如果low或者high比较大的话,两者的和就会溢出，
            //改进的写法
            // mid = low + (high - low)/2;

            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                high = mid - 1;
            } else if (a[mid] < target) {
                low = mid + 1;
            }
        }

        return -1;
    }

}
