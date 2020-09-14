
import java.io.IOException;
import java.lang.reflect.Method;


import java.io.IOException;
import java.lang.reflect.Method;

class Printer {
    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

public class Solution {