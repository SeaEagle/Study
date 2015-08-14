package cn.eaglefire.study.niuke;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by zhenghy on 2015/8/14.
 */
public class Niuke {

    public String replaceSpace(String iniString, int length) {
        Pattern p = Pattern.compile("\\b[a-zA-Z]+?\\b");
        String[] iniStrings = iniString.split("");
        System.out.println(iniStrings.length);
        return "";
    }

    @Test
    public void testReplacement(){
        String str1 = "Mr  John  Smith",str2 = "Mr%20John%20Smith";
        Assert.assertEquals(str2, replaceSpace(str1, str1.length()));
    }

}
