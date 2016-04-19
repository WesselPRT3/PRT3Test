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
public class Foo {
    private int x, y;
    
    public class Bar {
        private int z, w;
        
        public Bar(int z, int w) {
            this.z = x+z;
            this.w = y+w;
        }
        
        public void print() {
            System.out.println("z: " + z + ", w: " + w);
        }
    }
    
    
    public Foo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
