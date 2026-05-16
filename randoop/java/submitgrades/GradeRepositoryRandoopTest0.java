import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GradeRepositoryRandoopTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test002");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        java.lang.Class<?> wildcardClass12 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test003");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        java.lang.Class<?> wildcardClass3 = gradeRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test004");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass10 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test005");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        java.lang.Class<?> wildcardClass6 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test006");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        java.lang.Class<?> wildcardClass12 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test007");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass10 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test008");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test009");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        java.lang.Class<?> wildcardClass12 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test010");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test011");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test012");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test013");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test014");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test015");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test016");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test017");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test018");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        java.lang.Class<?> wildcardClass18 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test019");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test020");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test021");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test022");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test023");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        java.lang.Class<?> wildcardClass17 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test024");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test025");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test026");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test027");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        java.lang.Class<?> wildcardClass20 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test028");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test029");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test030");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test031");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test032");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test033");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test034");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        java.lang.Class<?> wildcardClass5 = gradeRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test035");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test036");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test037");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        java.lang.Class<?> wildcardClass11 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test038");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test039");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        java.lang.Class<?> wildcardClass9 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test040");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test041");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test042");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        java.lang.Class<?> wildcardClass21 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test043");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test044");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass10 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test045");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test046");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test047");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test048");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test049");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        java.lang.Class<?> wildcardClass20 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test050");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test051");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test052");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test053");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        java.lang.Class<?> wildcardClass18 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test054");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test055");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test056");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test057");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass4 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test058");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test059");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass4 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test060");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        java.lang.Class<?> wildcardClass18 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test061");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        java.lang.Class<?> wildcardClass11 = gradeRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test062");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test063");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test064");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test065");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test066");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test067");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test068");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test069");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        java.lang.Class<?> wildcardClass24 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test070");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        java.lang.Class<?> wildcardClass1 = gradeRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test071");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test072");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        java.lang.Class<?> wildcardClass18 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test073");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        java.lang.Class<?> wildcardClass8 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test074");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test075");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test076");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        java.lang.Class<?> wildcardClass21 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test077");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        java.lang.Class<?> wildcardClass14 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test078");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test079");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test080");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test081");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test082");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test083");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        submitgrades.Grade grade26 = null;
        gradeRepository0.addGrade(grade26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test084");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test085");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test086");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test087");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        java.lang.Class<?> wildcardClass24 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test088");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test089");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test090");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        java.lang.Class<?> wildcardClass14 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test091");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test092");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test093");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test094");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test095");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test096");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test097");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        java.lang.Class<?> wildcardClass6 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test098");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test099");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test100");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test101");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test102");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test103");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test104");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test105");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test106");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test107");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        java.lang.Class<?> wildcardClass9 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test108");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test109");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test110");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test111");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        submitgrades.Grade grade26 = null;
        gradeRepository0.addGrade(grade26);
        java.lang.Class<?> wildcardClass28 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test112");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test113");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test114");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test115");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test116");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        submitgrades.Grade grade26 = null;
        gradeRepository0.addGrade(grade26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test117");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test118");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test119");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test120");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test121");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test122");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test123");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        java.lang.Class<?> wildcardClass17 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test124");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        java.lang.Class<?> wildcardClass9 = gradeRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test125");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test126");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        java.lang.Class<?> wildcardClass23 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test127");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test128");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test129");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test130");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test131");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test132");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test133");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test134");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test135");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        submitgrades.Grade grade8 = null;
        gradeRepository0.addGrade(grade8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test136");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test137");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        java.lang.Class<?> wildcardClass18 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test138");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test139");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass10 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test140");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass10 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test141");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test142");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        java.lang.Class<?> wildcardClass21 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test143");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test144");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test145");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test146");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test147");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test148");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test149");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        java.lang.Class<?> wildcardClass23 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test150");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test151");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test152");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        java.lang.Class<?> wildcardClass11 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test153");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        java.lang.Class<?> wildcardClass6 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test154");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        java.lang.Class<?> wildcardClass14 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test155");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test156");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test157");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        java.lang.Class<?> wildcardClass20 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test158");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass25 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test159");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        java.lang.Class<?> wildcardClass24 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test160");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test161");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        java.lang.Class<?> wildcardClass27 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test162");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test163");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test164");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test165");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test166");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test167");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test168");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test169");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test170");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test171");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test172");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        java.lang.Class<?> wildcardClass18 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test173");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test174");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test175");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test176");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test177");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test178");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        java.lang.Class<?> wildcardClass11 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test179");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test180");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass10 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test181");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test182");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test183");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test184");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test185");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test186");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test187");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test188");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        submitgrades.Grade grade8 = null;
        gradeRepository0.addGrade(grade8);
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test189");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test190");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test191");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test192");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test193");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test194");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test195");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean27 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean30 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean33 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test196");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test197");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test198");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        submitgrades.Grade grade8 = null;
        gradeRepository0.addGrade(grade8);
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test199");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        submitgrades.Grade grade23 = null;
        gradeRepository0.addGrade(grade23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test200");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test201");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean27 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean30 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test202");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        submitgrades.Grade grade26 = null;
        gradeRepository0.addGrade(grade26);
        submitgrades.Grade grade28 = null;
        gradeRepository0.addGrade(grade28);
        java.lang.Class<?> wildcardClass30 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test203");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test204");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test205");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        submitgrades.Grade grade26 = null;
        gradeRepository0.addGrade(grade26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test206");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass4 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test207");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test208");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test209");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test210");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test211");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test212");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        java.lang.Class<?> wildcardClass17 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test213");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test214");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test215");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        java.lang.Class<?> wildcardClass23 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test216");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test217");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass25 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test218");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass25 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test219");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test220");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test221");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test222");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test223");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test224");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test225");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test226");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test227");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test228");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test229");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test230");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        submitgrades.Grade grade8 = null;
        gradeRepository0.addGrade(grade8);
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        java.lang.Class<?> wildcardClass14 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test231");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test232");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        java.lang.Class<?> wildcardClass24 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test233");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test234");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test235");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test236");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test237");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test238");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test239");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test240");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test241");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        java.lang.Class<?> wildcardClass18 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test242");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test243");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test244");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        submitgrades.Grade grade26 = null;
        gradeRepository0.addGrade(grade26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test245");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test246");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test247");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        java.lang.Class<?> wildcardClass20 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test248");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test249");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        java.lang.Class<?> wildcardClass24 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test250");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test251");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        submitgrades.Grade grade26 = null;
        gradeRepository0.addGrade(grade26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test252");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test253");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        java.lang.Class<?> wildcardClass14 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test254");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        submitgrades.Grade grade8 = null;
        gradeRepository0.addGrade(grade8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test255");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        submitgrades.Grade grade8 = null;
        gradeRepository0.addGrade(grade8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test256");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test257");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test258");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        submitgrades.Grade grade26 = null;
        gradeRepository0.addGrade(grade26);
        submitgrades.Grade grade28 = null;
        gradeRepository0.addGrade(grade28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test259");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test260");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test261");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        java.lang.Class<?> wildcardClass12 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test262");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test263");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        java.lang.Class<?> wildcardClass23 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test264");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        java.lang.Class<?> wildcardClass8 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test265");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test266");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test267");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test268");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test269");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test270");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass25 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test271");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test272");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        java.lang.Class<?> wildcardClass17 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test273");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test274");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean27 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean30 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test275");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        submitgrades.Grade grade23 = null;
        gradeRepository0.addGrade(grade23);
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test276");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        submitgrades.Grade grade23 = null;
        gradeRepository0.addGrade(grade23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test277");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        java.lang.Class<?> wildcardClass23 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test278");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test279");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test280");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test281");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        java.lang.Class<?> wildcardClass18 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test282");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test283");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test284");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        java.lang.Class<?> wildcardClass14 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test285");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test286");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean27 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test287");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test288");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test289");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test290");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test291");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test292");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test293");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test294");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test295");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test296");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test297");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test298");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        java.lang.Class<?> wildcardClass24 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test299");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test300");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        java.lang.Class<?> wildcardClass15 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test301");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        submitgrades.Grade grade23 = null;
        gradeRepository0.addGrade(grade23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test302");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test303");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test304");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test305");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test306");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean27 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean30 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean33 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass34 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test307");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test308");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        submitgrades.Grade grade27 = null;
        gradeRepository0.addGrade(grade27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test309");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test310");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        java.lang.Class<?> wildcardClass8 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test311");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test312");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test313");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test314");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        submitgrades.Grade grade22 = null;
        gradeRepository0.addGrade(grade22);
        submitgrades.Grade grade24 = null;
        gradeRepository0.addGrade(grade24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test315");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        java.lang.Class<?> wildcardClass12 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test316");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test317");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gradeRepository0.existsByStudentAndCourse("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test318");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test319");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test320");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        submitgrades.Grade grade23 = null;
        gradeRepository0.addGrade(grade23);
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        submitgrades.Grade grade27 = null;
        gradeRepository0.addGrade(grade27);
        submitgrades.Grade grade29 = null;
        gradeRepository0.addGrade(grade29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test321");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test322");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        submitgrades.Grade grade20 = null;
        gradeRepository0.addGrade(grade20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test323");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        java.lang.Class<?> wildcardClass13 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test324");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test325");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        java.lang.Class<?> wildcardClass22 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test326");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        java.lang.Class<?> wildcardClass16 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test327");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test328");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test329");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        submitgrades.Grade grade23 = null;
        gradeRepository0.addGrade(grade23);
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        submitgrades.Grade grade27 = null;
        gradeRepository0.addGrade(grade27);
        java.lang.Class<?> wildcardClass29 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test330");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test331");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        java.lang.Class<?> wildcardClass17 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test332");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        submitgrades.Grade grade12 = null;
        gradeRepository0.addGrade(grade12);
        submitgrades.Grade grade14 = null;
        gradeRepository0.addGrade(grade14);
        submitgrades.Grade grade16 = null;
        gradeRepository0.addGrade(grade16);
        submitgrades.Grade grade18 = null;
        gradeRepository0.addGrade(grade18);
        java.lang.Class<?> wildcardClass20 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test333");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade4 = null;
        gradeRepository0.addGrade(grade4);
        submitgrades.Grade grade6 = null;
        gradeRepository0.addGrade(grade6);
        submitgrades.Grade grade8 = null;
        gradeRepository0.addGrade(grade8);
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test334");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        submitgrades.Grade grade21 = null;
        gradeRepository0.addGrade(grade21);
        submitgrades.Grade grade23 = null;
        gradeRepository0.addGrade(grade23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test335");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        submitgrades.Grade grade15 = null;
        gradeRepository0.addGrade(grade15);
        submitgrades.Grade grade17 = null;
        gradeRepository0.addGrade(grade17);
        submitgrades.Grade grade19 = null;
        gradeRepository0.addGrade(grade19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test336");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test337");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean21 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean24 = gradeRepository0.existsByStudentAndCourse("", "");
        submitgrades.Grade grade25 = null;
        gradeRepository0.addGrade(grade25);
        submitgrades.Grade grade27 = null;
        gradeRepository0.addGrade(grade27);
        java.lang.Class<?> wildcardClass29 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test338");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        submitgrades.Grade grade13 = null;
        gradeRepository0.addGrade(grade13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test339");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = gradeRepository0.existsByStudentAndCourse("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test340");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        submitgrades.Grade grade10 = null;
        gradeRepository0.addGrade(grade10);
        java.lang.Class<?> wildcardClass12 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test341");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test342");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        submitgrades.Grade grade1 = null;
        gradeRepository0.addGrade(grade1);
        submitgrades.Grade grade3 = null;
        gradeRepository0.addGrade(grade3);
        submitgrades.Grade grade5 = null;
        gradeRepository0.addGrade(grade5);
        submitgrades.Grade grade7 = null;
        gradeRepository0.addGrade(grade7);
        submitgrades.Grade grade9 = null;
        gradeRepository0.addGrade(grade9);
        submitgrades.Grade grade11 = null;
        gradeRepository0.addGrade(grade11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = gradeRepository0.existsByStudentAndCourse("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"submitgrades.Grade.getStudentId()\" because \"grade\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRepositoryRandoopTest0.test343");
        submitgrades.GradeRepository gradeRepository0 = new submitgrades.GradeRepository();
        boolean boolean3 = gradeRepository0.existsByStudentAndCourse("", "hi!");
        boolean boolean6 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean9 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean12 = gradeRepository0.existsByStudentAndCourse("hi!", "");
        boolean boolean15 = gradeRepository0.existsByStudentAndCourse("hi!", "hi!");
        boolean boolean18 = gradeRepository0.existsByStudentAndCourse("", "");
        java.lang.Class<?> wildcardClass19 = gradeRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

