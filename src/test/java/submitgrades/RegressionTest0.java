package submitgrades;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

