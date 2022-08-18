package baitap1;

import java.util.Scanner;
import java.util.Stack;

public class nhapvao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
//        stack.push(3);
//        stack.push(2);
//        stack.push(34);
        int n=sc.nextInt();
        for(int i = 0; i<n; i++){
           stack.push(sc.nextInt());
        }
        System.out.println(stack);
        for(int i=0;i<n;i++) {
            System.out.print(stack.pop());
//            System.out.println(stack.contains(4));

        }
    }
}
