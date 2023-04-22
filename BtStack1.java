package stack3;

import java.util.Scanner;
import java.util.Stack;

public class BtStack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi can dao nguoc: ");
        String inputString = sc.nextLine();
        String reversedString = reverseString(inputString);
//        System.out.println("chuoi dao nguoc: "+reversedString);

    }
    public static String reverseString(String inputString){
        Stack<String> wStack = new Stack<>();
        String[] words = inputString.split(" ");
        for(String word:words) {
            wStack.push(word);
        }
        System.out.println("chuoi da dao nguoc: ");
        String[] arr = new String[wStack.size()];
        int n = wStack.size();
        for (int i = 0; i<n;i++){
            arr[i]=wStack.pop();
            System.out.print(arr[i]+" ");
        }

//        StringBuilder reversedString = new StringBuilder();
//        while (!wStack.isEmpty()){
//            String word = wStack.pop();
//            reversedString.append(word).append(" ");
//        }
        return arr.toString().trim();
    }

}
