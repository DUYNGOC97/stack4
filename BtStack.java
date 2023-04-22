package stack3;

import java.util.Scanner;
import java.util.Stack;

public class BtStack {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 6, 8};
        Stack<Integer> stack = new Stack<>();
        System.out.println("mang ban dau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.push(arr[i]) + " ");
        }
        System.out.println();
        System.out.println("mang dao nguoc: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
            System.out.print(arr[i] + " ");
        }


    }

}
