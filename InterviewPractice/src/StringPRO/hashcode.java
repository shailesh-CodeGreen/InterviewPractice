package StringPRO;

public class hashcode {

	public static void main(String[] args) {
		
		String s = new String ("hello1");
       // s = "hello"; 
       String s1 = "hello1";
        System.out.println(s);
        
      int a=  s.hashCode();
      int b = s1.hashCode();
      System.out.println(a +" "+b);
        
	}

}
