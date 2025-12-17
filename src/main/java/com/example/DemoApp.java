package com.example;

import org.apache.commons.collections.CollectionUtils;
import java.util.Arrays;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("SBOM Analysis Demo Application");
        
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("B", "C", "D");
        
        boolean equal = CollectionUtils.isEqualCollection(list1, list2);
        System.out.println("Collections are equal: " + equal);
        
        // Использование уязвимой библиотеки для демонстрации
        try {
            // Простой код, использующий зависимости
            System.out.println("Demo completed successfully");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
