package com.creatingObjectUsingNewInstance;

class MyClass {
    private int value;
    
    public MyClass() {
        this.value = 0;
    }
    
    public MyClass(int value) {
        this.value = value;
    }
    
    public void printValue() {
        System.out.println("Value: " + value);
    }
}

public class NewInstanceCreatingObject {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MyClass obj1 = new MyClass();
        obj1.printValue();
        
        MyClass obj2 = MyClass.class.newInstance();
        obj2.printValue();
        
        MyClass class1 = new MyClass(9);
       class1.printValue();
       
//       MyClass class2 = MyClass.class.newInstance(5);
        
    }
}
