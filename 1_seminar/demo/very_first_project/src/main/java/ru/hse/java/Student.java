package ru.hse.java;

import org.jetbrains.annotations.NotNull;

import java.time.ZonedDateTime;
import java.util.regex.Pattern;

/**
 * ФИО, валидация, тесты.
 * АльмаМатер студента - это средняя школа, из которой он выпустился
 */
public class Student implements AlmaMater {
    private static final Pattern NAME_MASK = Pattern.compile("[А-Яа-я ]+");

    static boolean nameIsValid(String name) {
        return NAME_MASK.matcher(name).matches();
    }

    private String name;
    private final ZonedDateTime graduationDate;

    public Student(@NotNull String name, @NotNull ZonedDateTime graduationDate) {
        setName(name);
        this.graduationDate = graduationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!nameIsValid(name)) {
            throw new IllegalArgumentException("Student has not valid by " + NAME_MASK + " pattern.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                '}';
    }

    @Override
    public ZonedDateTime getDateOfGraduation() {
        return graduationDate;
    }
}
