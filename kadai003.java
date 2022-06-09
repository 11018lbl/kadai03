import java.io.UnsupportedEncodingException;
import java.util.Arrays;


public class kadai003 {
  public static void main(String[] args){
    String str = args[0];
    System.out.println(str);
    codecheck(str);
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
}
