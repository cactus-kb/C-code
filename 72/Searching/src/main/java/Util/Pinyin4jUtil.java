package Util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pinyin4jUtil {

    private static final String CHINESE_PATTERN = "[\\u4E00-\\u9FA5]";

    private static final HanyuPinyinOutputFormat FORMAT = new HanyuPinyinOutputFormat();

    static {
        //输出小写
        FORMAT.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //不带音调
        FORMAT.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        //包含字符v
        FORMAT.setVCharType(HanyuPinyinVCharType.WITH_V);
    }

    public static boolean containsChinese(String str) {
        return str.matches(".*" + CHINESE_PATTERN + ".*");
    }


    public static String[] get(String hanyu) {
        String[] array = new String[2];
        StringBuilder pinyin= new StringBuilder();
        StringBuilder pinyin_first = new StringBuilder();
        for (int i = 0; i < hanyu.length(); i++) {
            try {
                String[] pinyins = PinyinHelper.toHanyuPinyinStringArray(hanyu.charAt(i));
                if (pinyins == null || pinyins.length == 0) {
                    pinyin.append(hanyu.charAt(i));
                    pinyin_first.append(hanyu.charAt(i));
                } else {
                    pinyin.append(pinyins[0]);
                    pinyin_first.append(pinyins[0].charAt(0));
                }
            } catch (Exception e) {
                pinyin.append(hanyu.charAt(i));
                pinyin_first.append(hanyu.charAt(i));
            }
        }
        array[0] = pinyin.toString();
        array[1] = pinyin_first.toString();
        return array;
    }

    public static String[][] get(String hanyu, boolean fullSpell) {
        String[][] array = new String[hanyu.length()][];
        for (int i = 0; i < hanyu.length(); i++) {
            try {
                String[] pinyins = PinyinHelper.toHanyuPinyinStringArray(hanyu.charAt(i), FORMAT);
                if (pinyins == null || pinyins.length == 0) {
                    array[i] = new String[]{String.valueOf(hanyu.charAt(i))};
                } else {
                    array[i] = unique(pinyins, fullSpell);
                }
            } catch (Exception e) {//出现异常，返回原始的字符
                array[i] = new String[] {String.valueOf(hanyu.charAt(i))};
            }
        }
        return array;
    }

    private static String[] unique(String[] pinyins, boolean fullSpell) {
        Set<String> set = new HashSet<>();
       for (int i = 0; i < pinyins.length; i++) {
           if (fullSpell) {
               set.add(pinyins[i]);
           } else {
               set.add(String.valueOf(pinyins[i].charAt(0)));
           }
       }
       return set.toArray(new String[set.size()]);
    }

    public static void main(String[] args) {
//        String[] pinyins = get("你好");
//        System.out.println(Arrays.toString(pinyins));
    }
}
