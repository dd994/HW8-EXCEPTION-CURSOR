package main.java.outofmemory;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[Integer.MAX_VALUE];
        String str = "aaaaa", b = "bbbbb";

        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            arr[i] = str;
            str += b;
        }
    }
}
