import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GradeServiceRandoopTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test01");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        java.lang.Class<?> wildcardClass1 = gradeService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test02");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "", "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test03");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "", "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test04");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "", "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test05");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test06");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "hi!", "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test07");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "", "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test09");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Final grade cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test10");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "hi!", "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test11");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "hi!", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test12");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student is not enrolled in this course.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test13");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "", "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test14");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "", "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test15");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test16");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "hi!", "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test17");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test18");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "", "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test19");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Final grade cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test20");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "", "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test21");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "hi!", "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test22");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "hi!", "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test23");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student is not enrolled in this course.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test24");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "hi!", "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test25");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test26");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        java.lang.Class<?> wildcardClass7 = gradeService0.getClass();
        org.junit.Assert.assertNotNull(grade6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test27");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "", "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test28");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test29");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test30");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "", "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test31");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        java.lang.Class<?> wildcardClass7 = grade6.getClass();
        org.junit.Assert.assertNotNull(grade6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test32");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "hi!", "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Final grade cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test33");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "", "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test34");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "hi!", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Final grade cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test35");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: All required assessments must be recorded before submitting the final grade.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test36");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "hi!", "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test37");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "", "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test38");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "", "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test39");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "", "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test40");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "hi!", "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test41");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "", "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test42");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Final grade cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test43");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "", "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test44");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "", "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test45");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "hi!", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test46");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "", "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test47");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "", "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test48");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "hi!", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test49");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test50");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "hi!", "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test51");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "", "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test52");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "", "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test53");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "hi!", "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test54");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "hi!", "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Final grade cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test55");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grade already submitted for this student in this course.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test56");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "", "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test57");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "hi!", "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test58");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test59");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "hi!", "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student is not enrolled in this course.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test60");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "hi!", "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test61");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("", "hi!", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test62");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "hi!", "hi!", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student is not enrolled in this course.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test63");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("", "", "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Course ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test64");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "hi!", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Final grade cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test65");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: All required assessments must be recorded before submitting the final grade.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test66");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Final grade cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeServiceRandoopTest0.test67");
        submitgrades.GradeService gradeService0 = new submitgrades.GradeService();
        submitgrades.Grade grade6 = gradeService0.submitGrade("hi!", "hi!", "hi!", true, true);
        // The following exception was thrown during execution in test generation
        try {
            submitgrades.Grade grade12 = gradeService0.submitGrade("hi!", "", "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Student ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(grade6);
    }
}

