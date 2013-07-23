package com.drjun.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 7. 23.
 * Time: 오후 3:24
 * To change this template use File | Settings | File Templates.
 */
public class Filtering {

    public static String filterText(String sText)
    {
        Pattern p = Pattern.compile("천재소년|전정일|바보", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(sText);
        StringBuffer buf = new StringBuffer();
        while (m.find())
        {
            m.appendReplacement(buf, maskWord(m.group()));
        }
        m.appendTail(buf);
        return buf.toString();
    }

    public static String maskWord(String str)
    {
        StringBuffer buf = new StringBuffer();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (i < 0)
            {
                buf.append(ch[i]);
            } else {
                buf.append("*");
            }
        }
        return buf.toString();
    }

    public static void main(String[] args)
    {
        String text = "당신은 천재소년 이거나 전정일이거나 바 보 입 니 다.";
        //text = text.replaceAll(" ", "");
        System.out.println(filterText(text));
    }

}
