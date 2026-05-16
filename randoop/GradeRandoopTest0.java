import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GradeRandoopTest0 {

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
            System.out.format("%n%s%n", "GradeRandoopTest0.test001");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test003");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass8 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test004");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test005");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass8 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test006");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test007");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test008");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass8 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test009");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test010");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test011");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test012");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test013");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test014");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test015");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test016");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass8 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test017");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test018");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test019");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.String str11 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass12 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str11, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test020");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test021");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test022");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.String str11 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str11, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test023");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.Class<?> wildcardClass11 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test024");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test025");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.String str11 = grade5.getStudentId();
        java.lang.Class<?> wildcardClass12 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test026");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getGradeDetails();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.Class<?> wildcardClass11 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test027");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test028");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test029");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test030");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test031");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        java.lang.String str11 = grade5.getStudentId();
        java.lang.String str12 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test032");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test033");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.Class<?> wildcardClass11 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test034");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test035");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getStudentId();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test036");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test037");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getGradeDetails();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass11 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test038");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test039");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test040");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "", true, true);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test041");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getGradeDetails();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getStudentId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test042");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass11 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test043");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test044");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test045");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test046");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test047");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getStudentId();
        boolean boolean9 = grade5.isEnrolled();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test048");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getFinalGrade();
        java.lang.Class<?> wildcardClass12 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test049");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test050");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getGradeDetails();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test051");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test052");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test053");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass8 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test054");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test055");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.String str10 = grade5.getCourseId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        java.lang.String str12 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test056");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        boolean boolean10 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test057");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getFinalGrade();
        java.lang.String str12 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test058");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getStudentId();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test059");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test060");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test061");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test062");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        boolean boolean10 = grade5.isEnrolled();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        java.lang.String str12 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test063");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getStudentId();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test064");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test065");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test066");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test067");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test068");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test069");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test070");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test071");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getFinalGrade();
        java.lang.String str12 = grade5.getStudentId();
        java.lang.String str13 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str13, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test072");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test073");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test074");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test075");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
        java.lang.String str6 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test076");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test077");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test078");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test079");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test080");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "", false, true);
        boolean boolean6 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test081");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test082");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test083");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test084");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getGradeDetails();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.String str10 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test085");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test086");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test087");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test088");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test089");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test090");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.String str11 = grade5.getStudentId();
        java.lang.String str12 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass13 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test091");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "", "hi!", false, true);
        java.lang.String str6 = grade5.getFinalGrade();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test092");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.String str11 = grade5.getGradeDetails();
        java.lang.String str12 = grade5.getStudentId();
        boolean boolean13 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str11, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test093");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test094");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test095");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.String str11 = grade5.getCourseId();
        java.lang.String str12 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test096");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test097");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test098");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test099");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test100");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test101");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        boolean boolean10 = grade5.isEnrolled();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        java.lang.String str12 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test102");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getFinalGrade();
        java.lang.String str12 = grade5.getGradeDetails();
        java.lang.String str13 = grade5.getStudentId();
        boolean boolean14 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test103");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.String str11 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test104");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", false, false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test105");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test106");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test107");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getFinalGrade();
        boolean boolean10 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test108");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test109");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test110");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test111");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test112");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isEnrolled();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test113");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test114");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getFinalGrade();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test115");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getFinalGrade();
        java.lang.String str12 = grade5.getGradeDetails();
        java.lang.String str13 = grade5.getStudentId();
        boolean boolean14 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test116");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getFinalGrade();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        boolean boolean12 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test117");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getCourseId();
        java.lang.String str11 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test118");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test119");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, false);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test120");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getStudentId();
        boolean boolean11 = grade5.isEnrolled();
        java.lang.String str12 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass13 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test121");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test122");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", "", "hi!", false, true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test123");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getFinalGrade();
        java.lang.String str12 = grade5.getGradeDetails();
        java.lang.String str13 = grade5.getStudentId();
        java.lang.String str14 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test124");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getCourseId();
        java.lang.String str11 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test125");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getStudentId();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test126");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.String str11 = grade5.getStudentId();
        java.lang.String str12 = grade5.getGradeDetails();
        java.lang.String str13 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test127");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "", true, true);
        java.lang.String str6 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test128");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getFinalGrade();
        java.lang.String str12 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass13 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test129");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test130");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test131");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test132");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.String str11 = grade5.getStudentId();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test133");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test134");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test135");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "hi!", true, false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test136");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getFinalGrade();
        java.lang.String str11 = grade5.getStudentId();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        java.lang.String str13 = grade5.getStudentId();
        java.lang.String str14 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str14, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test137");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test138");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test139");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getGradeDetails();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test140");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test141");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getStudentId();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test142");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test143");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        boolean boolean10 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test144");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", false, false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test145");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isEnrolled();
        boolean boolean9 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test146");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test147");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test148");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test149");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getCourseId();
        java.lang.String str11 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test150");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test151");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test152");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test153");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test154");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getGradeDetails();
        boolean boolean10 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test155");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getGradeDetails();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getCourseId();
        java.lang.String str11 = grade5.getCourseId();
        boolean boolean12 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test156");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.String str10 = grade5.getCourseId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        java.lang.String str12 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test157");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test158");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test159");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        java.lang.String str10 = grade5.getCourseId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test160");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", false, true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test161");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getGradeDetails();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isEnrolled();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test162");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", "", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test163");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test164");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test165");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
        java.lang.String str6 = grade5.getCourseId();
        boolean boolean7 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test166");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test167");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test168");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test169");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test170");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        java.lang.String str11 = grade5.getGradeDetails();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str11, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test171");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test172");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test173");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test174");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test175");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test176");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, true);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test177");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", true, true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test178");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, false);
        java.lang.String str6 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test179");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.String str11 = grade5.getStudentId();
        java.lang.Class<?> wildcardClass12 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test180");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test181");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "", true, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test182");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "", true, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test183");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        boolean boolean9 = grade5.isEnrolled();
        boolean boolean10 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test184");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test185");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.String str10 = grade5.getStudentId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test186");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test187");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getGradeDetails();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getStudentId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        boolean boolean12 = grade5.isEnrolled();
        java.lang.String str13 = grade5.getStudentId();
        java.lang.String str14 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test188");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test189");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass8 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test190");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "", true, true);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.Class<?> wildcardClass7 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test191");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "hi!", "", true, true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test192");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test193");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getStudentId();
        boolean boolean11 = grade5.isEnrolled();
        java.lang.String str12 = grade5.getFinalGrade();
        boolean boolean13 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test194");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test195");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", false, true);
        java.lang.String str6 = grade5.getFinalGrade();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test196");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.String str11 = grade5.getGradeDetails();
        java.lang.String str12 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str11, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test197");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test198");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.Class<?> wildcardClass9 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test199");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        java.lang.String str10 = grade5.getCourseId();
        java.lang.String str11 = grade5.getCourseId();
        java.lang.String str12 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test200");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test201");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getStudentId();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test202");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.String str11 = grade5.getCourseId();
        java.lang.String str12 = grade5.getFinalGrade();
        java.lang.String str13 = grade5.getStudentId();
        boolean boolean14 = grade5.isEnrolled();
        boolean boolean15 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test203");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.String str11 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test204");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test205");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getGradeDetails();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getStudentId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        boolean boolean12 = grade5.isEnrolled();
        java.lang.String str13 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str13, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test206");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getStudentId();
        boolean boolean8 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test207");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test208");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test209");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "", true, true);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test210");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        java.lang.Class<?> wildcardClass12 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test211");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test212");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test213");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test214");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test215");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test216");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test217");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
        java.lang.String str6 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test218");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getFinalGrade();
        java.lang.String str12 = grade5.getGradeDetails();
        boolean boolean13 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test219");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test220");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getGradeDetails();
        java.lang.String str10 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test221");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test222");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getGradeDetails();
        boolean boolean8 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test223");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getGradeDetails();
        boolean boolean11 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test224");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test225");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, false);
        java.lang.String str6 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test226");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test227");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test228");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getCourseId();
        boolean boolean9 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test229");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, false);
        boolean boolean6 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test230");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getGradeDetails();
        boolean boolean11 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test231");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", false, false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test232");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test233");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", "hi!", true, true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test234");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getStudentId();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test235");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getFinalGrade();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test236");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test237");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        boolean boolean11 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test238");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getStudentId();
        boolean boolean9 = grade5.isEnrolled();
        boolean boolean10 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test239");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test240");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test241");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getCourseId();
        java.lang.String str11 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test242");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getGradeDetails();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getStudentId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        java.lang.String str12 = grade5.getCourseId();
        java.lang.String str13 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test243");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test244");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getGradeDetails();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        java.lang.String str12 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test245");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "hi!", true, true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test246");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test247");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test248");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test249");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getFinalGrade();
        java.lang.String str7 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test250");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "", true, false);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test251");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "hi!", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test252");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "hi!", true, false);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.String str7 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test253");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", false, true);
        java.lang.Class<?> wildcardClass6 = grade5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test254");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test255");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        java.lang.String str11 = grade5.getStudentId();
        java.lang.String str12 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str12, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test256");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getStudentId();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        boolean boolean13 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test257");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        java.lang.String str9 = grade5.getFinalGrade();
        boolean boolean10 = grade5.isEnrolled();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test258");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "", true, false);
        java.lang.String str6 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test259");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test260");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test261");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getCourseId();
        boolean boolean10 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test262");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test263");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getStudentId();
        java.lang.String str11 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test264");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: \nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test265");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        boolean boolean10 = grade5.isEnrolled();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test266");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.String str11 = grade5.getCourseId();
        java.lang.String str12 = grade5.getCourseId();
        java.lang.String str13 = grade5.getFinalGrade();
        java.lang.String str14 = grade5.getCourseId();
        boolean boolean15 = grade5.isEnrolled();
        java.lang.String str16 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test267");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", true, true);
        java.lang.String str6 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test268");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getCourseId();
        java.lang.String str8 = grade5.getCourseId();
        boolean boolean9 = grade5.isEnrolled();
        java.lang.String str10 = grade5.getFinalGrade();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test269");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", false, true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test270");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", true, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test271");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.Class<?> wildcardClass10 = grade5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test272");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getStudentId();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        java.lang.String str13 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test273");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: false\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.", "", true, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test274");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getFinalGrade();
        java.lang.String str11 = grade5.getCourseId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test275");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getGradeDetails();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        java.lang.String str11 = grade5.getGradeDetails();
        boolean boolean12 = grade5.isAssessmentsRecorded();
        boolean boolean13 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str11, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test276");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "", true, true);
        boolean boolean6 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test277");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "Grade Submission Details:\nCourse ID: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nStudent ID: hi!\nFinal Grade: Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.\nEnrollment Verified: true\nAssessments Recorded: true\nAcademic record updated successfully.", "", true, true);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test278");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", false, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test279");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test280");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        java.lang.String str10 = grade5.getGradeDetails();
        java.lang.String str11 = grade5.getGradeDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str11, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test281");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getGradeDetails();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getFinalGrade();
        java.lang.String str11 = grade5.getFinalGrade();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test282");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isAssessmentsRecorded();
        java.lang.String str8 = grade5.getStudentId();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getStudentId();
        boolean boolean11 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test283");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isEnrolled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test284");
        submitgrades.Grade grade5 = new submitgrades.Grade("Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "hi!", false, false);
        java.lang.String str6 = grade5.getCourseId();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str8, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test285");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        boolean boolean6 = grade5.isEnrolled();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test286");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "hi!", false, false);
        java.lang.String str6 = grade5.getStudentId();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        boolean boolean9 = grade5.isAssessmentsRecorded();
        java.lang.String str10 = grade5.getGradeDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str10, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test287");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getFinalGrade();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getStudentId();
        java.lang.String str9 = grade5.getGradeDetails();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        java.lang.String str11 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str9, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test288");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getFinalGrade();
        java.lang.String str8 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test289");
        submitgrades.Grade grade5 = new submitgrades.Grade("", "hi!", "", false, true);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: \nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test290");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        java.lang.String str7 = grade5.getCourseId();
        boolean boolean8 = grade5.isEnrolled();
        java.lang.String str9 = grade5.getCourseId();
        boolean boolean10 = grade5.isAssessmentsRecorded();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test291");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        boolean boolean10 = grade5.isEnrolled();
        java.lang.String str11 = grade5.getCourseId();
        java.lang.String str12 = grade5.getCourseId();
        java.lang.String str13 = grade5.getStudentId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test292");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        java.lang.String str6 = grade5.getStudentId();
        java.lang.String str7 = grade5.getGradeDetails();
        boolean boolean8 = grade5.isAssessmentsRecorded();
        java.lang.String str9 = grade5.getFinalGrade();
        java.lang.String str10 = grade5.getCourseId();
        java.lang.String str11 = grade5.getCourseId();
        java.lang.String str12 = grade5.getFinalGrade();
        boolean boolean13 = grade5.isEnrolled();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: hi!\nFinal Grade: \nEnrollment Verified: false\nAssessments Recorded: false\nAcademic record updated successfully.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test293");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "", "hi!", false, true);
        java.lang.String str6 = grade5.getGradeDetails();
        java.lang.String str7 = grade5.getGradeDetails();
        java.lang.String str8 = grade5.getCourseId();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.String str10 = grade5.getFinalGrade();
        java.lang.String str11 = grade5.getStudentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str6, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully." + "'", str7, "Grade Submission Details:\nCourse ID: hi!\nStudent ID: \nFinal Grade: hi!\nEnrollment Verified: false\nAssessments Recorded: true\nAcademic record updated successfully.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GradeRandoopTest0.test294");
        submitgrades.Grade grade5 = new submitgrades.Grade("hi!", "hi!", "", false, false);
        boolean boolean6 = grade5.isAssessmentsRecorded();
        boolean boolean7 = grade5.isEnrolled();
        java.lang.String str8 = grade5.getFinalGrade();
        java.lang.String str9 = grade5.getStudentId();
        java.lang.String str10 = grade5.getCourseId();
        boolean boolean11 = grade5.isAssessmentsRecorded();
        java.lang.String str12 = grade5.getCourseId();
        java.lang.Class<?> wildcardClass13 = grade5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

