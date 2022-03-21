package Models;

public class MinimunAndMaximum {
    public static void main(String[] args) {
        Integer minimunValue = getMinimumValue(1,2);
        Integer maximumValue = getMaximumValue(2,3);
        System.out.println("Minimum value: "+ minimunValue);
        System.out.println("Maximum value: "+ maximumValue);

    }
    public static Integer getMinimumValue(Integer value1, Integer value2) {
        return Math.min(value1,value2);
    }

    public static Integer getMaximumValue(Integer value1, Integer value2) {
        return Math.max(value1,value2);
    }
}
