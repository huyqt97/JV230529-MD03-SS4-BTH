public class BTH5 {
    public static void main(String[] args) {
        int[] arr = {44, 12, 7, 8, 13, 6, 9};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " +
                arr[index] +" "+" vị trí index :"+ index);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
