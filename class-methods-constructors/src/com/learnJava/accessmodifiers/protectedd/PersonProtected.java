package com.learnJava.accessmodifiers.protectedd;

/**
 * Created by z001qgd on 1/16/18.
 */
public class PersonProtected {

    protected String gender;
    public String name;

    protected String getName(){

        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

}
