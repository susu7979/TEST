package TEST1;

public class af {
	 public static void main(String[] args){
		 String text="Java Everywhere";
		 System.out.println("�Ĥ@��a�r��:"+(text.indexOf('a')+1));
		 System.out.println("�̫�@��a�r��:"+(text.lastIndexOf('a')+1));
		 System.out.println("�Ĥ@��Every"+(text.indexOf("Every")+1));
		 System.out.println("�̫�@��Every:"+(text.lastIndexOf("Every")+1));
		 System.out.println("�]�AJava"+text.contains("Java"));	
		 System.out.println("�}�l��Java"+text.startsWith("Java"));
		 System.out.println("������Java"+text.endsWith("Java"));
	 }
}