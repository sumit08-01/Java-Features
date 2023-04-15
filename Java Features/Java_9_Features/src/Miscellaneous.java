
interface Sayable{  
    default void say() {  
        saySomething(); 
        System.out.println("default method");
    }  
    
    // Private method inside interface  
    private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
}  

public class Miscellaneous implements Sayable {  
    public static void main(String[] args) {  
        Sayable s = new Miscellaneous();  
        s.say();  
    }  
}  


