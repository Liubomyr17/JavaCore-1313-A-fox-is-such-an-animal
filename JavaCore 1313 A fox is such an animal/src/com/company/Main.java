package com.company;

/*

1313 A fox is such an animal
1. Implement the Animal interface in the Fox class.
2. Change the code so that there is only one method in the Fox class - getName.
3. You cannot create additional classes and delete methods!

Requirements:
1. The Animal interface must be implemented in the Fox class.
2. Only one method (getName) must be implemented in the Fox class.
3. The getColor method must be declared in the Animal interface.
4. Additional classes or interfaces cannot be created.


 */

import java.awt.*;


public class Main {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}


