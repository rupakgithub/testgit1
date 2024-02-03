package org.example;

public class Enumexample {
    public static void main(String[] args) {





        switch (BugPriority.HIGH){
            case LOW:
                System.out.println("Take minimmum 3 days to resolve");
                break;
            case MEDIUM:
                System.out.println("Take minimmum 1 days to resolve");
                break;
            case HIGH:
                System.out.println("Take minimmum 4 hours to resolve");
                break;
        }
    }
}

enum BugPriority{
    LOW,
    MEDIUM,
    HIGH
}

class Priority{
    String low = "LOW";
    String medium = "MEDIUM";
    String high = "HIGH";
}
