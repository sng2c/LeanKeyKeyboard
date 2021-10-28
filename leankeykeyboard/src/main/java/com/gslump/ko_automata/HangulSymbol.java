package com.gslump.ko_automata;

import java.util.HashMap;
import java.util.Map;

public class HangulSymbol {
    public final static Map<String, Integer> firstCodeMap = new HashMap<>();
    public final static Map<String, Integer> middleCodeMap = new HashMap<>();
    public final static Map<String, Integer> lastCodeMap = new HashMap<>();
    public final static Map<String, String> firstCombineMap = new HashMap<>();
    public final static Map<String, String> middleCombineMap = new HashMap<>();
    public final static Map<String, String> lastCombineMap = new HashMap<>();

    static {
        firstCodeMap.put("ㄱ", 0);
        firstCodeMap.put("ㄲ", 1);
        firstCodeMap.put("ㄴ", 2);
        firstCodeMap.put("ㄷ", 3);
        firstCodeMap.put("ㄸ", 4);
        firstCodeMap.put("ㄹ", 5);
        firstCodeMap.put("ㅁ", 6);
        firstCodeMap.put("ㅂ", 7);
        firstCodeMap.put("ㅃ", 8);
        firstCodeMap.put("ㅅ", 9);
        firstCodeMap.put("ㅆ", 10);
        firstCodeMap.put("ㅇ", 11);
        firstCodeMap.put("ㅈ", 12);
        firstCodeMap.put("ㅉ", 13);
        firstCodeMap.put("ㅊ", 14);
        firstCodeMap.put("ㅋ", 15);
        firstCodeMap.put("ㅌ", 16);
        firstCodeMap.put("ㅍ", 17);
        firstCodeMap.put("ㅎ", 18);

        middleCodeMap.put("ㅏ", 0);
        middleCodeMap.put("ㅐ", 1);
        middleCodeMap.put("ㅑ", 2);
        middleCodeMap.put("ㅒ", 3);
        middleCodeMap.put("ㅓ", 4);
        middleCodeMap.put("ㅔ", 5);
        middleCodeMap.put("ㅕ", 6);
        middleCodeMap.put("ㅖ", 7);
        middleCodeMap.put("ㅗ", 8);
        middleCodeMap.put("ㅘ", 9);
        middleCodeMap.put("ㅙ", 10);
        middleCodeMap.put("ㅚ", 11);
        middleCodeMap.put("ㅛ", 12);
        middleCodeMap.put("ㅜ", 13);
        middleCodeMap.put("ㅝ", 14);
        middleCodeMap.put("ㅞ", 15);
        middleCodeMap.put("ㅟ", 16);
        middleCodeMap.put("ㅠ", 17);
        middleCodeMap.put("ㅡ", 18);
        middleCodeMap.put("ㅢ", 19);
        middleCodeMap.put("ㅣ", 20);

        lastCodeMap.put(null, 0);
        lastCodeMap.put("ㄱ", 1);
        lastCodeMap.put("ㄲ", 2);
        lastCodeMap.put("ㄳ", 3);
        lastCodeMap.put("ㄴ", 4);
        lastCodeMap.put("ㄵ", 5);
        lastCodeMap.put("ㄶ", 6);
        lastCodeMap.put("ㄷ", 7);
        lastCodeMap.put("ㄹ", 8);
        lastCodeMap.put("ㄺ", 9);
        lastCodeMap.put("ㄻ", 10);
        lastCodeMap.put("ㄼ", 11);
        lastCodeMap.put("ㄽ", 12);
        lastCodeMap.put("ㄾ", 13);
        lastCodeMap.put("ㄿ", 14);
        lastCodeMap.put("ㅀ", 15);
        lastCodeMap.put("ㅁ", 16);
        lastCodeMap.put("ㅂ", 17);
        lastCodeMap.put("ㅄ", 18);
        lastCodeMap.put("ㅅ", 19);
        lastCodeMap.put("ㅆ", 20);
        lastCodeMap.put("ㅇ", 21);
        lastCodeMap.put("ㅈ", 22);
        lastCodeMap.put("ㅊ", 23);
        lastCodeMap.put("ㅋ", 24);
        lastCodeMap.put("ㅌ", 25);
        lastCodeMap.put("ㅍ", 26);
        lastCodeMap.put("ㅎ", 27);

        firstCombineMap.put("ㄱ", "ㄱ");
        firstCombineMap.put("ㄲ", "ㄲ");
        firstCombineMap.put("ㄴ", "ㄴ");
        firstCombineMap.put("ㄷ", "ㄷ");
        firstCombineMap.put("ㄸ", "ㄸ");
        firstCombineMap.put("ㄹ", "ㄹ");
        firstCombineMap.put("ㅁ", "ㅁ");
        firstCombineMap.put("ㅂ", "ㅂ");
        firstCombineMap.put("ㅃ", "ㅃ");
        firstCombineMap.put("ㅅ", "ㅅ");
        firstCombineMap.put("ㅆ", "ㅆ");
        firstCombineMap.put("ㅇ", "ㅇ");
        firstCombineMap.put("ㅈ", "ㅈ");
        firstCombineMap.put("ㅉ", "ㅉ");
        firstCombineMap.put("ㅊ", "ㅊ");
        firstCombineMap.put("ㅋ", "ㅋ");
        firstCombineMap.put("ㅌ", "ㅌ");
        firstCombineMap.put("ㅍ", "ㅍ");
        firstCombineMap.put("ㅎ", "ㅎ");

        middleCombineMap.put("ㅏ", "ㅏ");
        middleCombineMap.put("ㅐ", "ㅐ");
        middleCombineMap.put("ㅑ", "ㅑ");
        middleCombineMap.put("ㅒ", "ㅒ");
        middleCombineMap.put("ㅓ", "ㅓ");
        middleCombineMap.put("ㅔ", "ㅔ");
        middleCombineMap.put("ㅕ", "ㅕ");
        middleCombineMap.put("ㅖ", "ㅖ");
        middleCombineMap.put("ㅗ", "ㅗ");
        middleCombineMap.put("ㅛ", "ㅛ");
        middleCombineMap.put("ㅜ", "ㅜ");
        middleCombineMap.put("ㅠ", "ㅠ");
        middleCombineMap.put("ㅡ", "ㅡ");
        middleCombineMap.put("ㅣ", "ㅣ");
        middleCombineMap.put("ㅗㅏ", "ㅘ");
        middleCombineMap.put("ㅗㅐ", "ㅙ");
        middleCombineMap.put("ㅗㅣ", "ㅚ");
        middleCombineMap.put("ㅜㅓ", "ㅝ");
        middleCombineMap.put("ㅜㅔ", "ㅞ");
        middleCombineMap.put("ㅜㅣ", "ㅟ");
        middleCombineMap.put("ㅡㅣ", "ㅢ");

        lastCombineMap.put("ㄱ", "ㄱ");
        lastCombineMap.put("ㄲ", "ㄲ");
        lastCombineMap.put("ㄴ", "ㄴ");
        lastCombineMap.put("ㄷ", "ㄷ");
        lastCombineMap.put("ㄸ", "ㄸ");
        lastCombineMap.put("ㄹ", "ㄹ");
        lastCombineMap.put("ㅁ", "ㅁ");
        lastCombineMap.put("ㅂ", "ㅂ");
        lastCombineMap.put("ㅃ", "ㅃ");
        lastCombineMap.put("ㅅ", "ㅅ");
        lastCombineMap.put("ㅆ", "ㅆ");
        lastCombineMap.put("ㅇ", "ㅇ");
        lastCombineMap.put("ㅈ", "ㅈ");
        lastCombineMap.put("ㅉ", "ㅉ");
        lastCombineMap.put("ㅊ", "ㅊ");
        lastCombineMap.put("ㅋ", "ㅋ");
        lastCombineMap.put("ㅌ", "ㅌ");
        lastCombineMap.put("ㅍ", "ㅍ");
        lastCombineMap.put("ㅎ", "ㅎ");
        lastCombineMap.put("ㄱㅅ", "ㄳ");
        lastCombineMap.put("ㄴㅈ", "ㄵ");
        lastCombineMap.put("ㄴㅎ", "ㄶ");
        lastCombineMap.put("ㄹㄱ", "ㄺ");
        lastCombineMap.put("ㄹㅁ", "ㄻ");
        lastCombineMap.put("ㄹㅂ", "ㄼ");
        lastCombineMap.put("ㄹㅅ", "ㄽ");
        lastCombineMap.put("ㄹㅌ", "ㄾ");
        lastCombineMap.put("ㄹㅍ", "ㄿ");
        lastCombineMap.put("ㄹㅎ", "ㅀ");
        lastCombineMap.put("ㅂㅅ", "ㅄ");
    }

