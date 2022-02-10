package com.hilel;

class LecturingEngineer extends Engineer {
    LecturingEngineer(String name, Skill[] skills, Skill[] skillsWantToHave) {
        super(name, skills, skillsWantToHave);
    }

    void lecture(Skill skill) {
        System.out.println("Here is how we do " + skill.name );
        design();
    }
}

