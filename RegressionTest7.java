import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        int int12 = student4.getEnrollmentYear();
        business.Student student17 = new business.Student("hi!", "", "hi!", 0);
        student17.addCompletedCourse("");
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str25 = student24.getName();
        java.util.List<java.lang.String> strList26 = student24.getCompletedCourses();
        student17.setCompletedCourses(strList26);
        student17.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        business.Student student34 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList35 = student34.getCompletedCourses();
        student34.setName("hi!");
        student34.addCompletedCourse("");
        student34.setEnrollmentYear((int) (short) 100);
        java.lang.String str42 = student34.getName();
        java.util.List<java.lang.String> strList43 = student34.getCompletedCourses();
        student17.setCompletedCourses(strList43);
        student4.setCompletedCourses(strList43);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        business.Student student4 = new business.Student(" - hi! (, Class of -1)", "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)", 100);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setEnrollmentYear(0);
        student4.setEnrollmentYear(97);
        java.lang.Class<?> wildcardClass19 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str10 = student4.getStudentId();
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        student4.setMajor(" - hi! (hi!, Class of 52)");
        java.lang.String str15 = student4.toString();
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str21 = student20.getName();
        student20.setEnrollmentYear(10);
        student20.setEnrollmentYear((int) (byte) 0);
        student20.setMajor(" - hi! (, Class of 0)");
        java.lang.String str28 = student20.getMajor();
        student20.setStudentId(" -  (, Class of 0)");
        student20.setEnrollmentYear((int) 'a');
        java.lang.String str33 = student20.getStudentId();
        int int34 = student20.getEnrollmentYear();
        student20.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        java.util.List<java.lang.String> strList37 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList37);
        student4.addCompletedCourse(" -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)");
        java.lang.String str41 = student4.toString();
        business.Student student46 = new business.Student("", "hi!", "", 100);
        java.lang.String str47 = student46.getMajor();
        int int48 = student46.getEnrollmentYear();
        student46.addCompletedCourse(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList51 = student46.getCompletedCourses();
        student4.setCompletedCourses(strList51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str15, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " - hi! (, Class of 0)" + "'", str28, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 0)" + "'", str33, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str41, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str15 = student4.toString();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  (, Class of 100)");
        student4.setMajor("hi! -  (, Class of 0)");
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str23 = student4.getName();
        student4.setName(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str15, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str23, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        java.lang.String str17 = student4.getName();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)");
        int int20 = student4.getEnrollmentYear();
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str21, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        student4.setEnrollmentYear((int) (short) 0);
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str15 = student4.getName();
        java.lang.String str16 = student4.getStudentId();
        java.lang.String str17 = student4.getStudentId();
        business.Student student22 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList23 = student22.getCompletedCourses();
        business.Student student28 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList29 = student28.getCompletedCourses();
        student22.setCompletedCourses(strList29);
        student4.setCompletedCourses(strList29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str15, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " - hi! (, Class of 100)", "hi!", 10);
        business.Student student9 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student9.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList12 = student9.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student9.getCompletedCourses();
        java.lang.String str14 = student9.toString();
        student9.setEnrollmentYear((int) (short) -1);
        student9.setEnrollmentYear((int) (byte) 0);
        student9.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str21 = student9.getMajor();
        java.lang.String str22 = student9.getName();
        java.util.List<java.lang.String> strList23 = student9.getCompletedCourses();
        java.util.List<java.lang.String> strList24 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str14, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str22, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        business.Student student4 = new business.Student("", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0)", (int) (short) 0);
        student4.addCompletedCourse(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", (int) ' ');
        java.lang.String str15 = student14.toString();
        java.util.List<java.lang.String> strList16 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str9, " - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)" + "'", str15, "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList15);
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str22 = student21.getName();
        student21.setEnrollmentYear(10);
        student21.setEnrollmentYear((int) (byte) 0);
        student21.setEnrollmentYear((int) (byte) 100);
        java.lang.String str29 = student21.getName();
        business.Student student34 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str35 = student34.getName();
        student34.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList38 = student34.getCompletedCourses();
        java.lang.String str39 = student34.getName();
        business.Student student44 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student44.setStudentId("hi! -  (hi!, Class of 0)");
        int int47 = student44.getEnrollmentYear();
        java.util.List<java.lang.String> strList48 = student44.getCompletedCourses();
        student34.setCompletedCourses(strList48);
        java.lang.String str50 = student34.toString();
        java.util.List<java.lang.String> strList51 = student34.getCompletedCourses();
        business.Student student56 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str57 = student56.getName();
        java.lang.String str58 = student56.getName();
        java.lang.String str59 = student56.getStudentId();
        java.lang.String str60 = student56.toString();
        business.Student student65 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList66 = student65.getCompletedCourses();
        student56.setCompletedCourses(strList66);
        student34.setCompletedCourses(strList66);
        student21.setCompletedCourses(strList66);
        student4.setCompletedCourses(strList66);
        student4.setStudentId("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        java.lang.String str73 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " -  (, Class of 10)" + "'", str50, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str60, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str73, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        business.Student student10 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str11 = student10.getMajor();
        business.Student student16 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int17 = student16.getEnrollmentYear();
        student16.setMajor("hi!");
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str25 = student24.getName();
        student24.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList28 = student24.getCompletedCourses();
        java.lang.String str29 = student24.getName();
        business.Student student34 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student34.setStudentId("hi! -  (hi!, Class of 0)");
        int int37 = student34.getEnrollmentYear();
        java.util.List<java.lang.String> strList38 = student34.getCompletedCourses();
        student24.setCompletedCourses(strList38);
        student16.setCompletedCourses(strList38);
        java.util.List<java.lang.String> strList41 = student16.getCompletedCourses();
        student10.setCompletedCourses(strList41);
        student4.setCompletedCourses(strList41);
        student4.setStudentId("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        int int46 = student4.getEnrollmentYear();
        student4.setName(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getStudentId();
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        java.lang.String str15 = student4.toString();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str18 = student4.getStudentId();
        java.lang.String str19 = student4.getStudentId();
        int int20 = student4.getEnrollmentYear();
        java.lang.String str21 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 0)" + "'", str21, " -  (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 0)");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)", (int) (short) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)" + "'", str6, "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("");
        business.Student student13 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = student4.getStudentId();
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        int int35 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList36 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setMajor(" - hi! -  (hi!, Class of 97) (, Class of 10)");
        java.lang.String str45 = student4.getName();
        java.lang.Class<?> wildcardClass46 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str45, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", "", (int) (byte) 100);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        business.Student student4 = new business.Student(" - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " -  ( -  (, Class of 10), Class of 0)", " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", 1);
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  ( -  (, Class of 10), Class of 0) ( - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10), Class of 1)" + "'", str5, " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  ( -  (, Class of 10), Class of 0) ( - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10), Class of 1)");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getMajor();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str12, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setMajor("");
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        java.lang.String str22 = student4.getName();
        int int23 = student4.getEnrollmentYear();
        java.lang.String str24 = student4.getStudentId();
        student4.setMajor(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str24, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear((int) '#');
        int int15 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList15);
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str22 = student21.getName();
        student21.setEnrollmentYear(10);
        student21.setEnrollmentYear((int) (byte) 0);
        student21.setEnrollmentYear((int) (byte) 100);
        java.lang.String str29 = student21.getName();
        business.Student student34 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str35 = student34.getName();
        student34.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList38 = student34.getCompletedCourses();
        java.lang.String str39 = student34.getName();
        business.Student student44 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student44.setStudentId("hi! -  (hi!, Class of 0)");
        int int47 = student44.getEnrollmentYear();
        java.util.List<java.lang.String> strList48 = student44.getCompletedCourses();
        student34.setCompletedCourses(strList48);
        java.lang.String str50 = student34.toString();
        java.util.List<java.lang.String> strList51 = student34.getCompletedCourses();
        business.Student student56 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str57 = student56.getName();
        java.lang.String str58 = student56.getName();
        java.lang.String str59 = student56.getStudentId();
        java.lang.String str60 = student56.toString();
        business.Student student65 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList66 = student65.getCompletedCourses();
        student56.setCompletedCourses(strList66);
        student34.setCompletedCourses(strList66);
        student21.setCompletedCourses(strList66);
        student4.setCompletedCourses(strList66);
        java.lang.String str71 = student4.getName();
        java.lang.String str72 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " -  (, Class of 10)" + "'", str50, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str60, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str71, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str72, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getName();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        int int15 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", "hi! -  -  (, Class of 10) ( -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100), Class of 0)", " -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97) -  - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100) ( - hi! (, Class of 32), Class of 32)", 0);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        business.Student student4 = new business.Student("", "hi!", "", 0);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str8 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setStudentId("hi! -  (, Class of 0)");
        java.lang.String str14 = student4.getName();
        java.lang.String str15 = student4.getStudentId();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  (, Class of 0)" + "'", str15, "hi! -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        business.Student student4 = new business.Student(" -  (hi!, Class of 100)", " -  (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", (int) '4');
        student4.setEnrollmentYear((int) (byte) 10);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str12 = student4.getName();
        business.Student student17 = new business.Student("hi!", "", "hi!", 0);
        student17.setName(" -  (, Class of 10)");
        student17.setMajor("");
        java.lang.String str22 = student17.getMajor();
        java.lang.String str23 = student17.getName();
        java.util.List<java.lang.String> strList24 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str28 = student4.getMajor();
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str28, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        business.Student student4 = new business.Student("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", " -  (hi! -  (hi!, Class of 0), Class of 0)", 32);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String str14 = student9.getMajor();
        java.lang.String str15 = student9.getName();
        java.util.List<java.lang.String> strList16 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        java.lang.String str18 = student4.getMajor();
        business.Student student23 = new business.Student("hi!", " -  ( -  (, Class of 0), Class of 0)", " - hi! (, Class of 0)", (int) '4');
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        student28.addCompletedCourse("");
        java.lang.String str31 = student28.toString();
        student28.setMajor(" -  (, Class of 0)");
        java.lang.String str34 = student28.getStudentId();
        java.lang.String str35 = student28.getMajor();
        java.util.List<java.lang.String> strList36 = student28.getCompletedCourses();
        business.Student student41 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList42 = null;
        student41.setCompletedCourses(strList42);
        java.lang.String str44 = student41.getMajor();
        business.Student student49 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str50 = student49.getName();
        student49.setEnrollmentYear(10);
        student49.setEnrollmentYear((int) (byte) 0);
        student49.setMajor(" - hi! (, Class of 0)");
        java.lang.String str57 = student49.getMajor();
        java.lang.String str58 = student49.getName();
        java.util.List<java.lang.String> strList59 = student49.getCompletedCourses();
        student41.setCompletedCourses(strList59);
        student28.setCompletedCourses(strList59);
        student23.setCompletedCourses(strList59);
        student4.setCompletedCourses(strList59);
        java.lang.String str64 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " -  (, Class of 0)" + "'", str31, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " -  (, Class of 0)" + "'", str35, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + " - hi! (, Class of 0)" + "'", str57, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setEnrollmentYear(52);
        java.lang.String str19 = student4.getStudentId();
        student4.setStudentId("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str19, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", (int) ' ');
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 0) (, Class of 0)");
        java.lang.String str7 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str7, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        business.Student student13 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student13.setEnrollmentYear(35);
        java.lang.String str16 = student13.getStudentId();
        java.lang.String str17 = student13.getName();
        student13.setStudentId(" -  (, Class of 0)");
        student13.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str22 = student13.getName();
        business.Student student27 = new business.Student("hi!", "", "hi!", 0);
        student27.setName(" -  (, Class of 10)");
        student27.setEnrollmentYear((int) '#');
        java.lang.String str32 = student27.toString();
        java.lang.String str33 = student27.getMajor();
        java.lang.String str34 = student27.getStudentId();
        student27.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        business.Student student41 = new business.Student("hi!", "", "hi!", 0);
        student41.addCompletedCourse("");
        java.util.List<java.lang.String> strList44 = student41.getCompletedCourses();
        java.lang.String str45 = student41.getName();
        business.Student student50 = new business.Student("hi!", "", "hi!", 0);
        student50.setName(" -  (, Class of 10)");
        student50.setEnrollmentYear((int) '#');
        java.lang.String str55 = student50.getMajor();
        java.util.List<java.lang.String> strList56 = student50.getCompletedCourses();
        student41.setCompletedCourses(strList56);
        student27.setCompletedCourses(strList56);
        student13.setCompletedCourses(strList56);
        student4.setCompletedCourses(strList56);
        java.lang.String str61 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 10)" + "'", str17, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str32, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + " -  (, Class of 10)" + "'", str61, " -  (, Class of 10)");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str7 = student4.getMajor();
        student4.setEnrollmentYear(52);
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setName(" - hi! (, Class of 100)");
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str15 = student4.getName();
        student4.setMajor("hi! -  - hi! (, Class of 100) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! (, Class of 100)" + "'", str15, " - hi! (, Class of 100)");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        student17.setName("hi!");
        student17.addCompletedCourse("");
        java.util.List<java.lang.String> strList23 = student17.getCompletedCourses();
        java.lang.String str24 = student17.getStudentId();
        java.lang.String str25 = student17.toString();
        business.Student student30 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        student17.setCompletedCourses(strList31);
        business.Student student37 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList38 = student37.getCompletedCourses();
        student17.setCompletedCourses(strList38);
        student4.setCompletedCourses(strList38);
        business.Student student45 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList46 = student45.getCompletedCourses();
        student45.setName("hi!");
        student45.addCompletedCourse("");
        java.util.List<java.lang.String> strList51 = student45.getCompletedCourses();
        java.lang.String str52 = student45.getStudentId();
        java.util.List<java.lang.String> strList53 = student45.getCompletedCourses();
        student4.setCompletedCourses(strList53);
        java.lang.Class<?> wildcardClass55 = strList53.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " - hi! (, Class of 0)" + "'", str25, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        student4.setMajor(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str18 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str18, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str7 = student4.getMajor();
        student4.setName(" -  (, Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) (byte) 100);
        java.util.List<java.lang.String> strList19 = student4.getCompletedCourses();
        java.lang.String str20 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        business.Student student4 = new business.Student("hi!", "hi!", "hi! -  -  (, Class of 10) (, Class of 0)", 0);
        student4.setEnrollmentYear((int) ' ');
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setEnrollmentYear((-1));
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        int int13 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        business.Student student4 = new business.Student(" -  (hi!, Class of 10)", "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) (hi!, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)", (int) 'a');
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        student4.setMajor(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        business.Student student15 = new business.Student(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", 52);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str10, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        int int14 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str17 = student4.getStudentId();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        java.lang.String str20 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)" + "'", str20, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        business.Student student10 = new business.Student("hi!", "", "hi!", 0);
        student10.addCompletedCourse("");
        java.lang.String str13 = student10.getName();
        student10.addCompletedCourse(" -  (, Class of 100)");
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str21 = student20.getName();
        student20.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList24 = student20.getCompletedCourses();
        java.lang.String str25 = student20.getName();
        business.Student student30 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student30.setStudentId("hi! -  (hi!, Class of 0)");
        int int33 = student30.getEnrollmentYear();
        java.util.List<java.lang.String> strList34 = student30.getCompletedCourses();
        student20.setCompletedCourses(strList34);
        java.lang.String str36 = student20.toString();
        java.util.List<java.lang.String> strList37 = student20.getCompletedCourses();
        student10.setCompletedCourses(strList37);
        student4.setCompletedCourses(strList37);
        java.lang.String str40 = student4.toString();
        student4.setName(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)");
        student4.setEnrollmentYear(32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " -  (, Class of 10)" + "'", str36, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)" + "'", str40, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", " - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)" + "'", str5, " - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)", " -  (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 0)", " -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)", 52);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.toString();
        business.Student student17 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        student4.addCompletedCourse(" -  (, Class of 0)");
        java.lang.String str22 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        int int14 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        business.Student student21 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int22 = student21.getEnrollmentYear();
        int int23 = student21.getEnrollmentYear();
        student21.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        student21.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList33 = student32.getCompletedCourses();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        student32.setCompletedCourses((java.util.List<java.lang.String>) strList37);
        int int40 = student32.getEnrollmentYear();
        student32.setMajor(" -  (, Class of 0)");
        int int43 = student32.getEnrollmentYear();
        student32.setStudentId("hi!");
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        student50.setName("hi!");
        student50.addCompletedCourse("");
        java.util.List<java.lang.String> strList56 = student50.getCompletedCourses();
        java.lang.String str57 = student50.getStudentId();
        java.lang.String str58 = student50.toString();
        business.Student student63 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList64 = student63.getCompletedCourses();
        student50.setCompletedCourses(strList64);
        business.Student student70 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList71 = student70.getCompletedCourses();
        student50.setCompletedCourses(strList71);
        student32.setCompletedCourses(strList71);
        student21.setCompletedCourses(strList71);
        student4.setCompletedCourses(strList71);
        java.lang.String str76 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + " - hi! (, Class of 0)" + "'", str58, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", (-1));
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        student4.setName("hi! -  (hi!, Class of 0) -  - hi! (, Class of -1) ( -  (, Class of 0), Class of 1)");
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str5, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str10, "hi! - hi! (hi!, Class of 35)");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getName();
        business.Student student18 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str19 = student18.getName();
        student18.setEnrollmentYear(10);
        student18.setEnrollmentYear((int) (byte) 0);
        student18.setMajor(" - hi! (, Class of 0)");
        java.lang.String str26 = student18.getMajor();
        java.lang.String str27 = student18.getName();
        java.util.List<java.lang.String> strList28 = student18.getCompletedCourses();
        java.util.List<java.lang.String> strList29 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList29);
        business.Student student35 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str36 = student35.getStudentId();
        java.lang.String str37 = student35.toString();
        java.lang.String str38 = student35.getName();
        business.Student student43 = new business.Student("", "", "", (int) (short) 0);
        student43.addCompletedCourse("");
        java.lang.String str46 = student43.toString();
        java.lang.String str47 = student43.getStudentId();
        business.Student student52 = new business.Student("hi!", "", "hi!", 0);
        student52.setName(" -  (, Class of 10)");
        student52.setMajor("");
        java.lang.String str57 = student52.getMajor();
        business.Student student62 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList63 = student62.getCompletedCourses();
        student52.setCompletedCourses(strList63);
        student43.setCompletedCourses(strList63);
        student35.setCompletedCourses(strList63);
        student35.setStudentId(" - hi! (, Class of -1)");
        java.util.List<java.lang.String> strList69 = student35.getCompletedCourses();
        student4.setCompletedCourses(strList69);
        business.Student student75 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList76 = student75.getCompletedCourses();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        student75.setCompletedCourses((java.util.List<java.lang.String>) strList80);
        java.lang.String str83 = student75.getName();
        student75.setStudentId(" -  (, Class of 0)");
        java.lang.String str86 = student75.getStudentId();
        java.util.List<java.lang.String> strList87 = student75.getCompletedCourses();
        student75.setMajor(" - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        student75.addCompletedCourse("hi! -  (, Class of 0) -  (, Class of 100)");
        java.util.List<java.lang.String> strList92 = student75.getCompletedCourses();
        student4.setCompletedCourses(strList92);
        java.lang.String str94 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " - hi! (, Class of 0)" + "'", str26, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str37, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " -  (, Class of 10)" + "'", str38, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + " -  (, Class of 0)" + "'", str46, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + " -  (, Class of 0)" + "'", str86, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        student4.setEnrollmentYear(0);
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 97)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", (int) 'a');
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getMajor();
        java.lang.String str8 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)" + "'", str7, "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)" + "'", str8, "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0), Class of 100)", " - hi! -  (hi!, Class of 0) (, Class of 100)", (int) (byte) 10);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", " - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)", (int) (short) 10);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", (int) ' ');
        student4.setStudentId("hi! -  (hi!, Class of 1)");
        int int7 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", "", (int) (byte) 100);
        java.lang.String str5 = student4.getName();
        student4.setName(" -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)");
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)" + "'", str5, " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10) -  -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0) (, Class of 100)" + "'", str8, "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10) -  -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0) (, Class of 100)");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getName();
        business.Student student14 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student14.setStudentId("hi! -  (hi!, Class of 0)");
        int int17 = student14.getEnrollmentYear();
        java.util.List<java.lang.String> strList18 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        java.lang.String str20 = student4.toString();
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList23 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", (int) ' ');
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getStudentId();
        student4.setName(" - hi! (, Class of 100)");
        business.Student student16 = new business.Student("", "hi!", "", 100);
        student16.setEnrollmentYear((int) (short) -1);
        java.util.List<java.lang.String> strList19 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList19);
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 100)");
        student4.setEnrollmentYear((-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse(" -  (, Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        student4.setName("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        business.Student student4 = new business.Student(" - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)", "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)", (int) (byte) -1);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        student4.setEnrollmentYear(35);
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)");
        student4.setEnrollmentYear(32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        student4.setName(" - hi! (, Class of -1)");
        java.lang.String str7 = student4.getStudentId();
        student4.setMajor(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str7, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of -1)" + "'", str10, " - hi! (, Class of -1)");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        business.Student student4 = new business.Student("hi!", "", " -  (, Class of 0)", (int) 'a');
        student4.setName(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        student4.setEnrollmentYear(1);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 100)" + "'", str12, " - hi! (, Class of 100)");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.setName("");
        java.lang.String str19 = student4.toString();
        java.lang.String str20 = student4.getName();
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (, Class of 0)" + "'", str19, "hi! -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        business.Student student4 = new business.Student(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! (, Class of 0), Class of 0)", " - hi! ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of -1)", "hi! -  -  (, Class of 10) (, Class of 0) - hi! ( -  (hi!, Class of 100), Class of 0)", (int) ' ');
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", (int) ' ');
        student4.setMajor("hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        business.Student student15 = new business.Student("hi!", "", "hi!", 0);
        student15.setName(" -  (, Class of 10)");
        student15.setEnrollmentYear((int) '#');
        java.lang.String str20 = student15.getMajor();
        business.Student student25 = new business.Student("", "", "", (int) (short) 0);
        student25.addCompletedCourse("");
        java.lang.String str28 = student25.toString();
        java.lang.String str29 = student25.getStudentId();
        business.Student student34 = new business.Student("hi!", "", "hi!", 0);
        student34.setName(" -  (, Class of 10)");
        student34.setMajor("");
        java.lang.String str39 = student34.getMajor();
        business.Student student44 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList45 = student44.getCompletedCourses();
        student34.setCompletedCourses(strList45);
        student25.setCompletedCourses(strList45);
        student15.setCompletedCourses(strList45);
        student4.setCompletedCourses(strList45);
        int int50 = student4.getEnrollmentYear();
        student4.setStudentId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  (, Class of 0)" + "'", str28, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" - hi! (, Class of 0)");
        java.lang.String str11 = student4.toString();
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 0) - hi! (, Class of 100)" + "'", str11, " - hi! (, Class of 0) - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        student12.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList16 = student12.getCompletedCourses();
        java.lang.String str17 = student12.getName();
        business.Student student22 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student22.setStudentId("hi! -  (hi!, Class of 0)");
        int int25 = student22.getEnrollmentYear();
        java.util.List<java.lang.String> strList26 = student22.getCompletedCourses();
        student12.setCompletedCourses(strList26);
        student4.setCompletedCourses(strList26);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setStudentId(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        business.Student student11 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)", (int) (byte) 1);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)", (int) ' ');
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)" + "'", str5, " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 0)" + "'", str6, " -  (, Class of 0)");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        java.lang.String str13 = student4.getName();
        int int14 = student4.getEnrollmentYear();
        int int15 = student4.getEnrollmentYear();
        business.Student student20 = new business.Student("hi!", "", "hi!", 0);
        student20.setName(" -  (, Class of 10)");
        student20.setEnrollmentYear((int) '#');
        java.lang.String str25 = student20.getMajor();
        java.util.List<java.lang.String> strList26 = student20.getCompletedCourses();
        business.Student student31 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str32 = student31.getName();
        java.util.List<java.lang.String> strList33 = student31.getCompletedCourses();
        business.Student student38 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList39 = student38.getCompletedCourses();
        student31.setCompletedCourses(strList39);
        student31.setStudentId("");
        business.Student student47 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList48 = student47.getCompletedCourses();
        student31.setCompletedCourses(strList48);
        student20.setCompletedCourses(strList48);
        student20.setMajor(" - hi! (hi!, Class of 52)");
        java.util.List<java.lang.String> strList53 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList53);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList53);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        int int14 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str17 = student4.getStudentId();
        java.util.List<java.lang.String> strList18 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList6 = null;
        student4.setCompletedCourses(strList6);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (, Class of 100)", "", " - hi! (hi!, Class of 52)", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList16);
        java.lang.String str19 = student4.toString();
        java.lang.String str20 = student4.getName();
        java.lang.String str21 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (, Class of 100)", "", " - hi! (hi!, Class of 52)", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str19, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str21, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getName();
        business.Student student18 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str19 = student18.getName();
        student18.setEnrollmentYear(10);
        student18.setEnrollmentYear((int) (byte) 0);
        student18.setMajor(" - hi! (, Class of 0)");
        java.lang.String str26 = student18.getMajor();
        java.lang.String str27 = student18.getName();
        java.util.List<java.lang.String> strList28 = student18.getCompletedCourses();
        java.util.List<java.lang.String> strList29 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList29);
        student4.setStudentId(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student4.setMajor(" -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)");
        student4.setStudentId(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " - hi! (, Class of 0)" + "'", str26, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        business.Student student4 = new business.Student(" - hi! -  (hi!, Class of 0) (, Class of 100)", " -  - hi! (, Class of -1) (hi!, Class of 10)", " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi!, Class of 10)", (int) '#');
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str13 = student4.getName();
        java.lang.String str14 = student4.getName();
        java.util.List<java.lang.String> strList15 = null;
        student4.setCompletedCourses(strList15);
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0), Class of 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 10)" + "'", str13, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str9 = student4.getName();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str9 = student4.getName();
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        student14.setCompletedCourses((java.util.List<java.lang.String>) strList19);
        student14.setName("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)");
        business.Student student28 = new business.Student("hi!", "", "hi!", 0);
        student28.setName(" -  (, Class of 10)");
        student28.setMajor("");
        java.lang.String str33 = student28.getMajor();
        business.Student student38 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList39 = student38.getCompletedCourses();
        student28.setCompletedCourses(strList39);
        student14.setCompletedCourses(strList39);
        student4.setCompletedCourses(strList39);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        student11.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList14 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.Class<?> wildcardClass16 = strList14.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)" + "'", str6, " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  (hi!, Class of 0)", (-1));
        java.lang.String str5 = student4.toString();
        int int6 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)" + "'", str5, "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)", (int) ' ');
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)" + "'", str5, " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        student4.setName(" -  (, Class of 10)");
        java.lang.String str7 = student4.getName();
        student4.setEnrollmentYear(10);
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) 'a');
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) (hi!, Class of 97)" + "'", str11, "hi! -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) (hi!, Class of 97)");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        student14.setCompletedCourses((java.util.List<java.lang.String>) strList19);
        java.lang.String str22 = student14.getName();
        student14.setStudentId(" -  (, Class of 0)");
        student14.setMajor(" -  (, Class of 10)");
        student14.setMajor(" - hi! (, Class of 0)");
        business.Student student33 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str34 = student33.getName();
        java.util.List<java.lang.String> strList35 = student33.getCompletedCourses();
        business.Student student40 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList41 = student40.getCompletedCourses();
        student33.setCompletedCourses(strList41);
        student33.setName(" - hi! (, Class of 0)");
        java.lang.String str45 = student33.getName();
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        student50.setName("hi!");
        student50.addCompletedCourse("");
        student50.setEnrollmentYear((int) (short) 100);
        java.lang.String str58 = student50.getName();
        java.util.List<java.lang.String> strList59 = student50.getCompletedCourses();
        student33.setCompletedCourses(strList59);
        student14.setCompletedCourses(strList59);
        student4.setCompletedCourses(strList59);
        java.util.List<java.lang.String> strList63 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList64 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " - hi! (, Class of 0)" + "'", str45, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getName();
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        student12.addCompletedCourse("");
        java.lang.String str15 = student12.toString();
        java.lang.String str16 = student12.getStudentId();
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        student21.setName(" -  (, Class of 10)");
        student21.setMajor("");
        java.lang.String str26 = student21.getMajor();
        business.Student student31 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList32 = student31.getCompletedCourses();
        student21.setCompletedCourses(strList32);
        student12.setCompletedCourses(strList32);
        student4.setCompletedCourses(strList32);
        student4.setEnrollmentYear(35);
        java.lang.String str38 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 35)" + "'", str38, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 35)");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.addCompletedCourse(" -  (, Class of 0)");
        java.lang.String str17 = student4.getMajor();
        java.lang.String str18 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        student12.setCompletedCourses(strList20);
        student4.setCompletedCourses(strList20);
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.lang.String str27 = student4.getMajor();
        student4.addCompletedCourse(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        java.lang.String str30 = student4.getName();
        java.lang.String str31 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student16.setStudentId("");
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str25 = student24.getName();
        java.util.List<java.lang.String> strList26 = student24.getCompletedCourses();
        student16.setCompletedCourses(strList26);
        java.lang.String str28 = student16.toString();
        student16.setStudentId("hi! -  (hi!, Class of 0)");
        student16.setStudentId(" -  - hi! (, Class of 0) (, Class of 0)");
        student16.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        java.lang.String str35 = student16.getName();
        java.lang.String str36 = student16.getStudentId();
        java.util.List<java.lang.String> strList37 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList37);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  (, Class of 0)" + "'", str28, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)" + "'", str35, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str36, " -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("");
        business.Student student13 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        java.util.List<java.lang.String> strList32 = student4.getCompletedCourses();
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str35 = student4.getName();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getMajor();
        student4.addCompletedCourse(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str17 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        java.lang.String str20 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)" + "'", str20, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.toString();
        student4.setStudentId(" -  (hi!, Class of 100)");
        java.lang.String str8 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.addCompletedCourse("hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 0)" + "'", str8, " -  (, Class of 0)");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        business.Student student4 = new business.Student("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0) -  - hi! (, Class of -1) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 35)", "hi! -  (hi!, Class of 0) -  (, Class of 32)", " -  (, Class of 10)", 52);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 100);
        business.Student student17 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str18 = student17.getName();
        java.lang.String str19 = student17.getName();
        java.lang.String str20 = student17.getStudentId();
        java.lang.String str21 = student17.toString();
        business.Student student26 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList27 = student26.getCompletedCourses();
        student17.setCompletedCourses(strList27);
        student4.setCompletedCourses(strList27);
        java.lang.Class<?> wildcardClass30 = strList27.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str21, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 100)");
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str15 = student14.getName();
        student14.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList18 = student14.getCompletedCourses();
        java.lang.String str19 = student14.getName();
        business.Student student24 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student24.setStudentId("hi! -  (hi!, Class of 0)");
        int int27 = student24.getEnrollmentYear();
        java.util.List<java.lang.String> strList28 = student24.getCompletedCourses();
        student14.setCompletedCourses(strList28);
        java.lang.String str30 = student14.toString();
        java.util.List<java.lang.String> strList31 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList31);
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str35 = student4.getName();
        java.lang.String str36 = student4.getMajor();
        java.lang.String str37 = student4.getMajor();
        student4.setName("hi! - hi! (, Class of 100)");
        student4.setEnrollmentYear(32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 10)" + "'", str30, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 100)", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setName("");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", "", 1);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        student9.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str16 = student9.getMajor();
        java.lang.String str17 = student9.getMajor();
        java.util.List<java.lang.String> strList18 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        student4.setEnrollmentYear((int) (short) 0);
        java.lang.String str22 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) (byte) 0);
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        java.lang.String str7 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)" + "'", str7, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        java.lang.String str14 = student4.getMajor();
        student4.setStudentId("");
        student4.setEnrollmentYear(0);
        student4.setEnrollmentYear(10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getMajor();
        student4.addCompletedCourse(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str12, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 10)" + "'", str13, " -  (, Class of 10)");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)", "hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)", 1);
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setStudentId("hi!");
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 100)");
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str15 = student14.getName();
        student14.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList18 = student14.getCompletedCourses();
        java.lang.String str19 = student14.getName();
        business.Student student24 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student24.setStudentId("hi! -  (hi!, Class of 0)");
        int int27 = student24.getEnrollmentYear();
        java.util.List<java.lang.String> strList28 = student24.getCompletedCourses();
        student14.setCompletedCourses(strList28);
        java.lang.String str30 = student14.toString();
        java.util.List<java.lang.String> strList31 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList31);
        int int33 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (, Class of 100)");
        java.util.List<java.lang.String> strList36 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 10)" + "'", str30, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100)", "hi! - hi! (, Class of 100)", 0);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        int int8 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        business.Student student15 = new business.Student("hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", (int) (short) 0);
        int int16 = student15.getEnrollmentYear();
        java.util.List<java.lang.String> strList17 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        java.lang.Class<?> wildcardClass19 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        business.Student student4 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        student4.setEnrollmentYear((int) '4');
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        student4.setName(" -  (, Class of 10)");
        java.lang.String str15 = student4.getName();
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((int) '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        business.Student student4 = new business.Student("hi!", " - hi! (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", 10);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        student4.setStudentId(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str12, " -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", (int) '4');
        student4.setName("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
        java.lang.String str7 = student4.toString();
        student4.setName(" -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)" + "'", str7, " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        business.Student student4 = new business.Student(" - hi! (, Class of -1)", "hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)", (int) (byte) 10);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        business.Student student4 = new business.Student("hi! -  ( -  (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (, Class of 100)", 97);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.toString();
        business.Student student13 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList14 = student13.getCompletedCourses();
        student13.setStudentId("");
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        student21.setName(" -  (, Class of 10)");
        student21.setMajor("");
        student21.setName(" - hi! (, Class of 100)");
        java.lang.String[] strArray35 = new java.lang.String[] { " - hi! (, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", " -  (, Class of 10)" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        student21.setCompletedCourses((java.util.List<java.lang.String>) strList36);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList36);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str8, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { " - hi! (, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", " -  (, Class of 10)" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        business.Student student4 = new business.Student("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)", "hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)", "", (int) (short) 100);
        student4.setEnrollmentYear((int) (short) 100);
        student4.setName("");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)", " -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)", " -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10), Class of 97)", (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "hi!", " - hi! (, Class of 0)", (-1));
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setEnrollmentYear((int) '#');
        java.lang.String str14 = student9.toString();
        java.lang.String str15 = student9.getMajor();
        java.lang.String str16 = student9.getStudentId();
        java.util.List<java.lang.String> strList17 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1) - hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32), Class of 97)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str14, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getMajor();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str10, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        business.Student student4 = new business.Student("", "hi!", "", 0);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getStudentId();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        business.Student student17 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList18 = null;
        student17.setCompletedCourses(strList18);
        java.lang.String str20 = student17.getMajor();
        business.Student student25 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str26 = student25.getName();
        student25.setEnrollmentYear(10);
        student25.setEnrollmentYear((int) (byte) 0);
        student25.setMajor(" - hi! (, Class of 0)");
        java.lang.String str33 = student25.getMajor();
        java.lang.String str34 = student25.getName();
        java.util.List<java.lang.String> strList35 = student25.getCompletedCourses();
        student17.setCompletedCourses(strList35);
        student4.setCompletedCourses(strList35);
        java.lang.String str38 = student4.getName();
        int int39 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " - hi! (, Class of 0)" + "'", str33, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        business.Student student4 = new business.Student(" -  (, Class of 0)", "", "", 100);
        student4.setName("hi! -  (, Class of 100)");
        student4.addCompletedCourse(" - hi! (hi!, Class of 52)");
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) ( -  (, Class of 100), Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", "hi! -  -  - hi! (, Class of 0) (, Class of 100) (hi!, Class of 0)", 97);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", (int) ' ');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getStudentId();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str6, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) ( -  (, Class of 0), Class of 32)" + "'", str10, "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) ( -  (, Class of 0), Class of 32)");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        int int15 = student4.getEnrollmentYear();
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.setStudentId("hi! -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student14.setName("hi!");
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str23 = student22.getName();
        java.util.List<java.lang.String> strList24 = student22.getCompletedCourses();
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList30 = student29.getCompletedCourses();
        student22.setCompletedCourses(strList30);
        student14.setCompletedCourses(strList30);
        student4.setCompletedCourses(strList30);
        business.Student student38 = new business.Student("hi!", "", "hi!", 0);
        student38.addCompletedCourse("");
        java.lang.String str41 = student38.getName();
        student38.setMajor("");
        java.lang.String str44 = student38.getName();
        int int45 = student38.getEnrollmentYear();
        int int46 = student38.getEnrollmentYear();
        business.Student student51 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (, Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", 52);
        java.lang.String str52 = student51.toString();
        java.util.List<java.lang.String> strList53 = student51.getCompletedCourses();
        student38.setCompletedCourses(strList53);
        student4.setCompletedCourses(strList53);
        business.Student student60 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str61 = student60.getName();
        java.util.List<java.lang.String> strList62 = student60.getCompletedCourses();
        java.lang.String str63 = student60.getStudentId();
        student60.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str66 = student60.getMajor();
        java.lang.String str67 = student60.toString();
        java.util.List<java.lang.String> strList68 = student60.getCompletedCourses();
        student4.setCompletedCourses(strList68);
        student4.setEnrollmentYear((int) (short) 0);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)" + "'", str52, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)" + "'", str67, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList68);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", 10);
        java.lang.String str5 = student4.toString();
        student4.setEnrollmentYear((int) ' ');
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)" + "'", str5, " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getMajor();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        java.lang.String str12 = student4.getMajor();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        student4.addCompletedCourse(" -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)");
        java.lang.String str16 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) -  -  (, Class of 10) (, Class of 0)" + "'", str16, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        student12.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList16 = student12.getCompletedCourses();
        java.lang.String str17 = student12.getName();
        business.Student student22 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student22.setStudentId("hi! -  (hi!, Class of 0)");
        int int25 = student22.getEnrollmentYear();
        java.util.List<java.lang.String> strList26 = student22.getCompletedCourses();
        student12.setCompletedCourses(strList26);
        student4.setCompletedCourses(strList26);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str31 = student4.getMajor();
        int int32 = student4.getEnrollmentYear();
        int int33 = student4.getEnrollmentYear();
        int int34 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        student4.setName("hi!");
        java.lang.String str15 = student4.getName();
        student4.setName(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)");
        java.lang.String str18 = student4.getName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)" + "'", str18, " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.lang.String str7 = student4.getMajor();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setStudentId("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        java.lang.String str12 = student4.getMajor();
        student4.setName(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        java.lang.String str15 = student4.getMajor();
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse("hi! - hi! (hi!, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str9, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.toString();
        java.lang.String str14 = student4.getName();
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str17 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str12, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str13, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 1)" + "'", str17, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 1)");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (, Class of 0)" + "'", str7, " - hi! (, Class of 0)");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setName("");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)");
        student4.setName(" - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 10)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setName(" -  (, Class of 0)");
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        student4.setMajor(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear(100);
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str22 = student4.getMajor();
        java.lang.Class<?> wildcardClass23 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str22, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        student4.setStudentId(" -  - hi! (, Class of 0) (, Class of 0)");
        java.lang.String str7 = student4.getMajor();
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.String str13 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str8 = student4.getName();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str8, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) (byte) 100);
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        java.util.List<java.lang.String> strList23 = student4.getCompletedCourses();
        student4.addCompletedCourse(" - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)");
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str31 = student30.getName();
        student30.setEnrollmentYear(10);
        student30.setEnrollmentYear((int) (byte) 0);
        student30.setMajor(" - hi! (, Class of 0)");
        java.lang.String str38 = student30.getMajor();
        java.lang.String str39 = student30.getName();
        business.Student student44 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str45 = student44.getName();
        student44.setEnrollmentYear(10);
        student44.setEnrollmentYear((int) (byte) 0);
        student44.setMajor(" - hi! (, Class of 0)");
        java.lang.String str52 = student44.getMajor();
        java.lang.String str53 = student44.getName();
        java.util.List<java.lang.String> strList54 = student44.getCompletedCourses();
        java.util.List<java.lang.String> strList55 = student44.getCompletedCourses();
        student30.setCompletedCourses(strList55);
        student4.setCompletedCourses(strList55);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " - hi! (, Class of 0)" + "'", str38, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " - hi! (, Class of 0)" + "'", str52, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str9 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        java.lang.String str12 = student4.getMajor();
        student4.setName(" - hi! (, Class of 100)");
        student4.setName(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        business.Student student15 = new business.Student("hi!", "", "hi!", 0);
        student15.setName(" -  (, Class of 10)");
        student15.setEnrollmentYear((int) '#');
        java.lang.String str20 = student15.getMajor();
        business.Student student25 = new business.Student("", "", "", (int) (short) 0);
        student25.addCompletedCourse("");
        java.lang.String str28 = student25.toString();
        java.lang.String str29 = student25.getStudentId();
        business.Student student34 = new business.Student("hi!", "", "hi!", 0);
        student34.setName(" -  (, Class of 10)");
        student34.setMajor("");
        java.lang.String str39 = student34.getMajor();
        business.Student student44 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList45 = student44.getCompletedCourses();
        student34.setCompletedCourses(strList45);
        student25.setCompletedCourses(strList45);
        student15.setCompletedCourses(strList45);
        student4.setCompletedCourses(strList45);
        int int50 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList51 = student4.getCompletedCourses();
        business.Student student56 = new business.Student("hi!", "", "hi!", 0);
        student56.addCompletedCourse("");
        java.lang.String str59 = student56.getName();
        int int60 = student56.getEnrollmentYear();
        java.lang.String str61 = student56.toString();
        java.util.List<java.lang.String> strList62 = student56.getCompletedCourses();
        student4.setCompletedCourses(strList62);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  (, Class of 0)" + "'", str28, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str61, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList62);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)", (-1));
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        student12.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList16 = student12.getCompletedCourses();
        java.lang.String str17 = student12.getName();
        business.Student student22 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student22.setStudentId("hi! -  (hi!, Class of 0)");
        int int25 = student22.getEnrollmentYear();
        java.util.List<java.lang.String> strList26 = student22.getCompletedCourses();
        student12.setCompletedCourses(strList26);
        student4.setCompletedCourses(strList26);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str31 = student4.getMajor();
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        java.lang.String str34 = student4.getStudentId();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str34, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = null;
        student4.setCompletedCourses(strList10);
        business.Student student16 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student16.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList19 = student16.getCompletedCourses();
        java.util.List<java.lang.String> strList20 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList20);
        java.lang.String str22 = student4.getStudentId();
        student4.setEnrollmentYear((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getName();
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.setMajor("");
        java.lang.String str16 = student4.toString();
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi! (, Class of 100)" + "'", str16, "hi! - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        int int6 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        student4.setName("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        student4.setStudentId(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)" + "'", str7, " -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        student14.setCompletedCourses((java.util.List<java.lang.String>) strList19);
        java.lang.String str22 = student14.getName();
        student14.setStudentId(" -  (, Class of 0)");
        student14.setMajor(" -  (, Class of 10)");
        student14.setMajor(" - hi! (, Class of 0)");
        business.Student student33 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str34 = student33.getName();
        java.util.List<java.lang.String> strList35 = student33.getCompletedCourses();
        business.Student student40 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList41 = student40.getCompletedCourses();
        student33.setCompletedCourses(strList41);
        student33.setName(" - hi! (, Class of 0)");
        java.lang.String str45 = student33.getName();
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        student50.setName("hi!");
        student50.addCompletedCourse("");
        student50.setEnrollmentYear((int) (short) 100);
        java.lang.String str58 = student50.getName();
        java.util.List<java.lang.String> strList59 = student50.getCompletedCourses();
        student33.setCompletedCourses(strList59);
        student14.setCompletedCourses(strList59);
        student4.setCompletedCourses(strList59);
        java.util.List<java.lang.String> strList63 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " - hi! (, Class of 0)" + "'", str45, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList63);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        java.lang.String str15 = student4.getName();
        int int16 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str14 = student4.toString();
        student4.setName("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str14, " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str12 = student4.getName();
        business.Student student17 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student17.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList20 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList20);
        student4.setEnrollmentYear((int) 'a');
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setName(" -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)");
        student4.setName(" - hi! (, Class of 32)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear(0);
        java.lang.String str10 = student4.getMajor();
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)");
        java.lang.String str13 = student4.getName();
        student4.setMajor("hi! -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) (hi!, Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)", "hi! -  (hi!, Class of 0) -  (, Class of 32)", "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)", (int) (byte) 0);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getName();
        int int11 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(52);
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        student17.addCompletedCourse("");
        student17.addCompletedCourse("");
        business.Student student26 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student31 = new business.Student("hi!", "", "hi!", 0);
        student31.setName(" -  (, Class of 10)");
        student31.setMajor("");
        java.lang.String[] strArray39 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        student31.setCompletedCourses((java.util.List<java.lang.String>) strList40);
        student26.setCompletedCourses((java.util.List<java.lang.String>) strList40);
        student17.setCompletedCourses((java.util.List<java.lang.String>) strList40);
        java.lang.String str45 = student17.getStudentId();
        student17.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        int int48 = student17.getEnrollmentYear();
        java.util.List<java.lang.String> strList49 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList49);
        student4.setMajor("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setEnrollmentYear(32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(strList49);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        business.Student student4 = new business.Student(" - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)", " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", 0);
        java.lang.String str5 = student4.getStudentId();
        student4.setName("hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str5, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        business.Student student4 = new business.Student(" -  (hi!, Class of 10)", "hi! -  (hi!, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", 97);
        student4.setEnrollmentYear(0);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str8 = student4.toString();
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 97)" + "'", str8, "hi! -  (hi!, Class of 97)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 97)" + "'", str10, "hi! -  (hi!, Class of 97)");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        student4.setStudentId("hi! -  (, Class of 10)");
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str12, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) (byte) 100);
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        student4.setEnrollmentYear((int) (short) 1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", "", 1);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        student9.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str16 = student9.getMajor();
        java.lang.String str17 = student9.getMajor();
        java.util.List<java.lang.String> strList18 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        java.lang.String str20 = student4.getMajor();
        student4.setEnrollmentYear(0);
        int int23 = student4.getEnrollmentYear();
        java.lang.String str24 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str24, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str19 = student4.getMajor();
        int int20 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(1);
        business.Student student27 = new business.Student("hi!", "", "hi!", 0);
        student27.setName(" -  (, Class of 10)");
        student27.setMajor("");
        student27.setName(" - hi! (, Class of 100)");
        student27.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int36 = student27.getEnrollmentYear();
        int int37 = student27.getEnrollmentYear();
        java.util.List<java.lang.String> strList38 = student27.getCompletedCourses();
        student4.setCompletedCourses(strList38);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setName(" - hi! (, Class of 100)");
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", " -  (, Class of 10)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)", 52);
        student4.setMajor("");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) (byte) 100);
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        student4.setEnrollmentYear(52);
        java.util.List<java.lang.String> strList27 = student4.getCompletedCourses();
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", " -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)", " - hi! (, Class of -1)", 100);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        int int10 = student4.getEnrollmentYear();
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        student15.setName("hi!");
        student15.addCompletedCourse("");
        java.util.List<java.lang.String> strList21 = null;
        student15.setCompletedCourses(strList21);
        business.Student student27 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student27.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList30 = student27.getCompletedCourses();
        java.util.List<java.lang.String> strList31 = student27.getCompletedCourses();
        student15.setCompletedCourses(strList31);
        student4.setCompletedCourses(strList31);
        business.Student student38 = new business.Student("hi!", "", "hi!", 0);
        student38.setName(" -  (, Class of 10)");
        student38.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str43 = student38.toString();
        student38.addCompletedCourse(" - hi! (, Class of -1)");
        java.lang.String str46 = student38.toString();
        java.lang.String str47 = student38.getMajor();
        java.lang.String str48 = student38.getStudentId();
        java.lang.String str49 = student38.getName();
        java.util.List<java.lang.String> strList50 = student38.getCompletedCourses();
        student4.setCompletedCourses(strList50);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str43, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str46, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str49, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList50);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        business.Student student16 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        student16.setStudentId(" -  - hi! (, Class of 0) (, Class of 0)");
        java.lang.String str19 = student16.getMajor();
        business.Student student24 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", 10);
        business.Student student29 = new business.Student("hi!", "", "hi!", 0);
        student29.addCompletedCourse("");
        java.lang.String str32 = student29.getName();
        student29.addCompletedCourse(" -  (, Class of 100)");
        business.Student student39 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str40 = student39.getName();
        student39.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList43 = student39.getCompletedCourses();
        java.lang.String str44 = student39.getName();
        business.Student student49 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student49.setStudentId("hi! -  (hi!, Class of 0)");
        int int52 = student49.getEnrollmentYear();
        java.util.List<java.lang.String> strList53 = student49.getCompletedCourses();
        student39.setCompletedCourses(strList53);
        java.lang.String str55 = student39.toString();
        java.util.List<java.lang.String> strList56 = student39.getCompletedCourses();
        student29.setCompletedCourses(strList56);
        student24.setCompletedCourses(strList56);
        student16.setCompletedCourses(strList56);
        student4.setCompletedCourses(strList56);
        student4.addCompletedCourse("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  (, Class of 10)" + "'", str19, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + " -  (, Class of 10)" + "'", str55, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        student14.addCompletedCourse("");
        java.lang.String str17 = student14.toString();
        java.lang.String str18 = student14.getStudentId();
        business.Student student23 = new business.Student("hi!", "", "hi!", 0);
        student23.setName(" -  (, Class of 10)");
        student23.setMajor("");
        java.lang.String str28 = student23.getMajor();
        business.Student student33 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList34 = student33.getCompletedCourses();
        student23.setCompletedCourses(strList34);
        student14.setCompletedCourses(strList34);
        student4.setCompletedCourses(strList34);
        student4.addCompletedCourse(" -  (hi!, Class of 10)");
        java.lang.String str40 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " -  (, Class of 10)" + "'", str40, " -  (, Class of 10)");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        business.Student student4 = new business.Student(" - hi! ( - hi! (hi!, Class of 52), Class of -1)", " - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)", (int) '4');
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)");
        business.Student student11 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str12 = student11.getStudentId();
        java.lang.String str13 = student11.toString();
        java.lang.String str14 = student11.getName();
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        student19.addCompletedCourse("");
        java.lang.String str22 = student19.toString();
        java.lang.String str23 = student19.getStudentId();
        business.Student student28 = new business.Student("hi!", "", "hi!", 0);
        student28.setName(" -  (, Class of 10)");
        student28.setMajor("");
        java.lang.String str33 = student28.getMajor();
        business.Student student38 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList39 = student38.getCompletedCourses();
        student28.setCompletedCourses(strList39);
        student19.setCompletedCourses(strList39);
        student11.setCompletedCourses(strList39);
        student4.setCompletedCourses(strList39);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str13, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 0)" + "'", str22, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear(0);
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", (int) (byte) 100);
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100) -  - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100) (hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0), Class of 100)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100) -  - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100) (hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0), Class of 100)");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getMajor();
        java.lang.String str14 = student4.getStudentId();
        java.lang.String str15 = student4.getName();
        student4.setName("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (, Class of 0), Class of 10)");
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str12, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str15, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.toString();
        business.Student student17 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        int int20 = student4.getEnrollmentYear();
        int int21 = student4.getEnrollmentYear();
        java.lang.String str22 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  (hi!, Class of 0)", 35);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        business.Student student12 = new business.Student("", "hi!", "", 100);
        java.lang.String str13 = student12.getName();
        java.lang.String str14 = student12.toString();
        int int15 = student12.getEnrollmentYear();
        java.util.List<java.lang.String> strList16 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        java.lang.Class<?> wildcardClass18 = strList16.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 100)" + "'", str14, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str10 = student9.getName();
        student9.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        student17.setCompletedCourses((java.util.List<java.lang.String>) strList22);
        int int25 = student17.getEnrollmentYear();
        student17.setMajor(" -  (, Class of 0)");
        int int28 = student17.getEnrollmentYear();
        student17.setStudentId("hi!");
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        student35.setName("hi!");
        student35.addCompletedCourse("");
        java.util.List<java.lang.String> strList41 = student35.getCompletedCourses();
        java.lang.String str42 = student35.getStudentId();
        java.lang.String str43 = student35.toString();
        business.Student student48 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList49 = student48.getCompletedCourses();
        student35.setCompletedCourses(strList49);
        business.Student student55 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList56 = student55.getCompletedCourses();
        student35.setCompletedCourses(strList56);
        student17.setCompletedCourses(strList56);
        student9.setCompletedCourses(strList56);
        student4.setCompletedCourses(strList56);
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str63 = student4.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " - hi! (, Class of 0)" + "'", str43, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + " -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 10)" + "'", str63, " -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 10)");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        int int7 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (short) 10);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String str14 = student9.getMajor();
        java.lang.String str15 = student9.getName();
        java.util.List<java.lang.String> strList16 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList23 = student22.getCompletedCourses();
        student22.setName("hi!");
        student22.addCompletedCourse("");
        java.util.List<java.lang.String> strList28 = student22.getCompletedCourses();
        int int29 = student22.getEnrollmentYear();
        java.lang.String str30 = student22.toString();
        java.util.List<java.lang.String> strList31 = student22.getCompletedCourses();
        student4.setCompletedCourses(strList31);
        student4.setMajor(" - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " - hi! (, Class of 0)" + "'", str30, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! (, Class of 100)", " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)", "hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)", (int) 'a');
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("hi!", "", "hi!", 0);
        student12.setName(" -  (, Class of 10)");
        student12.setMajor("");
        student12.setName(" - hi! (, Class of 100)");
        java.lang.String[] strArray26 = new java.lang.String[] { " - hi! (, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", " -  (, Class of 10)" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student12.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setStudentId("hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)");
        java.lang.Class<?> wildcardClass33 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { " - hi! (, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", " -  (, Class of 10)" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getName();
        business.Student student14 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student14.setStudentId("hi! -  (hi!, Class of 0)");
        int int17 = student14.getEnrollmentYear();
        java.util.List<java.lang.String> strList18 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        java.lang.String str20 = student4.toString();
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        student4.setStudentId("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setName("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0)");
        java.lang.String str9 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) - hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 97)" + "'", str9, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) - hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 97)");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setName("hi! -  (hi!, Class of 97)");
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        student4.setStudentId("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setEnrollmentYear((-1));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("");
        business.Student student13 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = student4.getStudentId();
        java.lang.String str33 = student4.getName();
        student4.addCompletedCourse(" -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getName();
        business.Student student14 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student14.setStudentId("hi! -  (hi!, Class of 0)");
        int int17 = student14.getEnrollmentYear();
        java.util.List<java.lang.String> strList18 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        business.Student student24 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str25 = student24.getStudentId();
        student24.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student24.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        java.util.List<java.lang.String> strList30 = student24.getCompletedCourses();
        student4.setCompletedCourses(strList30);
        student4.setEnrollmentYear(0);
        java.lang.String str34 = student4.getName();
        java.lang.String str35 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str16 = student4.getName();
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        student21.setName("hi!");
        student21.addCompletedCourse("");
        student21.setEnrollmentYear((int) (short) 100);
        java.lang.String str29 = student21.getName();
        java.util.List<java.lang.String> strList30 = student21.getCompletedCourses();
        student4.setCompletedCourses(strList30);
        int int32 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList33 = student4.getCompletedCourses();
        java.lang.String str34 = student4.getStudentId();
        java.util.List<java.lang.String> strList35 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 0)" + "'", str16, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        student4.setEnrollmentYear((int) (byte) 1);
        student4.addCompletedCourse(" - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        student4.setName("hi! -  (hi!, Class of 1)");
        java.lang.String str13 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  (hi!, Class of 1)" + "'", str13, "hi! -  (hi!, Class of 1)");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setEnrollmentYear(35);
        java.lang.String str21 = student4.getName();
        java.util.List<java.lang.String> strList22 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", "hi! -  (, Class of 100)", "", (int) (byte) 10);
        student4.setStudentId("");
        student4.setEnrollmentYear((int) 'a');
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getName();
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        student12.addCompletedCourse("");
        java.lang.String str15 = student12.toString();
        java.lang.String str16 = student12.getStudentId();
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        student21.setName(" -  (, Class of 10)");
        student21.setMajor("");
        java.lang.String str26 = student21.getMajor();
        business.Student student31 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList32 = student31.getCompletedCourses();
        student21.setCompletedCourses(strList32);
        student12.setCompletedCourses(strList32);
        student4.setCompletedCourses(strList32);
        student4.setEnrollmentYear(35);
        student4.setName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName("hi! - hi! (hi!, Class of 35)");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 100)" + "'", str8, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str9, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! (, Class of 100)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) ( -  (, Class of 10), Class of 100)", (int) 'a');
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName("hi! -  (hi!, Class of 0)");
        java.lang.String str20 = student4.getMajor();
        int int21 = student4.getEnrollmentYear();
        java.lang.String str22 = student4.getMajor();
        java.lang.String str23 = student4.toString();
        int int24 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str23, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        business.Student student14 = new business.Student("", "hi!", "", 100);
        java.lang.String str15 = student14.getMajor();
        java.lang.String str16 = student14.toString();
        java.util.List<java.lang.String> strList17 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        student4.setName("hi! -  (hi!, Class of 0) - hi! -  -  (, Class of 10) (, Class of 1) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 100)" + "'", str16, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str9 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        java.lang.String str12 = student4.getMajor();
        student4.setMajor(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        student4.setName("hi! -  (hi!, Class of 97)");
        java.lang.String str17 = student4.getMajor();
        java.lang.String str18 = student4.getMajor();
        student4.setEnrollmentYear((int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str17, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str18, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" - hi! (hi!, Class of 52)");
        java.lang.String str15 = student4.getName();
        int int16 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str15, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("");
        business.Student student13 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = student4.getStudentId();
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        int int35 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList36 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setMajor(" - hi! -  (hi!, Class of 97) (, Class of 10)");
        java.lang.Class<?> wildcardClass45 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        student12.setCompletedCourses(strList20);
        student4.setCompletedCourses(strList20);
        student4.setEnrollmentYear((int) (byte) 100);
        student4.addCompletedCourse(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList27 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList28 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        business.Student student4 = new business.Student("", " -  (, Class of 100)", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) - hi! ( -  (hi!, Class of 100), Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)", (int) (byte) -1);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.addCompletedCourse(" -  (, Class of 0)");
        java.lang.String str17 = student4.getMajor();
        student4.addCompletedCourse(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setName(" -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        student12.setCompletedCourses(strList20);
        student4.setCompletedCourses(strList20);
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.addCompletedCourse("hi! -  (, Class of 0)");
        java.lang.String str29 = student4.getName();
        java.lang.Class<?> wildcardClass30 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 35) -  - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100) (hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35), Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)", " -  (, Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)", " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (, Class of 0)", (int) ' ');
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 100)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)", "", 0);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.String str13 = student4.getStudentId();
        student4.setEnrollmentYear(10);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str13, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        int int6 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        java.lang.String str11 = student4.getStudentId();
        java.lang.Class<?> wildcardClass12 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str11, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 1)", "hi! -  - hi! (, Class of 0) (, Class of 10)", "hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0)", (int) (short) -1);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! - hi! (hi!, Class of 35)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.getName();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student("", "hi!", "", 100);
        java.lang.String str15 = student14.getName();
        java.lang.String str16 = student14.toString();
        business.Student student21 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        java.util.List<java.lang.String> strList23 = student21.getCompletedCourses();
        java.util.List<java.lang.String> strList24 = student21.getCompletedCourses();
        student14.setCompletedCourses(strList24);
        student4.setCompletedCourses(strList24);
        int int27 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 100)" + "'", str16, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", 52);
        java.lang.String str5 = student4.getMajor();
        student4.setEnrollmentYear((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)" + "'", str5, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        business.Student student15 = new business.Student("hi!", "", "hi!", 0);
        student15.setName(" -  (, Class of 10)");
        student15.setEnrollmentYear((int) '#');
        java.lang.String str20 = student15.getMajor();
        business.Student student25 = new business.Student("", "", "", (int) (short) 0);
        student25.addCompletedCourse("");
        java.lang.String str28 = student25.toString();
        java.lang.String str29 = student25.getStudentId();
        business.Student student34 = new business.Student("hi!", "", "hi!", 0);
        student34.setName(" -  (, Class of 10)");
        student34.setMajor("");
        java.lang.String str39 = student34.getMajor();
        business.Student student44 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList45 = student44.getCompletedCourses();
        student34.setCompletedCourses(strList45);
        student25.setCompletedCourses(strList45);
        student15.setCompletedCourses(strList45);
        student4.setCompletedCourses(strList45);
        java.lang.String str50 = student4.getName();
        java.lang.Class<?> wildcardClass51 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  (, Class of 0)" + "'", str28, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " - hi! (, Class of 0)" + "'", str50, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        business.Student student10 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student10.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList13 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setEnrollmentYear(0);
        java.lang.String str17 = student4.getName();
        java.lang.String str18 = student4.getName();
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! (, Class of 0)" + "'", str17, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! (, Class of 0)" + "'", str18, " - hi! (, Class of 0)");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str19 = student4.getMajor();
        int int20 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass21 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getName();
        student4.setMajor(" -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)", " -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! - hi! ( - hi! (, Class of -1), Class of 35)", (int) (short) 10);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)" + "'", str5, "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("");
        business.Student student13 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = student4.getStudentId();
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        int int35 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList36 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        int int41 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass42 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear(100);
        student4.setName(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        student4.setEnrollmentYear((int) ' ');
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        student4.setEnrollmentYear(100);
        java.lang.String str16 = student4.getMajor();
        student4.setMajor("hi! -  (, Class of 100)");
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        student23.setName("hi!");
        java.lang.String str27 = student23.getName();
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList33 = student32.getCompletedCourses();
        student32.setName("hi!");
        business.Student student40 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str41 = student40.getName();
        java.util.List<java.lang.String> strList42 = student40.getCompletedCourses();
        business.Student student47 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList48 = student47.getCompletedCourses();
        student40.setCompletedCourses(strList48);
        student32.setCompletedCourses(strList48);
        student23.setCompletedCourses(strList48);
        student4.setCompletedCourses(strList48);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str14 = student4.toString();
        student4.setName("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        student4.setStudentId(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.setMajor("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        student4.setStudentId("hi! -  (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str14, " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getName();
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        student12.addCompletedCourse("");
        java.lang.String str15 = student12.toString();
        java.lang.String str16 = student12.getStudentId();
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        student21.setName(" -  (, Class of 10)");
        student21.setMajor("");
        java.lang.String str26 = student21.getMajor();
        business.Student student31 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList32 = student31.getCompletedCourses();
        student21.setCompletedCourses(strList32);
        student12.setCompletedCourses(strList32);
        student4.setCompletedCourses(strList32);
        student4.setEnrollmentYear(35);
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setEnrollmentYear((-1));
        student4.addCompletedCourse(" -  (, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (, Class of 100)");
        int int44 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  (, Class of 100)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)");
        java.lang.String str17 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10) -  -  (, Class of 10) ( -  (, Class of 100), Class of 35)" + "'", str17, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10) -  -  (, Class of 10) ( -  (, Class of 100), Class of 35)");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", 10);
        java.lang.String str5 = student4.getMajor();
        student4.setStudentId("hi! -  (, Class of 100)");
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str5, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (, Class of 100)" + "'", str8, "hi! -  (, Class of 100)");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        student12.setCompletedCourses(strList20);
        student4.setCompletedCourses(strList20);
        student4.setEnrollmentYear((int) (byte) 100);
        int int25 = student4.getEnrollmentYear();
        student4.setName(" - hi! (hi!, Class of 52)");
        student4.addCompletedCourse(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        java.lang.Class<?> wildcardClass30 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        business.Student student4 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        business.Student student10 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str11 = student10.getName();
        java.util.List<java.lang.String> strList12 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        business.Student student4 = new business.Student(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)", " - hi! (, Class of -1)", 100);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)");
        java.lang.String str7 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str7, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        student12.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList16 = student12.getCompletedCourses();
        java.lang.String str17 = student12.getName();
        business.Student student22 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student22.setStudentId("hi! -  (hi!, Class of 0)");
        int int25 = student22.getEnrollmentYear();
        java.util.List<java.lang.String> strList26 = student22.getCompletedCourses();
        student12.setCompletedCourses(strList26);
        student4.setCompletedCourses(strList26);
        student4.setEnrollmentYear((int) (byte) -1);
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String[] strArray17 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = student4.getMajor();
        student4.setName("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str25 = student4.getName();
        int int26 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  (, Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)");
        business.Student student33 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.String str34 = student33.getStudentId();
        business.Student student39 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str40 = student39.getName();
        student39.setEnrollmentYear((int) (byte) 10);
        java.lang.String str43 = student39.toString();
        student39.setEnrollmentYear((int) (byte) 100);
        java.lang.String str46 = student39.toString();
        java.lang.String str47 = student39.getName();
        java.lang.String str48 = student39.getMajor();
        business.Student student53 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList54 = student53.getCompletedCourses();
        student53.setStudentId("");
        int int57 = student53.getEnrollmentYear();
        student53.setEnrollmentYear((int) (short) 1);
        student53.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student53.setEnrollmentYear((int) '#');
        business.Student student68 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList69 = student68.getCompletedCourses();
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        student68.setCompletedCourses((java.util.List<java.lang.String>) strList73);
        student53.setCompletedCourses((java.util.List<java.lang.String>) strList73);
        student39.setCompletedCourses((java.util.List<java.lang.String>) strList73);
        student33.setCompletedCourses((java.util.List<java.lang.String>) strList73);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList73);
        java.lang.String str80 = student4.getMajor();
        java.lang.String str81 = student4.getMajor();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)" + "'", str25, "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str34, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " -  (, Class of 10)" + "'", str43, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + " -  (, Class of 100)" + "'", str46, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" - hi! (hi!, Class of 52)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setEnrollmentYear(10);
        student4.setMajor("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str11 = student4.getMajor();
        int int12 = student4.getEnrollmentYear();
        student4.setName("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        java.lang.String str15 = student4.toString();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str18 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)" + "'", str15, " - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        business.Student student16 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student16.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList19 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList19);
        java.lang.String str21 = student4.getMajor();
        java.lang.String str22 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str22, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0) -  -  (, Class of 10) (, Class of 100)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)", 0);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)", "", (int) '#');
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)" + "'", str5, " -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getMajor();
        student4.setStudentId(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        student4.setMajor(" - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        student4.addCompletedCourse("hi! -  (, Class of 0) -  (, Class of 100)");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        int int10 = student4.getEnrollmentYear();
        int int11 = student4.getEnrollmentYear();
        student4.setStudentId("hi! - hi! (hi!, Class of 100)");
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.setName(" - hi! (, Class of -1)");
        java.lang.String str9 = student4.toString();
        int int10 = student4.getEnrollmentYear();
        student4.addCompletedCourse("");
        java.lang.String str13 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  - hi! (, Class of -1) (, Class of 0)" + "'", str9, " -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setMajor(" -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.setName(" -  (, Class of 0)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str17 = student16.getName();
        student16.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList20 = student16.getCompletedCourses();
        java.lang.String str21 = student16.getName();
        business.Student student26 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student26.setStudentId("hi! -  (hi!, Class of 0)");
        int int29 = student26.getEnrollmentYear();
        java.util.List<java.lang.String> strList30 = student26.getCompletedCourses();
        student16.setCompletedCourses(strList30);
        java.lang.String str32 = student16.toString();
        java.util.List<java.lang.String> strList33 = student16.getCompletedCourses();
        business.Student student38 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str39 = student38.getName();
        java.lang.String str40 = student38.getName();
        java.lang.String str41 = student38.getStudentId();
        java.lang.String str42 = student38.toString();
        business.Student student47 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList48 = student47.getCompletedCourses();
        student38.setCompletedCourses(strList48);
        student16.setCompletedCourses(strList48);
        student4.setCompletedCourses(strList48);
        student4.setEnrollmentYear(52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " -  (, Class of 10)" + "'", str32, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str42, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        int int10 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList11 = null;
        student4.setCompletedCourses(strList11);
        student4.setMajor("hi! - hi! (hi!, Class of 35) -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.setMajor("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        student4.addCompletedCourse("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        java.lang.String str12 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", (int) ' ');
        student4.setStudentId(" - hi! (, Class of -1)");
        student4.setStudentId("hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        student4.setMajor("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        java.lang.String str13 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" - hi! (hi!, Class of 52)");
        student4.addCompletedCourse(" - hi! (, Class of 0) - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str11 = student4.toString();
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getMajor();
        java.lang.String str14 = student4.toString();
        student4.setName("hi! -  (hi!, Class of 0)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0) - hi! ( -  (hi!, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 100)" + "'", str11, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 100)" + "'", str14, " -  (, Class of 100)");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)" + "'", str15, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  (, Class of 100)");
        java.lang.String str15 = student4.getMajor();
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str21 = student20.getName();
        student20.setEnrollmentYear((int) (byte) 10);
        student20.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student20.addCompletedCourse(" -  (, Class of 0)");
        int int28 = student20.getEnrollmentYear();
        student20.setMajor("hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)");
        business.Student student35 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) (byte) 0);
        int int36 = student35.getEnrollmentYear();
        java.util.List<java.lang.String> strList37 = student35.getCompletedCourses();
        student20.setCompletedCourses(strList37);
        student4.setCompletedCourses(strList37);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 100)" + "'", str15, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str15 = student4.getMajor();
        java.lang.String str16 = student4.getName();
        int int17 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("");
        student4.setStudentId(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.setStudentId("hi! - hi! ( - hi! (, Class of -1), Class of 35)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.lang.String str10 = student4.getMajor();
        int int11 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String[] strArray17 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = student4.toString();
        int int23 = student4.getEnrollmentYear();
        int int24 = student4.getEnrollmentYear();
        business.Student student29 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str30 = student29.getName();
        student29.setEnrollmentYear((int) (short) 100);
        student29.setName("");
        business.Student student39 = new business.Student("hi!", "", "hi!", 0);
        student39.addCompletedCourse("");
        java.util.List<java.lang.String> strList42 = student39.getCompletedCourses();
        student29.setCompletedCourses(strList42);
        student4.setCompletedCourses(strList42);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (, Class of 100)" + "'", str22, "hi! -  (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = null;
        student4.setCompletedCourses(strList10);
        business.Student student16 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student16.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList19 = student16.getCompletedCourses();
        java.util.List<java.lang.String> strList20 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList20);
        java.lang.String str22 = student4.getStudentId();
        student4.setEnrollmentYear(35);
        java.lang.Class<?> wildcardClass25 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String[] strArray17 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = student4.getMajor();
        business.Student student27 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str28 = student27.getMajor();
        java.lang.String str29 = student27.getStudentId();
        student27.setEnrollmentYear((int) 'a');
        business.Student student36 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str37 = student36.getName();
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        student42.setEnrollmentYear(0);
        business.Student student49 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int50 = student49.getEnrollmentYear();
        student49.setMajor("hi!");
        business.Student student57 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str58 = student57.getName();
        student57.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList61 = student57.getCompletedCourses();
        java.lang.String str62 = student57.getName();
        business.Student student67 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student67.setStudentId("hi! -  (hi!, Class of 0)");
        int int70 = student67.getEnrollmentYear();
        java.util.List<java.lang.String> strList71 = student67.getCompletedCourses();
        student57.setCompletedCourses(strList71);
        student49.setCompletedCourses(strList71);
        student42.setCompletedCourses(strList71);
        student36.setCompletedCourses(strList71);
        student27.setCompletedCourses(strList71);
        student4.setCompletedCourses(strList71);
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str80 = student4.getName();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  (, Class of 0)" + "'", str28, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str29, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        business.Student student4 = new business.Student(" - hi! (, Class of -1)", "hi! - hi! (hi!, Class of 100)", "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", 100);
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.addCompletedCourse("");
        java.util.List<java.lang.String> strList21 = student18.getCompletedCourses();
        java.lang.String str22 = student18.getName();
        business.Student student27 = new business.Student("hi!", "", "hi!", 0);
        student27.setName(" -  (, Class of 10)");
        student27.setEnrollmentYear((int) '#');
        java.lang.String str32 = student27.getMajor();
        java.util.List<java.lang.String> strList33 = student27.getCompletedCourses();
        student18.setCompletedCourses(strList33);
        student4.setCompletedCourses(strList33);
        business.Student student40 = new business.Student("", "", "", (int) (short) 0);
        student40.addCompletedCourse("");
        java.lang.String str43 = student40.toString();
        java.util.List<java.lang.String> strList44 = student40.getCompletedCourses();
        student4.setCompletedCourses(strList44);
        java.lang.String str46 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " -  (, Class of 0)" + "'", str43, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)" + "'", str46, "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", "", (int) (byte) 0);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getName();
        student4.setEnrollmentYear((-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        java.lang.String str5 = student4.getName();
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( -  (, Class of 100), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        student4.setName("hi!");
        java.lang.String str15 = student4.getName();
        int int16 = student4.getEnrollmentYear();
        java.lang.String str17 = student4.getName();
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str23 = student22.getName();
        student22.setEnrollmentYear(10);
        student22.setEnrollmentYear((int) (byte) 0);
        student22.setMajor(" - hi! (, Class of 0)");
        java.lang.String str30 = student22.getName();
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        student35.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str39 = student35.getName();
        business.Student student44 = new business.Student("hi!", "", "hi!", 0);
        student44.setName(" -  (, Class of 10)");
        student44.setMajor("");
        java.lang.String str49 = student44.getMajor();
        java.lang.String str50 = student44.getStudentId();
        java.lang.String str51 = student44.getName();
        java.util.List<java.lang.String> strList52 = student44.getCompletedCourses();
        student44.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str55 = student44.getStudentId();
        java.lang.String str56 = student44.getMajor();
        business.Student student61 = new business.Student("hi!", "", "hi!", 0);
        student61.setName(" -  (, Class of 10)");
        student61.setMajor("");
        student61.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str68 = student61.getMajor();
        java.lang.String str69 = student61.getMajor();
        student61.setName("hi!");
        java.lang.String str72 = student61.getName();
        business.Student student77 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList78 = student77.getCompletedCourses();
        student61.setCompletedCourses(strList78);
        student44.setCompletedCourses(strList78);
        student35.setCompletedCourses(strList78);
        student22.setCompletedCourses(strList78);
        student4.setCompletedCourses(strList78);
        java.util.List<java.lang.String> strList84 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass85 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str39, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " -  (, Class of 10)" + "'", str51, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str56, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str68, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str69, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)", 0);
        student4.addCompletedCourse(" -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        java.lang.String str13 = student4.toString();
        student4.setName(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)" + "'", str13, "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("");
        business.Student student13 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = student4.getStudentId();
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        int int35 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList36 = student4.getCompletedCourses();
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setName(" -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)");
        java.lang.String str41 = student4.toString();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " -  -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0) (, Class of 0)" + "'", str41, " -  -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0) (, Class of 0)");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (hi!, Class of 0) -  (, Class of 0)", "hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)", 52);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getMajor();
        int int9 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) ( -  (, Class of 100), Class of 1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (, Class of 100)" + "'", str8, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        business.Student student4 = new business.Student(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)", "", "hi! -  -  (, Class of 10) (, Class of 1)", 100);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)" + "'", str5, " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str8 = student4.getName();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str13 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str8, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97), Class of 97)" + "'", str13, " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97), Class of 97)");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str17 = student4.getStudentId();
        int int18 = student4.getEnrollmentYear();
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        student23.setCompletedCourses((java.util.List<java.lang.String>) strList28);
        java.lang.String str31 = student23.getName();
        student23.setStudentId(" -  (, Class of 0)");
        student23.setMajor(" -  (, Class of 10)");
        student23.setMajor(" - hi! (, Class of 0)");
        java.lang.String str38 = student23.getMajor();
        student23.setName("hi!");
        business.Student student45 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList46 = student45.getCompletedCourses();
        java.util.List<java.lang.String> strList47 = null;
        student45.setCompletedCourses(strList47);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (, Class of 100)", "", " - hi! (hi!, Class of 52)", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        student45.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student23.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " - hi! (, Class of 0)" + "'", str38, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (, Class of 100)", "", " - hi! (hi!, Class of 52)", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str15 = student4.getMajor();
        student4.setName("hi! -  (, Class of 100)");
        java.lang.String str18 = student4.getMajor();
        student4.setStudentId(" -  (hi!, Class of 10)");
        java.lang.String str21 = student4.getMajor();
        java.lang.Class<?> wildcardClass22 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        int int10 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (, Class of 100)");
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 97)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)", 0);
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear(1);
        java.lang.Class<?> wildcardClass12 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)" + "'", str8, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)" + "'", str9, "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", " - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)", "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)", 52);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        java.lang.String str12 = student4.getName();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        student4.setName(" -  - hi! (, Class of 0) (, Class of 100)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        int int19 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  (, Class of 0)");
        int int12 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! (hi!, Class of 35)");
        business.Student student19 = new business.Student("hi!", "", "hi!", 0);
        student19.setName(" -  (, Class of 10)");
        student19.setMajor("");
        student19.setEnrollmentYear((int) (byte) 100);
        java.lang.String str26 = student19.getName();
        student19.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList29 = student19.getCompletedCourses();
        student4.setCompletedCourses(strList29);
        student4.addCompletedCourse("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 10)" + "'", str26, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        student12.setCompletedCourses(strList20);
        student4.setCompletedCourses(strList20);
        student4.setName(" -  (, Class of 0)");
        student4.setMajor("");
        java.util.List<java.lang.String> strList27 = student4.getCompletedCourses();
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        java.util.List<java.lang.String> strList7 = null;
        student4.setCompletedCourses(strList7);
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.toString();
        int int11 = student4.getEnrollmentYear();
        student4.setName(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str9, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        student4.setEnrollmentYear((int) (short) 10);
        java.lang.String str13 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        business.Student student4 = new business.Student("", "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)", "hi! -  - hi! (, Class of 0) (, Class of 10)", (int) '4');
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getName();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        business.Student student4 = new business.Student(" - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)", 0);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        business.Student student4 = new business.Student(" - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)", " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", 0);
        java.lang.String str5 = student4.getStudentId();
        int int6 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str5, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.getStudentId();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str16 = student4.getName();
        java.util.List<java.lang.String> strList17 = null;
        student4.setCompletedCourses(strList17);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", (int) '4');
        student4.setName("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str8, " - hi! (hi!, Class of 52)");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  ( -  (, Class of 0), Class of 0)", "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        business.Student student10 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student15 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        student10.setCompletedCourses(strList16);
        student10.setEnrollmentYear((int) (byte) 1);
        student10.setEnrollmentYear((int) (byte) 1);
        java.lang.String str22 = student10.getMajor();
        business.Student student27 = new business.Student("", "hi!", "", 100);
        java.lang.String str28 = student27.getMajor();
        int int29 = student27.getEnrollmentYear();
        student27.addCompletedCourse(" - hi! (, Class of 0)");
        student27.addCompletedCourse("");
        student27.setStudentId("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str36 = student27.getStudentId();
        business.Student student41 = new business.Student("hi!", "", "hi!", 0);
        student41.setName(" -  (, Class of 10)");
        student41.setMajor("");
        java.lang.String str46 = student41.getMajor();
        java.lang.String str47 = student41.getStudentId();
        java.lang.String str48 = student41.getName();
        java.util.List<java.lang.String> strList49 = student41.getCompletedCourses();
        student41.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str52 = student41.getStudentId();
        java.lang.String str53 = student41.getName();
        business.Student student58 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList59 = student58.getCompletedCourses();
        java.util.List<java.lang.String> strList60 = student58.getCompletedCourses();
        student41.setCompletedCourses(strList60);
        student27.setCompletedCourses(strList60);
        business.Student student67 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", "", 1);
        business.Student student72 = new business.Student("hi!", "", "hi!", 0);
        student72.setName(" -  (, Class of 10)");
        student72.setMajor("");
        student72.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str79 = student72.getMajor();
        java.lang.String str80 = student72.getMajor();
        java.util.List<java.lang.String> strList81 = student72.getCompletedCourses();
        student67.setCompletedCourses(strList81);
        student67.setEnrollmentYear((int) (short) 0);
        student67.setEnrollmentYear((int) '#');
        student67.addCompletedCourse("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList89 = student67.getCompletedCourses();
        student27.setCompletedCourses(strList89);
        student10.setCompletedCourses(strList89);
        student4.setCompletedCourses(strList89);
        java.lang.String str93 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str5, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)" + "'", str36, "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + " -  (, Class of 10)" + "'", str48, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + " -  (, Class of 10)" + "'", str53, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str79, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str80, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str93, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 100)");
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str15 = student14.getName();
        student14.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList18 = student14.getCompletedCourses();
        java.lang.String str19 = student14.getName();
        business.Student student24 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student24.setStudentId("hi! -  (hi!, Class of 0)");
        int int27 = student24.getEnrollmentYear();
        java.util.List<java.lang.String> strList28 = student24.getCompletedCourses();
        student14.setCompletedCourses(strList28);
        java.lang.String str30 = student14.toString();
        java.util.List<java.lang.String> strList31 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList31);
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str35 = student4.getName();
        java.lang.String str36 = student4.getMajor();
        java.lang.String str37 = student4.getMajor();
        student4.setName("hi! - hi! (, Class of 100)");
        java.lang.String str40 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 10)" + "'", str30, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)");
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)");
        student4.addCompletedCourse("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getName();
        student4.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 10)" + "'", str6, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  (hi!, Class of 0) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) ( -  (, Class of 0), Class of 1)" + "'", str9, "hi! -  (hi!, Class of 0) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) ( -  (, Class of 0), Class of 1)");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        business.Student student4 = new business.Student(" - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)", (-1));
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) - hi! - hi! (hi!, Class of 100) ( -  (, Class of 100), Class of 52)");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        business.Student student20 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str21 = student20.getMajor();
        java.lang.String str22 = student20.getStudentId();
        java.util.List<java.lang.String> strList23 = null;
        student20.setCompletedCourses(strList23);
        business.Student student29 = new business.Student("", "hi!", "", 100);
        java.lang.String str30 = student29.getMajor();
        java.lang.String str31 = student29.toString();
        java.util.List<java.lang.String> strList32 = student29.getCompletedCourses();
        java.lang.String str33 = student29.getName();
        java.lang.String str34 = student29.getStudentId();
        java.util.List<java.lang.String> strList35 = student29.getCompletedCourses();
        student20.setCompletedCourses(strList35);
        student4.setCompletedCourses(strList35);
        student4.setEnrollmentYear((int) (byte) 100);
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 0)");
        java.lang.String str42 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 0)" + "'", str21, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str22, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " - hi! (, Class of 100)" + "'", str31, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        business.Student student14 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student19 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        student14.setCompletedCourses(strList20);
        student4.setCompletedCourses(strList20);
        java.lang.String str23 = student4.toString();
        business.Student student28 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        business.Student student33 = new business.Student("", "", "", (int) (short) 0);
        student33.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList36 = student33.getCompletedCourses();
        student28.setCompletedCourses(strList36);
        student4.setCompletedCourses(strList36);
        java.lang.String str39 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (, Class of 10)" + "'", str23, "hi! -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getMajor();
        business.Student student20 = new business.Student("hi!", "", "hi!", 0);
        student20.setName(" -  (, Class of 10)");
        student20.setMajor("");
        java.lang.String str25 = student20.getMajor();
        java.lang.String str26 = student20.getStudentId();
        java.lang.String str27 = student20.getName();
        java.util.List<java.lang.String> strList28 = student20.getCompletedCourses();
        student20.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str31 = student20.getStudentId();
        java.lang.String str32 = student20.getMajor();
        business.Student student37 = new business.Student("hi!", "", "hi!", 0);
        student37.setName(" -  (, Class of 10)");
        student37.setMajor("");
        student37.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str44 = student37.getMajor();
        java.lang.String str45 = student37.getMajor();
        student37.setName("hi!");
        java.lang.String str48 = student37.getName();
        business.Student student53 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList54 = student53.getCompletedCourses();
        student37.setCompletedCourses(strList54);
        student20.setCompletedCourses(strList54);
        student4.setCompletedCourses(strList54);
        java.lang.Class<?> wildcardClass58 = strList54.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " -  (, Class of 10)" + "'", str27, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str32, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str44, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str45, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setMajor(" - hi! (, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        int int21 = student4.getEnrollmentYear();
        java.lang.String str22 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        int int14 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str17 = student4.getName();
        java.lang.String str18 = student4.getName();
        int int19 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (, Class of 100)" + "'", str8, " - hi! (, Class of 100)");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getStudentId();
        student4.setEnrollmentYear(0);
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        student4.setStudentId(" -  -  (, Class of 10) (hi!, Class of 35)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.getStudentId();
        int int11 = student4.getEnrollmentYear();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str17 = student4.getStudentId();
        int int18 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        java.lang.String str22 = student4.getStudentId();
        java.lang.String str23 = student4.getStudentId();
        student4.addCompletedCourse(" -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 0)" + "'", str22, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 0)" + "'", str23, " -  (, Class of 0)");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        student4.addCompletedCourse(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)");
        java.lang.String str7 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (, Class of 100) -  ( -  (, Class of 10), Class of 100)" + "'", str7, " - hi! (, Class of 100) -  ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        business.Student student13 = new business.Student("hi!", "", "hi!", 0);
        student13.setName(" -  (, Class of 10)");
        student13.setMajor("");
        java.lang.String str18 = student13.getMajor();
        java.lang.String str19 = student13.getStudentId();
        java.lang.String str20 = student13.getName();
        java.util.List<java.lang.String> strList21 = student13.getCompletedCourses();
        student13.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str24 = student13.getStudentId();
        java.lang.String str25 = student13.getName();
        business.Student student30 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        java.util.List<java.lang.String> strList32 = student30.getCompletedCourses();
        student13.setCompletedCourses(strList32);
        business.Student student38 = new business.Student("", "hi!", "", 100);
        java.lang.String str39 = student38.getName();
        business.Student student44 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList45 = student44.getCompletedCourses();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        student44.setCompletedCourses((java.util.List<java.lang.String>) strList49);
        int int52 = student44.getEnrollmentYear();
        business.Student student57 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList58 = student57.getCompletedCourses();
        student57.setName("hi!");
        student57.addCompletedCourse("");
        java.util.List<java.lang.String> strList63 = student57.getCompletedCourses();
        java.lang.String str64 = student57.getStudentId();
        java.lang.String str65 = student57.toString();
        business.Student student70 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList71 = student70.getCompletedCourses();
        student57.setCompletedCourses(strList71);
        business.Student student77 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList78 = student77.getCompletedCourses();
        student57.setCompletedCourses(strList78);
        student44.setCompletedCourses(strList78);
        student38.setCompletedCourses(strList78);
        student13.setCompletedCourses(strList78);
        student4.setCompletedCourses(strList78);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 10)" + "'", str25, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + " - hi! (, Class of 0)" + "'", str65, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) -1);
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.lang.String str9 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.lang.String str5 = student4.getName();
        student4.setStudentId(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        student4.setName("hi! -  (hi!, Class of 97)");
        java.lang.String str10 = student4.toString();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100)" + "'", str10, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100)");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName("hi! -  (hi!, Class of 0)");
        java.lang.String str20 = student4.getMajor();
        int int21 = student4.getEnrollmentYear();
        java.lang.String str22 = student4.getMajor();
        student4.setEnrollmentYear(52);
        java.lang.String str25 = student4.getMajor();
        java.util.List<java.lang.String> strList26 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        business.Student student10 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str11 = student10.getMajor();
        business.Student student16 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int17 = student16.getEnrollmentYear();
        student16.setMajor("hi!");
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str25 = student24.getName();
        student24.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList28 = student24.getCompletedCourses();
        java.lang.String str29 = student24.getName();
        business.Student student34 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student34.setStudentId("hi! -  (hi!, Class of 0)");
        int int37 = student34.getEnrollmentYear();
        java.util.List<java.lang.String> strList38 = student34.getCompletedCourses();
        student24.setCompletedCourses(strList38);
        student16.setCompletedCourses(strList38);
        java.util.List<java.lang.String> strList41 = student16.getCompletedCourses();
        student10.setCompletedCourses(strList41);
        student4.setCompletedCourses(strList41);
        student4.setEnrollmentYear((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str9 = student4.toString();
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.toString();
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 100)" + "'", str11, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 100)" + "'", str12, " - hi! (, Class of 100)");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str10, "hi! - hi! (hi!, Class of 35)");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setName("hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        business.Student student13 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student13.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList16 = student13.getCompletedCourses();
        java.util.List<java.lang.String> strList17 = student13.getCompletedCourses();
        java.lang.String str18 = student13.toString();
        student13.setEnrollmentYear((int) (short) -1);
        student13.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str23 = student13.getMajor();
        business.Student student28 = new business.Student("hi!", "", "hi!", 0);
        student28.setName(" -  (, Class of 10)");
        student28.setMajor("");
        student28.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str35 = student28.getMajor();
        java.lang.String str36 = student28.getMajor();
        student28.setName("hi!");
        java.lang.String str39 = student28.getName();
        int int40 = student28.getEnrollmentYear();
        student28.setName("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList43 = student28.getCompletedCourses();
        student13.setCompletedCourses(strList43);
        student4.setCompletedCourses(strList43);
        java.lang.Class<?> wildcardClass46 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str18, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str35, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str36, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", " -  (, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (, Class of 100)", 0);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getName();
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        student12.addCompletedCourse("");
        java.lang.String str15 = student12.toString();
        java.lang.String str16 = student12.getStudentId();
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        student21.setName(" -  (, Class of 10)");
        student21.setMajor("");
        java.lang.String str26 = student21.getMajor();
        business.Student student31 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList32 = student31.getCompletedCourses();
        student21.setCompletedCourses(strList32);
        student12.setCompletedCourses(strList32);
        student4.setCompletedCourses(strList32);
        student4.setEnrollmentYear(35);
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setEnrollmentYear(97);
        java.lang.String str42 = student4.getName();
        java.lang.String str43 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)" + "'", str42, "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)" + "'", str43, " - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        java.lang.String str16 = student4.getStudentId();
        java.lang.String str17 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str19 = student4.getMajor();
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str22 = student4.getMajor();
        java.lang.String str23 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str22, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str23, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setName(" - hi! (, Class of 100)");
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int13 = student4.getEnrollmentYear();
        int int14 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        java.lang.String str16 = student4.getName();
        student4.setStudentId("");
        java.lang.String str19 = student4.getMajor();
        java.lang.String str20 = student4.getName();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 100)" + "'", str16, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 100)" + "'", str20, " - hi! (, Class of 100)");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName("hi! -  (hi!, Class of 0)");
        java.lang.String str20 = student4.getMajor();
        int int21 = student4.getEnrollmentYear();
        java.lang.String str22 = student4.getMajor();
        student4.setEnrollmentYear(52);
        java.lang.String str25 = student4.getMajor();
        business.Student student30 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str31 = student30.getName();
        student30.setEnrollmentYear((int) (short) 100);
        student30.setMajor(" -  (, Class of 10)");
        student30.setEnrollmentYear(100);
        java.util.List<java.lang.String> strList38 = student30.getCompletedCourses();
        business.Student student43 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student48 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList49 = student48.getCompletedCourses();
        student43.setCompletedCourses(strList49);
        student30.setCompletedCourses(strList49);
        int int52 = student30.getEnrollmentYear();
        business.Student student57 = new business.Student("hi!", "", "hi!", 0);
        student57.setName(" -  (, Class of 10)");
        student57.setMajor("");
        java.lang.String str62 = student57.getMajor();
        java.lang.String str63 = student57.getName();
        java.util.List<java.lang.String> strList64 = student57.getCompletedCourses();
        student57.setEnrollmentYear(1);
        student57.addCompletedCourse("hi!");
        java.lang.String str69 = student57.toString();
        student57.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str72 = student57.toString();
        java.lang.String str73 = student57.getName();
        java.util.List<java.lang.String> strList74 = student57.getCompletedCourses();
        student30.setCompletedCourses(strList74);
        student4.setCompletedCourses(strList74);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + " -  (, Class of 10)" + "'", str63, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str69, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)" + "'", str72, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + " -  (, Class of 10)" + "'", str73, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList74);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.toString();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) - hi! - hi! (hi!, Class of 100) ( -  (, Class of 100), Class of 52)");
        student4.setEnrollmentYear((int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 0)" + "'", str12, "hi! -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", 10);
        java.lang.String str5 = student4.getMajor();
        student4.setStudentId("hi! -  (, Class of 100)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str5, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setName(" - hi! (, Class of 100)");
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str15 = student4.getName();
        student4.setStudentId(" -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! (, Class of 100)" + "'", str15, " - hi! (, Class of 100)");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", " - hi! (, Class of 0)", "", (int) '4');
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        business.Student student11 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getMajor();
        java.lang.String str7 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 100)" + "'", str6, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", (-1));
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str5, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)" + "'", str9, "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)" + "'", str10, "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        business.Student student4 = new business.Student("hi!", " - hi! (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", 10);
        student4.setEnrollmentYear((int) (byte) 100);
    }
}

