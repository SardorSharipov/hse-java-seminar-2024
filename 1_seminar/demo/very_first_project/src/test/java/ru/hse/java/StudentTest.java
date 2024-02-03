package ru.hse.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Test, which checks student group has all almaMaters with graduation date
 */
public class StudentTest {

    @Test
    public void testNameIsValid() {
        String name = "И";
        Assertions.assertTrue(Student.nameIsValid(name));
    }

    @Test
    public void testNameIsInvalid() {
        String name = "I";
        Assertions.assertFalse(Student.nameIsValid(name));
    }

    @Test
    public void testGetGraduationDate() {
        ZonedDateTime graduationDate = ZonedDateTime.of(
                2025,
                6,
                25,
                0,
                0,
                0,
                0,
                ZoneId.systemDefault()
        );
        Student student = new Student("Сардор", graduationDate);
        Assertions.assertEquals(student.getDateOfGraduation(), graduationDate);
    }

}
