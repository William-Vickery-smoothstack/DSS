package com.company;

class singleton {
    String s;                                       //I gave the class a string property to confirm the property is accessible among references
    private static volatile singleton instance;     //creates a reference to an object `instance`
    private singleton() {}                          //a private constructor is needed to ensure a new object cannot be created
    public static singleton getInstance() {
        if (instance == null) {                     //first check if reference `instance` made earlier is a null reference
            synchronized (singleton.class) {        //syncs access to specified object
                if (instance == null){              //second check if reference `instance` made earlier is a null reference
                    instance = new singleton();     //if true then and only then will a new instance of the class be made
                }
            }

        }
        return instance;                            //returns the reference of `instance`
    }
}
