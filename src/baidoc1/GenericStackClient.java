package baidoc1;

public class GenericStackClient {
    private static void stackOfString(){
        MyGenericStack<String> Stack=new MyGenericStack<>();
        Stack.push("huy");
        Stack.push("phong");
        Stack.push("han");
        Stack.pop(0);
        System.out.println(Stack.size());
        while (!Stack.isEmpty()){
            System.out.println("%s"+Stack.pop(0));
        }
        System.out.println(Stack.size());
    }
    private static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println(stack.size());
        System.out.println();
        while (!stack.isEmpty())
        System.out.printf("%s" , stack.pop(1));
        System.out.println();
        System.out.println(stack.size());
    }

    public static void main(String[] args) {
        System.out.println();
        stackOfInteger();
        System.out.println();
        stackOfString();
    }
}
