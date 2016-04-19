/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author s1673068
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Foo foo = new Foo(2,3);
        Foo.Bar bar = foo.new Bar(4,1);
        
        bar.print();
        System.out.println("hoi!");
        bar.print();
        
    }
    
}
