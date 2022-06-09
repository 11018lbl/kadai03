import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.regex.Pattern;


public class kadai003 {
  public static void main(String[] args){
    String str = args[0];
    System.out.println(str);
    codecheck(str);
    excheck(str);
  }

  public static void codecheck(String x){
    try {
           byte[] bytes = x.getBytes("UTF-8");
           if(x.equals(new String(bytes,"UTF-16"))){
             System.out.println("UTF-16");
           }else if(x.equals(new String(bytes,"UTF-8"))){
             System.out.println("UTF-8");
           }else if(x.equals(new String(bytes,"ASCII"))){
             System.out.println("ASCII");
           }else if(x.equals(new String(bytes,"SJIS"))){
             System.out.println("SJIS");
           }else if(x.equals(new String(bytes,"JIS"))){
             System.out.println("JIS");
           }else{
             System.out.println("不明");
           }

       } catch (UnsupportedEncodingException e) {
           e.printStackTrace();
       }

  }

  public static void excheck(String x){
    String pattern1 = "\n";
    Pattern p1 = Pattern.compile(pattern1);
    String pattern2 = "\r";
    Pattern p2 = Pattern.compile(pattern2);
    String pattern3 = "\r\n";
    Pattern p3 = Pattern.compile(pattern3);

    if(p3.matcher(x).find()){
      System.out.println("CRLF");
    }else{
      if(p1.matcher(x).find()){
        System.out.println("LF");
      }else if(p2.matcher(x).find()){
        System.out.println("CR");
      }else{
        System.out.println("検出不能");
      }
    }
  }
}
