package com.hilel;

class Person {
    String name;
    Skill[] skills;
    Skill[] skillsWantToHave;

    public Person(String name, Skill[] skills, Skill[] skillsWantToHave) {
        this.name = name;
        this.skills = skills;
        this.skillsWantToHave = skillsWantToHave;
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}


