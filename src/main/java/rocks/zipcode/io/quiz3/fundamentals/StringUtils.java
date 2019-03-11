package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String result = "";
        char nthChar = str.charAt(indexToCapitalize);
        Character.toUpperCase(nthChar);
        result += str.substring(0, indexToCapitalize) + nthChar + str.substring(indexToCapitalize);
        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        baseString = baseString.toLowerCase();
        if (baseString.charAt(indexOfString) == characterToCheckFor) {
        return true; }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String temp;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i <string.length(); i++) {
        for (int j = 1; j <= (string.length() - i); j++) {
        temp = string.substring(i, i + j);
        list.add(temp); }}

        String[] result = list.toArray(new String[list.size()]);
            return result;
    }

    public static Integer getNumberOfSubStrings(String input) {

        return getAllSubStrings(input).length;
    }
    }



