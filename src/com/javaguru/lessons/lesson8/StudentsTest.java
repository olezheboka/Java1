package com.javaguru.lessons.lesson8;

public class StudentsTest {
    public static void main(String[] args) {
        Student student = new Student();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        System.out.println("STUDENT:");
        student.study();
        System.out.println("JUNIOR:");
        juniorDeveloper.readSpecification();
        juniorDeveloper.writeCode();
        juniorDeveloper.study();
        System.out.println("MIDDLE:");
        middleDeveloper.readSpecification();
        middleDeveloper.writeCode();
        middleDeveloper.study();
        middleDeveloper.codeReview();
        System.out.println("SENIOR:");
        seniorDeveloper.readSpecification();
        seniorDeveloper.writeCode();
        seniorDeveloper.study();
        seniorDeveloper.codeReview();
        seniorDeveloper.solveProblems();

        JuniorDeveloper[] JuniorDevelopers = new JuniorDeveloper[4];
        JuniorDevelopers[0] = middleDeveloper;
        JuniorDevelopers[1] = seniorDeveloper;
        JuniorDevelopers[2] = juniorDeveloper;

        System.out.println();

        for (JuniorDeveloper developer : JuniorDevelopers) {
            developer.study();
            developer.writeCode();
            developer.readSpecification();
        }

        Student[] students = {
                student,
                juniorDeveloper,
                middleDeveloper,
                seniorDeveloper
        };

        for(Student st : students) {
            st.study();

        }

    }
}

