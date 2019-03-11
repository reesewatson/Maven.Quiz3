package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {


    public static Boolean hasVowels(String word) {
        Character[] vowels = new Character[] {'A', 'E', 'I', 'O' ,'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            char vowel = vowels[i];
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == vowel) {
                return true;}}}
                return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Character[] vowels = new Character[] {'A', 'E', 'I', 'O' ,'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            char vowel = vowels[i];
        for (int j = 0; j < word.length(); j++) {
        if (word.charAt(j) == vowel) {
            return j; }}}
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        Character[] vowels = new Character[] {'A', 'E', 'I', 'O' ,'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            char vowel = vowels[i];
        if (word.charAt(0) == vowel){
            return true;}}
            return false;
    }


    public static Boolean isVowel(Character character) {
        Character[] vowels = new Character[] {'A', 'E', 'I', 'O' ,'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            char vowel = vowels[i];
        if (character == vowel) {
        return true;}}
        return false;
    }
}
