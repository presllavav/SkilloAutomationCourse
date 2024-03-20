package main.java.Homework2.lesson8;

public class Person {
    String name;
    char sex;
    String religion;
    String language;
    String job;
    String nationality;
    String egn;
    LocalDate dateOfBirth;
    int age;
    String country;

    public Person(String name, char sex, String religion, String language, String job, String nationality, String egn, String country) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.egn = validateEGN(egn);
        this.country = country;
    }
    private String validateEGN(String egn) {
        if (egn.length() == 10 && contatinOnlyDigits(egn)) {
            return egn;
        } else {
            throw new IllegalArgumentException("The provided EGN is not valid! The EGN must contain only 10 digits!");
        }



    }

    private boolean contatinOnlyDigits(String egn) {
        try {
            return long.parseLong(egn) > 0;

        } catch (NumberFormatException e) {
            return false;
        }

    }
}
