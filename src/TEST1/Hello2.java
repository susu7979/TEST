package TEST1;

public class Hello2{
    private String name;
 
    public Hello2(){
        name = "nobody";
    }
 
    public Hello2(String name){
        this.name = name;
    }
 
    public void hello(){
        System.out.print("Hello ");
        System.out.println(this.name);
    }
 
    public void setName(String name){
        this.name = name;
    }
}