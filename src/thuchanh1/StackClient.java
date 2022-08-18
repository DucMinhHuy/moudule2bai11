package thuchanh1;

public class StackClient {

        public static void main (String[]args)throws Exception {

        MyStack stack=new MyStack(5);
        stack.push(3);
        stack.push(4);
        stack.push(34);
            System.out.println(stack.size());
            while (!stack.isEmply()){
                System.out.print(stack.pop(2)+",");
            }
    }
}
