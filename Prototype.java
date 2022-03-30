import java.security.MessageDigest;


public class Prototype {

  static void hash(String x){
    try{
    System.out.println(x);
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(x.getBytes());
    byte[] encodedhash = md.digest();
    System.out.println(encodedhash);

     StringBuffer hexString = new StringBuffer();
      for (int i = 0;i<encodedhash.length;i++) {
         hexString.append(Integer.toHexString(0xFF & encodedhash[i]));
       }
      System.out.println("Hex format : " + hexString.toString());

    }catch(Exception e){
    }
  }



  public static void main(String[] args) {
    String p1 = "wysiwyg0";
    String p2 = "marymary";
    String p3 = "abcd1234";

    hash(p1); 

    }

}
