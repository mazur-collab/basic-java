package com.hilel;

public class Engineer extends Person {
    public Engineer(String name, Skill[] skills, Skill[] skillsWantToHave) {
        super(name, skills, skillsWantToHave);
    }

    String design(){
        return "beautiful piece of code";
    }
}


