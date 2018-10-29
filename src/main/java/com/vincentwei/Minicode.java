package com.vincentwei;

public class Minicode {

    private static String threeInsteadStr = "Fizz";
    private static String fiveInsteadStr = "Buzz";
    private static String togetherStr = threeInsteadStr + fiveInsteadStr;

    /**
     * 需求1
     */
    public void stageOne() {

        System.out.println("=====stage one start=====");
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(togetherStr);
            } else if (i % 3 == 0) {
                System.out.println(threeInsteadStr);
            } else if (i % 5 == 0) {
                System.out.println(fiveInsteadStr);
            } else {
                System.out.println(i);
            }

        }
        System.out.println("=====stage one end =====");

    }

    /**
     * 需求2
     */
    public void stageTwo() {

        System.out.println("=====stage two start=====");
        for (int i = 1; i <= 100; i++) {
            String tempStr = String.valueOf(i);
            Boolean firstCondition = i % 3 == 0 || tempStr.contains("3");
            Boolean secondCondition = i % 5 == 0 || tempStr.contains("5");
            if (firstCondition && secondCondition) {
                System.out.println(togetherStr);
            } else if (firstCondition) {
                System.out.println(threeInsteadStr);
            } else if (secondCondition) {
                System.out.println(fiveInsteadStr);
            } else {
                System.out.println(i);
            }
        }
        System.out.println("=====stage two end=====");

    }

}
