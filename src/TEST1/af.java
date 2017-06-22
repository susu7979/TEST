package TEST1;

public class af {
	 public static void main(String[] args){
		 String text="Java Everywhere";
		 System.out.println("第一個a字元:"+(text.indexOf('a')+1));
		 System.out.println("最後一個a字元:"+(text.lastIndexOf('a')+1));
		 System.out.println("第一個Every"+(text.indexOf("Every")+1));
		 System.out.println("最後一個Every:"+(text.lastIndexOf("Every")+1));
		 System.out.println("包括Java"+text.contains("Java"));	
		 System.out.println("開始於Java"+text.startsWith("Java"));
		 System.out.println("結束於Java"+text.endsWith("Java"));
	 }
}