    public static String compose(String first, String middle, String last) {

//        System.out.println(first + "," + middle + "," + last);

        String combinedFirst = HangulSymbol.firstCombineMap.get(first);
        String combinedMiddle = HangulSymbol.middleCombineMap.get(middle);
        String combinedLast = HangulSymbol.lastCombineMap.get(last);


        boolean firstEmpty = (combinedFirst == null) || combinedFirst.length() == 0;
        boolean middleEmpty = (combinedMiddle == null) || combinedMiddle.length() == 0;
        boolean lastEmpty = (combinedLast == null) || combinedLast.length() == 0;

        if (!firstEmpty && middleEmpty) {
            if (!lastEmpty) {
                return null;
            } else {
                return combinedFirst;
            }
        }
        if (firstEmpty && !middleEmpty) {
            if (!lastEmpty) {
                return null;
            } else {
                return combinedMiddle;
            }
        }
        if (firstEmpty && middleEmpty) {
            return null;
        }


        Integer codeFirst = HangulSymbol.firstCodeMap.get(combinedFirst);
        codeFirst = (codeFirst != null) ? codeFirst : -1;
        Integer codeMiddle = HangulSymbol.middleCodeMap.get(combinedMiddle);
        codeMiddle = (codeMiddle != null) ? codeMiddle : -1;
        Integer codeLast = HangulSymbol.lastCodeMap.get(combinedLast);
        codeLast = (codeLast != null) ? codeLast : -1;


        if (codeFirst == -1 || codeMiddle == -1 || codeLast == -1) {
            return null;
        }

        char conjoined = (char) (0xAC00 + codeFirst * 28 * 21 + codeMiddle * 28 + codeLast);
        System.out.println(codeFirst + "," + codeMiddle + "," + codeLast + " => "+ conjoined);
        System.out.println(first + "," + combinedMiddle + "," + combinedLast + " => "+ conjoined);
        return String.valueOf(conjoined);
    }
}
