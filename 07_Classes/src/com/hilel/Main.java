package com.hilel;

public class Main {

    public static void main(String[] args) {

        LecturingEngineer gregoryMazur = new LecturingEngineer("Gregory Mazur",
        new Skill[]{new Skill("Java", true), new Skill("Eating apples", false),
                new Skill("Javascript", true)},
        new Skill[] {new Skill("Python", true), new Skill("Paint pictures", true)});

        LecturingEngineer ivan = new LecturingEngineer("Ivan",
                                 new Skill[]{new Skill("Machine Learning", true)},
                                 new Skill[]{new Skill("Java", true)});

        Person[] persons = {gregoryMazur, ivan};

        for (Person personWhoShare : persons) {
            for (Person personWhoIsLookingForSkill : persons) {
                if (personWhoShare.name.equals(personWhoIsLookingForSkill.name)){
                    //if it is the same person let's skip
                    continue;
                }
                Skill foundSkill = getSkillThatCanBeExchanged(personWhoShare, personWhoIsLookingForSkill);
                if (foundSkill != null) {
                    if (personWhoShare instanceof LecturingEngineer) {
                        ((LecturingEngineer) personWhoShare).lecture(foundSkill);
                    }
                }
            }
        }
    }

    public static Skill getSkillThatCanBeExchanged(Person personWhoShare, Person personWhoIsLookingForSkill) {
        for (Skill knownSkill : personWhoShare.skills) {
            if (!knownSkill.isTechnical) {
                continue;
            }
            for (Skill desiredSkill : personWhoIsLookingForSkill.skillsWantToHave) {
                if (knownSkill.name.equals(desiredSkill.name)) {
                    System.out.println(personWhoShare.name + " can share his knowledge of " +
                                               knownSkill.name + " with " + personWhoIsLookingForSkill.name);
                    return knownSkill;
                }
            }
        }
        return null;
    }




}
