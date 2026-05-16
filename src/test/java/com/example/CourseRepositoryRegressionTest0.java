package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseRepositoryRegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError(
                        "Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0001");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        java.lang.Class<?> wildcardClass1 = courseRepository0.getClass();
        assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0002");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        java.lang.Class<?> wildcardClass3 = courseRepository0.getClass();
        assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0004");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass3 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0005");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0006");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        java.lang.Class<?> wildcardClass5 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(wildcardClass5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0007");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass5 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0008");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0009");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0010");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0011");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0012");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0013");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0014");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0015");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0016");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0017");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0018");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0019");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0020");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass3 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(wildcardClass3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0021");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0022");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0023");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0024");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0025");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0026");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0027");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0028");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0029");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0030");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0031");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0032");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0033");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0034");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0035");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0036");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0037");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0038");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0039");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0040");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0041");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("hi!");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        java.lang.Class<?> wildcardClass5 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(wildcardClass5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0042");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0043");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0044");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0045");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0046");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0047");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0048");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0049");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0050");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0051");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0052");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0053");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0054");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0055");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0056");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0057");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0058");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0059");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0060");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0061");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0062");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0063");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0064");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0065");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0066");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0067");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0068");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0069");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0070");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0071");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0072");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0073");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0074");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0075");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0076");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0077");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0078");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0079");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0080");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0081");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0082");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0083");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0084");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0085");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0086");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0087");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0088");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0089");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0090");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        java.lang.Class<?> wildcardClass5 = courseRepository0.getClass();
        assertNotNull(wildcardClass5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0091");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0092");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0093");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0094");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0095");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0096");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0097");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0098");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0099");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0100");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0101");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0102");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0103");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0104");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0105");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0106");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0107");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0108");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0109");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0110");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0111");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0112");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0113");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0114");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0115");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0116");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0117");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0118");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0119");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0120");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0121");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0122");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0123");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0124");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0125");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0126");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0127");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0128");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass5 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0129");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0130");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0131");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0132");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0133");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0134");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0135");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("hi!");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0136");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0137");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0138");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0139");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0140");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0141");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0142");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0143");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0144");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0145");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0146");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0147");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0148");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0149");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0150");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("hi!");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0151");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0152");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0153");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0154");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0155");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0156");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0157");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0158");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0159");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0160");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0161");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0162");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0163");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0164");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0165");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0166");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0167");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0168");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass7 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0169");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0170");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0171");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0172");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0173");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0174");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0175");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0176");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0177");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0178");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0179");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0180");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0181");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0182");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0183");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0184");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        com.example.Course course29 = null;
        courseRepository0.addCourse(course29);
        java.lang.Class<?> wildcardClass31 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass31);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0185");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0186");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0187");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0188");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0189");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0190");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0191");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0192");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0193");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0194");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0195");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0196");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0197");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0198");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0199");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("hi!");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0200");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0201");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0202");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0203");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0204");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("hi!");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0205");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0206");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0207");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0208");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0209");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0210");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0211");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0212");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0213");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0214");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0215");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        java.lang.Class<?> wildcardClass29 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass29);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0216");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0217");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0218");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0219");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0220");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0221");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0222");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0223");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0224");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0225");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0226");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0227");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0228");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0229");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0230");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0231");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0232");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0233");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0234");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0235");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0236");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0237");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0238");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0239");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0240");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0241");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0242");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0243");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0244");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0245");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0246");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0247");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0248");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0249");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0250");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0251");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0252");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0253");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0254");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0255");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("");
        boolean boolean26 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0256");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0257");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0258");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0259");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        java.lang.Class<?> wildcardClass29 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(wildcardClass29);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0260");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0261");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0262");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0263");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0264");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0265");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0266");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0267");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0268");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0269");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0270");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("");
        boolean boolean28 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass29 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(wildcardClass29);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0271");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0272");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0273");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0274");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0275");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0276");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0277");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0278");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0279");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0280");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0281");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0282");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0283");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0284");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0285");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0286");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0287");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0288");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0289");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("");
        boolean boolean26 = courseRepository0.existsById("hi!");
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0290");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0291");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0292");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0293");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0294");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0295");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0296");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0297");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0298");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0299");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0300");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0301");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0302");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0303");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0304");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0305");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0306");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0307");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0308");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0309");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0310");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0311");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0312");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        boolean boolean24 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0313");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0314");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0315");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0316");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0317");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0318");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0319");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0320");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0321");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0322");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0323");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0324");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0325");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0326");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0327");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0328");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0329");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0330");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0331");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0332");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0333");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0334");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        boolean boolean24 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0335");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0336");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("");
        boolean boolean28 = courseRepository0.existsById("");
        boolean boolean30 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass31 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertTrue(boolean30 == false, "'" + boolean30 + "' != '" + false + "'");
        assertNotNull(wildcardClass31);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0337");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0338");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0339");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0340");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0341");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0342");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0343");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0344");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0345");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0346");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0347");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0348");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0349");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0350");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0351");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0352");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0353");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0354");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass11 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass11);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0355");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0356");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("");
        boolean boolean26 = courseRepository0.existsById("hi!");
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        java.lang.Class<?> wildcardClass29 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass29);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0357");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0358");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0359");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0360");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0361");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0362");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0363");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0364");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("hi!");
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        java.lang.Class<?> wildcardClass29 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass29);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0365");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0366");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0367");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0368");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0369");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0370");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0371");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0372");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0373");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0374");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0375");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0376");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0377");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0378");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0379");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0380");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0381");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("hi!");
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        com.example.Course course29 = null;
        courseRepository0.addCourse(course29);
        com.example.Course course31 = null;
        courseRepository0.addCourse(course31);
        java.lang.Class<?> wildcardClass33 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass33);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0382");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0383");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0384");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0385");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0386");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0387");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0388");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0389");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("hi!");
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0390");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0391");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0392");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0393");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0394");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0395");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0396");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0397");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0398");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0399");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0400");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0401");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0402");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0403");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0404");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("hi!");
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0405");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0406");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0407");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        boolean boolean24 = courseRepository0.existsById("");
        boolean boolean26 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0408");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("");
        boolean boolean26 = courseRepository0.existsById("hi!");
        boolean boolean28 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass29 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(wildcardClass29);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0409");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0410");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0411");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0412");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0413");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0414");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0415");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0416");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0417");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0418");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        java.lang.Class<?> wildcardClass9 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0419");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0420");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0421");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0422");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0423");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0424");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("hi!");
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        com.example.Course course29 = null;
        courseRepository0.addCourse(course29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0425");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0426");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0427");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0428");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0429");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0430");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0431");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0432");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0433");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0434");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0435");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        com.example.Course course1 = null;
        courseRepository0.addCourse(course1);
        com.example.Course course3 = null;
        courseRepository0.addCourse(course3);
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0436");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0437");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("hi!");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0438");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0439");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0440");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("hi!");
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0441");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0442");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("hi!");
        boolean boolean28 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass29 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(wildcardClass29);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0443");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0444");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0445");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("hi!");
        boolean boolean28 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass29 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(wildcardClass29);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0446");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0447");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0448");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0449");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0450");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0451");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0452");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0453");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0454");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0455");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0456");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0457");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0458");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0459");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0460");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        java.lang.Class<?> wildcardClass15 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0461");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0462");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("");
        boolean boolean28 = courseRepository0.existsById("");
        boolean boolean30 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass31 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertTrue(boolean30 == false, "'" + boolean30 + "' != '" + false + "'");
        assertNotNull(wildcardClass31);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0463");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0464");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0465");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0466");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("");
        boolean boolean26 = courseRepository0.existsById("hi!");
        com.example.Course course27 = null;
        courseRepository0.addCourse(course27);
        com.example.Course course29 = null;
        courseRepository0.addCourse(course29);
        java.lang.Class<?> wildcardClass31 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(wildcardClass31);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0467");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0468");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0469");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0470");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0471");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0472");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0473");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0474");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("");
        boolean boolean8 = courseRepository0.existsById("hi!");
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        java.lang.Class<?> wildcardClass13 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0475");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0476");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass21 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0477");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0478");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0479");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("");
        boolean boolean28 = courseRepository0.existsById("");
        boolean boolean30 = courseRepository0.existsById("hi!");
        boolean boolean32 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass33 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertTrue(boolean30 == false, "'" + boolean30 + "' != '" + false + "'");
        assertTrue(boolean32 == false, "'" + boolean32 + "' != '" + false + "'");
        assertNotNull(wildcardClass33);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0480");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0481");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        boolean boolean24 = courseRepository0.existsById("hi!");
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0482");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0483");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        java.lang.Class<?> wildcardClass23 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0484");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        java.lang.Class<?> wildcardClass25 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0485");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("hi!");
        boolean boolean24 = courseRepository0.existsById("");
        com.example.Course course25 = null;
        courseRepository0.addCourse(course25);
        java.lang.Class<?> wildcardClass27 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(wildcardClass27);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0486");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        boolean boolean20 = courseRepository0.existsById("hi!");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("hi!");
        boolean boolean26 = courseRepository0.existsById("");
        boolean boolean28 = courseRepository0.existsById("");
        boolean boolean30 = courseRepository0.existsById("hi!");
        boolean boolean32 = courseRepository0.existsById("");
        boolean boolean34 = courseRepository0.existsById("");
        boolean boolean36 = courseRepository0.existsById("");
        java.lang.Class<?> wildcardClass37 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertTrue(boolean30 == false, "'" + boolean30 + "' != '" + false + "'");
        assertTrue(boolean32 == false, "'" + boolean32 + "' != '" + false + "'");
        assertTrue(boolean34 == false, "'" + boolean34 + "' != '" + false + "'");
        assertTrue(boolean36 == false, "'" + boolean36 + "' != '" + false + "'");
        assertNotNull(wildcardClass37);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0487");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0488");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        boolean boolean20 = courseRepository0.existsById("");
        boolean boolean22 = courseRepository0.existsById("");
        boolean boolean24 = courseRepository0.existsById("");
        boolean boolean26 = courseRepository0.existsById("hi!");
        boolean boolean28 = courseRepository0.existsById("");
        boolean boolean30 = courseRepository0.existsById("hi!");
        java.lang.Class<?> wildcardClass31 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertTrue(boolean30 == false, "'" + boolean30 + "' != '" + false + "'");
        assertNotNull(wildcardClass31);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0489");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0490");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0491");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0492");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        java.lang.Class<?> wildcardClass19 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0493");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0494");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0495");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        java.lang.Class<?> wildcardClass17 = courseRepository0.getClass();
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(wildcardClass17);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0496");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        com.example.Course course5 = null;
        courseRepository0.addCourse(course5);
        com.example.Course course7 = null;
        courseRepository0.addCourse(course7);
        com.example.Course course9 = null;
        courseRepository0.addCourse(course9);
        com.example.Course course11 = null;
        courseRepository0.addCourse(course11);
        com.example.Course course13 = null;
        courseRepository0.addCourse(course13);
        com.example.Course course15 = null;
        courseRepository0.addCourse(course15);
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        com.example.Course course23 = null;
        courseRepository0.addCourse(course23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0497");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        com.example.Course course21 = null;
        courseRepository0.addCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0498");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("hi!");
        boolean boolean18 = courseRepository0.existsById("hi!");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("hi!");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0499");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("hi!");
        boolean boolean12 = courseRepository0.existsById("");
        boolean boolean14 = courseRepository0.existsById("hi!");
        boolean boolean16 = courseRepository0.existsById("hi!");
        com.example.Course course17 = null;
        courseRepository0.addCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CourseRepositoryRegressionTest0.test0500");
        com.example.CourseRepository courseRepository0 = new com.example.CourseRepository();
        boolean boolean2 = courseRepository0.existsById("");
        boolean boolean4 = courseRepository0.existsById("hi!");
        boolean boolean6 = courseRepository0.existsById("hi!");
        boolean boolean8 = courseRepository0.existsById("hi!");
        boolean boolean10 = courseRepository0.existsById("");
        boolean boolean12 = courseRepository0.existsById("hi!");
        boolean boolean14 = courseRepository0.existsById("");
        boolean boolean16 = courseRepository0.existsById("");
        boolean boolean18 = courseRepository0.existsById("");
        com.example.Course course19 = null;
        courseRepository0.addCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = courseRepository0.existsById("");
            fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.Course.getCourseId()\" because \"course\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }
}
