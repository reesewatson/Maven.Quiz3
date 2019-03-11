package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue(Integer[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
        int oddValue = intArray[i] % 2 != 0;
        if (intArray[i] == oddValue) {
        return oddValue;}}
    }

    public SomeType findEvenOccurringValue(Integer[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
        int evenValue = intArray[i] % 2 == 0;
        if (intArray[i] == evenValue) {
        return evenValue;}}
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
//        public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
//        int count = 0;
//        for (int i = 0; i < valueToEvaluate.length; i++) {
//            if (valueToEvaluate[i].equals(objectToCount)) {
//                count++;
//            }
//        }return count;
        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
