package com.my.blog.website;

public class Test {
    @org.junit.Test
    public void ts(){
        String pattern = "u*g";
        String str = " [1]: /upload/2018/05/5bfiktg488ghtqsv1krb4bunq8.jpg [1].jpg";
//        String ss = "\u79fb\u52a8\u4e92\u8054\u7f51\u5e94\u7528 ";
//        String s = StringEscapeUtils.unescapeJava(ss);

        String jieguo = str.substring(str.indexOf("[1]: ")+5,str.indexOf(".jpg")+4);
        System.out.println(jieguo);

        String str1 = "房估字(2014)第12312号";
        String jieguo1 = str1.substring(str1.indexOf("第"),str1.indexOf("号"));
        System.out.println(jieguo1);
    }
}
