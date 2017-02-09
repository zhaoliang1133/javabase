package com.java.regex;

/**
 * Created by zhaoliang on 2016/12/15.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 正则表达式定义了字符串的模式。
 正则表达式可以用来搜索、编辑或处理文本。
 正则表达式并不仅限于某一种语言，但是在每种语言中有细微的差别。
 Java 正则表达式和 Perl 的是最为相似的。
 */
public class RegexTest {
    public static void main( String args[] ){

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
