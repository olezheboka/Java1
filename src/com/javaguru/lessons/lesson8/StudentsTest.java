package com.javaguru.lessons.lesson8;

public class StudentsTest {

    public static void main(String[] args) {
        Student student = new Student();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        System.out.println("JUNIOR:");
        juniorDeveloper.readSpecification();
        juniorDeveloper.writeCode();
        juniorDeveloper.study();
        System.out.println();

        System.out.println("MIDDLE:");
        middleDeveloper.readSpecification();
        middleDeveloper.writeCode();
        middleDeveloper.study();
        middleDeveloper.codeReview();
        System.out.println();

        System.out.println("SENIOR:");
        seniorDeveloper.writeCode();
        seniorDeveloper.readSpecification();
        seniorDeveloper.study();
        seniorDeveloper.codeReview();
        seniorDeveloper.solveProblems();

        JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[3];
        juniorDevelopers[0] = juniorDeveloper;
        juniorDevelopers[1] = middleDeveloper;
        juniorDevelopers[2] = seniorDeveloper;

        System.out.println();
        for (JuniorDeveloper developer : juniorDevelopers) {
            developer.study();
            developer.writeCode();
            developer.readSpecification();
        }

        System.out.println();

        Student[] students = {
                student,
                juniorDeveloper,
                middleDeveloper,
                seniorDeveloper
        };

        for (Student st : students) {
            st.study();
        }
    }
}

