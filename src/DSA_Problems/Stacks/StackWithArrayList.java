package DSA_Problems.Stacks;

import java.util.ArrayList;

public class StackWithArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.isEmpty();
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top = list.getLast();
            list.removeLast();

            return top;
        }

        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.getLast();
        }
    }

    public static void main(String[]args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
