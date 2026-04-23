import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        student4.setName("hi!");
        java.lang.String str15 = student4.getName();
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList21 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList21);
        java.lang.String str23 = student4.getMajor();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        student4.setEnrollmentYear((int) '#');
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str23 = student4.getName();
        student4.setStudentId("hi! -  (hi!, Class of 0) - hi! -  -  (, Class of 10) (, Class of 1) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " - hi! (, Class of 0)" + "'", str23, " - hi! (, Class of 0)");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)", " -  - hi! (, Class of -1) (, Class of 0)", (int) (byte) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        business.Student student4 = new business.Student("hi! -  - hi! (, Class of 100) (, Class of 0)", "hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)", "hi! -  (hi!, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  - hi! (, Class of 100) (, Class of 0)" + "'", str5, "hi! -  - hi! (, Class of 100) (, Class of 0)");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.setEnrollmentYear((int) ' ');
        int int19 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", (-1));
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        java.lang.String str8 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str5, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)" + "'", str8, "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        business.Student student4 = new business.Student(" - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)", "hi! -  -  ( -  (, Class of 0), Class of 0) (hi!, Class of 0)", " -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)", (int) ' ');
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        student4.setEnrollmentYear(52);
        java.lang.String str22 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str13, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        student4.addCompletedCourse(" - hi! (hi!, Class of 52)");
        java.lang.String str25 = student4.toString();
        student4.addCompletedCourse(" - hi! (hi!, Class of 10)");
        java.util.List<java.lang.String> strList28 = null;
        student4.setCompletedCourses(strList28);
        java.lang.String str30 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (, Class of 100)" + "'", str25, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        student4.setEnrollmentYear((int) (byte) 10);
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
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", (int) (short) 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0), Class of 100)" + "'", str6, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0), Class of 100)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str23 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str23, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getName();
        int int11 = student4.getEnrollmentYear();
        business.Student student16 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student16.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList20 = student16.getCompletedCourses();
        business.Student student25 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str26 = student25.getName();
        student25.setEnrollmentYear((int) (byte) 10);
        java.lang.String str29 = student25.toString();
        student25.setEnrollmentYear((int) (byte) 100);
        java.lang.String str32 = student25.toString();
        java.lang.String str33 = student25.getName();
        java.lang.String str34 = student25.getMajor();
        business.Student student39 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList40 = student39.getCompletedCourses();
        student39.setStudentId("");
        int int43 = student39.getEnrollmentYear();
        student39.setEnrollmentYear((int) (short) 1);
        student39.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student39.setEnrollmentYear((int) '#');
        business.Student student54 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList55 = student54.getCompletedCourses();
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        student54.setCompletedCourses((java.util.List<java.lang.String>) strList59);
        student39.setCompletedCourses((java.util.List<java.lang.String>) strList59);
        student25.setCompletedCourses((java.util.List<java.lang.String>) strList59);
        student16.setCompletedCourses((java.util.List<java.lang.String>) strList59);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList59);
        student4.setEnrollmentYear((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 10)" + "'", str29, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " -  (, Class of 100)" + "'", str32, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        business.Student student13 = new business.Student("hi!", "", "hi!", 0);
        student13.setName(" -  (, Class of 10)");
        student13.setEnrollmentYear((int) '#');
        java.lang.String str18 = student13.getMajor();
        java.util.List<java.lang.String> strList19 = student13.getCompletedCourses();
        student4.setCompletedCourses(strList19);
        student4.setName(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str23 = student4.toString();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  -  - hi! (, Class of 0) (, Class of 100) (hi!, Class of 0)" + "'", str23, "hi! -  -  - hi! (, Class of 0) (, Class of 100) (hi!, Class of 0)");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student16.setStudentId("");
        int int20 = student16.getEnrollmentYear();
        student16.setEnrollmentYear((int) (short) 1);
        student16.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str30 = student29.getName();
        student29.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList33 = student29.getCompletedCourses();
        java.lang.String str34 = student29.getName();
        business.Student student39 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student39.setStudentId("hi! -  (hi!, Class of 0)");
        int int42 = student39.getEnrollmentYear();
        java.util.List<java.lang.String> strList43 = student39.getCompletedCourses();
        student29.setCompletedCourses(strList43);
        java.lang.String str45 = student29.toString();
        java.util.List<java.lang.String> strList46 = student29.getCompletedCourses();
        student16.setCompletedCourses(strList46);
        business.Student student52 = new business.Student("hi!", "", "hi!", 0);
        student52.setName(" -  (, Class of 10)");
        student52.setMajor("");
        java.lang.String str57 = student52.getMajor();
        business.Student student62 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList63 = student62.getCompletedCourses();
        student52.setCompletedCourses(strList63);
        student16.setCompletedCourses(strList63);
        student4.setCompletedCourses(strList63);
        business.Student student71 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", "", (int) (byte) 10);
        business.Student student76 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList77 = student76.getCompletedCourses();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        student76.setCompletedCourses((java.util.List<java.lang.String>) strList81);
        int int84 = student76.getEnrollmentYear();
        student76.setMajor(" -  (, Class of 0)");
        int int87 = student76.getEnrollmentYear();
        student76.setStudentId("hi!");
        java.lang.String str90 = student76.toString();
        java.util.List<java.lang.String> strList91 = student76.getCompletedCourses();
        student71.setCompletedCourses(strList91);
        student4.setCompletedCourses(strList91);
        student4.setMajor("hi! -  (, Class of 10)");
        java.lang.String str96 = student4.toString();
        java.lang.String str97 = student4.getStudentId();
        java.lang.String str98 = student4.toString();
        java.lang.String str99 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  (, Class of 10)" + "'", str45, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str90, "hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi! -  (hi! -  (, Class of 10), Class of 10)" + "'", str96, "hi! -  (hi! -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi! -  (hi! -  (, Class of 10), Class of 10)" + "'", str98, "hi! -  (hi! -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "hi!" + "'", str99, "hi!");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 0)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        business.Student student10 = new business.Student("hi!", "", "hi!", 0);
        student10.setName(" -  (, Class of 10)");
        student10.setEnrollmentYear((int) '#');
        java.lang.String str15 = student10.getMajor();
        int int16 = student10.getEnrollmentYear();
        java.util.List<java.lang.String> strList17 = student10.getCompletedCourses();
        java.util.List<java.lang.String> strList18 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.toString();
        business.Student student12 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList13 = student12.getCompletedCourses();
        business.Student student18 = new business.Student("", "hi!", "", 100);
        java.lang.String str19 = student18.getMajor();
        java.lang.String str20 = student18.toString();
        java.util.List<java.lang.String> strList21 = student18.getCompletedCourses();
        java.lang.String str22 = student18.getName();
        java.lang.String str23 = student18.getStudentId();
        java.lang.String str24 = student18.getName();
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList30 = student29.getCompletedCourses();
        student29.setName("hi!");
        student29.addCompletedCourse("");
        java.lang.String str35 = student29.toString();
        java.lang.String str36 = student29.getStudentId();
        java.lang.String str37 = student29.getMajor();
        java.util.List<java.lang.String> strList38 = student29.getCompletedCourses();
        student18.setCompletedCourses(strList38);
        student12.setCompletedCourses(strList38);
        student4.setCompletedCourses(strList38);
        java.util.List<java.lang.String> strList42 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str7, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 100)" + "'", str20, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " - hi! (, Class of 0)" + "'", str35, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str11 = student4.getMajor();
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)");
        student4.setName(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        java.lang.Class<?> wildcardClass16 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (short) 10);
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str7 = student4.getMajor();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)" + "'", str12, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        int int7 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)", " - hi! (, Class of 100) - hi! - hi! (hi!, Class of 100) (hi!, Class of 35)", "hi! -  -  (, Class of 10) (, Class of 1) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 1), Class of -1)", (int) (short) 0);
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        int int23 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getStudentId();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 0)" + "'", str6, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        student4.setStudentId(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str11, " -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        student4.setEnrollmentYear((int) '#');
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str26 = student4.toString();
        student4.addCompletedCourse(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        java.lang.String str31 = student4.getName();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)" + "'", str26, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)" + "'", str31, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        student4.setEnrollmentYear(10);
        student4.setName("hi! -  (, Class of 10)");
        student4.addCompletedCourse("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        business.Student student14 = new business.Student("", "hi!", "", 100);
        java.lang.String str15 = student14.getMajor();
        java.lang.String str16 = student14.toString();
        java.util.List<java.lang.String> strList17 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setMajor(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        business.Student student27 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList28 = student27.getCompletedCourses();
        student27.setStudentId("");
        int int31 = student27.getEnrollmentYear();
        java.lang.String str32 = student27.getMajor();
        student27.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        business.Student student39 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList40 = student39.getCompletedCourses();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        student39.setCompletedCourses((java.util.List<java.lang.String>) strList44);
        int int47 = student39.getEnrollmentYear();
        student39.setMajor(" -  (, Class of 0)");
        int int50 = student39.getEnrollmentYear();
        student39.setStudentId("hi!");
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
        student39.setCompletedCourses(strList78);
        student27.setCompletedCourses(strList78);
        student4.setCompletedCourses(strList78);
        student4.setName(" - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 100)" + "'", str16, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + " - hi! (, Class of 0)" + "'", str65, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        java.lang.String str29 = student4.getMajor();
        student4.addCompletedCourse(" -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)");
        student4.setMajor(" - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str28, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str29, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        java.lang.String str21 = student4.getStudentId();
        java.lang.String str22 = student4.getStudentId();
        student4.setEnrollmentYear((int) '#');
        student4.addCompletedCourse(" -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)");
        student4.setEnrollmentYear((int) (short) 10);
        java.lang.String str29 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setEnrollmentYear((-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        business.Student student4 = new business.Student("hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) ( -  (, Class of 10), Class of 100)", " -  (, Class of 0) -  (, Class of 100)", "hi! -  -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100) (, Class of 100)", (int) 'a');
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        int int17 = student4.getEnrollmentYear();
        java.lang.String str18 = student4.getMajor();
        java.lang.String str19 = student4.getMajor();
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        business.Student student26 = new business.Student("", "", "", (int) (short) 0);
        student26.addCompletedCourse("");
        java.lang.String str29 = student26.toString();
        student26.setEnrollmentYear(97);
        business.Student student36 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str37 = student36.getMajor();
        java.lang.String str38 = student36.getStudentId();
        student36.setStudentId(" -  (, Class of 10)");
        student36.setName(" - hi! (, Class of 0)");
        business.Student student47 = new business.Student("hi!", "", "hi!", 0);
        student47.setName(" -  (, Class of 10)");
        student47.setEnrollmentYear((int) '#');
        java.lang.String str52 = student47.getMajor();
        business.Student student57 = new business.Student("", "", "", (int) (short) 0);
        student57.addCompletedCourse("");
        java.lang.String str60 = student57.toString();
        java.lang.String str61 = student57.getStudentId();
        business.Student student66 = new business.Student("hi!", "", "hi!", 0);
        student66.setName(" -  (, Class of 10)");
        student66.setMajor("");
        java.lang.String str71 = student66.getMajor();
        business.Student student76 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList77 = student76.getCompletedCourses();
        student66.setCompletedCourses(strList77);
        student57.setCompletedCourses(strList77);
        student47.setCompletedCourses(strList77);
        student36.setCompletedCourses(strList77);
        student26.setCompletedCourses(strList77);
        student4.setCompletedCourses(strList77);
        java.util.List<java.lang.String> strList84 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 0)" + "'", str29, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " -  (, Class of 0)" + "'", str37, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str38, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + " -  (, Class of 0)" + "'", str60, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList84);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)", (int) (short) 1);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        student4.setName(" - hi! (, Class of -1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        business.Student student4 = new business.Student("hi! -  -  - hi! (, Class of 0) (, Class of 100) (hi!, Class of 0)", "hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0)", " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi!, Class of 10)", 35);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setMajor("hi! -  (, Class of 0)");
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)" + "'", str8, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        java.lang.String str23 = student4.getName();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)");
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        java.util.List<java.lang.String> strList18 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        int int15 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) ' ');
        student4.setName(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setEnrollmentYear((int) (byte) 100);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (, Class of 100)", 1);
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str5, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getMajor();
        int int11 = student4.getEnrollmentYear();
        business.Student student16 = new business.Student(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)", (int) ' ');
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        java.lang.String str19 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi! ( -  (, Class of 10), Class of 100)" + "'", str19, "hi! - hi! ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", "", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)" + "'", str5, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        java.lang.String str38 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        student4.setMajor(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((-1));
        java.lang.String str15 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of -1)" + "'", str15, " - hi! ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of -1)");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        business.Student student4 = new business.Student(" -  (hi!, Class of 10)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)", "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)", (int) (byte) 10);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str8 = student4.getName();
        business.Student student13 = new business.Student("hi!", "", "hi!", 0);
        student13.setName(" -  (, Class of 10)");
        student13.setMajor("");
        java.lang.String str18 = student13.getMajor();
        java.lang.String str19 = student13.getStudentId();
        java.lang.String str20 = student13.getName();
        java.util.List<java.lang.String> strList21 = student13.getCompletedCourses();
        student13.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str24 = student13.getStudentId();
        java.lang.String str25 = student13.getMajor();
        business.Student student30 = new business.Student("hi!", "", "hi!", 0);
        student30.setName(" -  (, Class of 10)");
        student30.setMajor("");
        student30.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str37 = student30.getMajor();
        java.lang.String str38 = student30.getMajor();
        student30.setName("hi!");
        java.lang.String str41 = student30.getName();
        business.Student student46 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList47 = student46.getCompletedCourses();
        student30.setCompletedCourses(strList47);
        student13.setCompletedCourses(strList47);
        student4.setCompletedCourses(strList47);
        java.util.List<java.lang.String> strList51 = student4.getCompletedCourses();
        int int52 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str8, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str25, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str37, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str38, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        student4.addCompletedCourse("hi!");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        java.lang.String str18 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        student4.setEnrollmentYear((int) '#');
        student4.addCompletedCourse("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList26 = student4.getCompletedCourses();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.addCompletedCourse(" -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)");
        int int31 = student4.getEnrollmentYear();
        java.lang.String str32 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str32, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        student11.addCompletedCourse("");
        java.lang.String str14 = student11.toString();
        student11.setEnrollmentYear(97);
        business.Student student21 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str22 = student21.getMajor();
        java.lang.String str23 = student21.getStudentId();
        student21.setStudentId(" -  (, Class of 10)");
        student21.setName(" - hi! (, Class of 0)");
        business.Student student32 = new business.Student("hi!", "", "hi!", 0);
        student32.setName(" -  (, Class of 10)");
        student32.setEnrollmentYear((int) '#');
        java.lang.String str37 = student32.getMajor();
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        student42.addCompletedCourse("");
        java.lang.String str45 = student42.toString();
        java.lang.String str46 = student42.getStudentId();
        business.Student student51 = new business.Student("hi!", "", "hi!", 0);
        student51.setName(" -  (, Class of 10)");
        student51.setMajor("");
        java.lang.String str56 = student51.getMajor();
        business.Student student61 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList62 = student61.getCompletedCourses();
        student51.setCompletedCourses(strList62);
        student42.setCompletedCourses(strList62);
        student32.setCompletedCourses(strList62);
        student21.setCompletedCourses(strList62);
        student11.setCompletedCourses(strList62);
        student4.setCompletedCourses(strList62);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str6, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 0)" + "'", str14, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 0)" + "'", str22, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  (, Class of 0)" + "'", str45, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strList62);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        student4.setName(" - hi! (hi!, Class of 52)");
        java.lang.String str17 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        student4.setStudentId(" -  - hi! (, Class of 0) (, Class of 100)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0), Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str8 = student4.getName();
        business.Student student13 = new business.Student("hi!", "", "hi!", 0);
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String str23 = student18.getMajor();
        java.lang.String str24 = student18.getName();
        java.util.List<java.lang.String> strList25 = student18.getCompletedCourses();
        student13.setCompletedCourses(strList25);
        student4.setCompletedCourses(strList25);
        java.util.List<java.lang.String> strList28 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str8, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 10)" + "'", str24, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        java.lang.String str21 = student4.getStudentId();
        java.util.List<java.lang.String> strList22 = student4.getCompletedCourses();
        student4.setEnrollmentYear(0);
        student4.setMajor(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.getName();
        java.lang.String str8 = student4.getMajor();
        student4.setName(" - hi! (, Class of 35)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        student4.setStudentId("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.setName(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 100);
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getName();
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        java.lang.String str18 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (, Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", 52);
        java.lang.String str5 = student4.toString();
        student4.setMajor(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
        business.Student student12 = new business.Student(" -  (, Class of 100)", "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (short) 0);
        java.lang.String str13 = student12.toString();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)" + "'", str5, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)" + "'", str13, " -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", (int) (short) 10);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        java.lang.String str29 = student4.getMajor();
        java.lang.String str30 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str28, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str29, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.toString();
        business.Student student13 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList14 = student13.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str18 = student4.toString();
        student4.setEnrollmentYear((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str8, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)" + "'", str18, "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        student4.setName(" -  ( -  (, Class of 0), Class of 0)");
        business.Student student17 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (, Class of 0)", (int) '#');
        business.Student student22 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str23 = student22.getStudentId();
        student22.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student22.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        java.util.List<java.lang.String> strList28 = student22.getCompletedCourses();
        student17.setCompletedCourses(strList28);
        student4.setCompletedCourses(strList28);
        java.util.List<java.lang.String> strList31 = null;
        student4.setCompletedCourses(strList31);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", "hi! - hi! (hi!, Class of 100)", "", 52);
        student4.setMajor(" -  (, Class of 100)");
        java.lang.String str7 = student4.getName();
        java.lang.String str8 = student4.toString();
        student4.setName(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! (hi!, Class of 100)" + "'", str7, "hi! - hi! (hi!, Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) - hi! - hi! (hi!, Class of 100) ( -  (, Class of 100), Class of 52)" + "'", str8, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) - hi! - hi! (hi!, Class of 100) ( -  (, Class of 100), Class of 52)");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setEnrollmentYear((-1));
        student4.setStudentId("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setStudentId("hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getName();
        student4.setName("hi! -  (, Class of 100)");
        java.lang.Class<?> wildcardClass12 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        student4.setName(" -  (hi!, Class of 100)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)" + "'", str6, " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getStudentId();
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        java.lang.String str15 = student4.getName();
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList21 = student20.getCompletedCourses();
        student20.setStudentId("");
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str29 = student28.getName();
        java.util.List<java.lang.String> strList30 = student28.getCompletedCourses();
        student20.setCompletedCourses(strList30);
        student20.setStudentId(" -  (, Class of 10)");
        student20.setName("hi! -  (hi!, Class of 0)");
        java.lang.String str36 = student20.getMajor();
        java.lang.String str37 = student20.getMajor();
        java.lang.String str38 = student20.toString();
        business.Student student43 = new business.Student(" - hi! (hi!, Class of 52)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " -  (, Class of 10)", 10);
        java.lang.String str44 = student43.toString();
        java.lang.String str45 = student43.getName();
        business.Student student50 = new business.Student("hi!", "", "hi!", 0);
        student50.addCompletedCourse("");
        java.lang.String str53 = student50.getName();
        student50.addCompletedCourse(" -  (, Class of 100)");
        java.lang.String str56 = student50.getStudentId();
        java.util.List<java.lang.String> strList57 = student50.getCompletedCourses();
        student43.setCompletedCourses(strList57);
        student20.setCompletedCourses(strList57);
        student4.setCompletedCourses(strList57);
        int int61 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str38, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str44, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str45, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str7 = student4.toString();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setEnrollmentYear(35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str12 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        student15.addCompletedCourse("");
        java.lang.String str18 = student15.toString();
        java.lang.String str19 = student15.getStudentId();
        java.lang.String str20 = student15.getName();
        java.util.List<java.lang.String> strList21 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList21);
        java.lang.Class<?> wildcardClass23 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 0)" + "'", str18, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  (hi!, Class of 0)", (-1));
        java.lang.String str5 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)" + "'", str5, "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)" + "'", str8, "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        int int11 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass12 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        java.lang.String str28 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str28, " - hi! (hi!, Class of 52)");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        business.Student student4 = new business.Student(" - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)", 32);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", "hi! -  (hi! -  (hi!, Class of 0), Class of 0)", (int) (short) 1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)" + "'", str6, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getName();
        student4.setStudentId(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        student4.addCompletedCourse("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str5, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)" + "'", str10, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList25 = student24.getCompletedCourses();
        student4.setCompletedCourses(strList25);
        java.lang.String str27 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " - hi! (, Class of 0)" + "'", str27, " - hi! (, Class of 0)");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setStudentId(" -  (, Class of 10)");
        student4.setMajor(" - hi! (, Class of 100)");
        java.util.List<java.lang.String> strList20 = student4.getCompletedCourses();
        java.lang.String str21 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        java.lang.String str15 = student4.getName();
        student4.setStudentId(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)", "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)", (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        business.Student student20 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList21 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList21);
        student4.setStudentId(" - hi! (, Class of 100)");
        java.lang.String str25 = student4.getName();
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        student30.setCompletedCourses((java.util.List<java.lang.String>) strList35);
        java.lang.String str38 = student30.getName();
        student30.setStudentId(" -  (, Class of 0)");
        student30.setMajor(" -  (, Class of 10)");
        java.util.List<java.lang.String> strList43 = student30.getCompletedCourses();
        java.lang.String str44 = student30.getMajor();
        student30.setName(" - hi! (, Class of -1)");
        business.Student student51 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str52 = student51.getStudentId();
        java.lang.String str53 = student51.toString();
        java.lang.String str54 = student51.getName();
        business.Student student59 = new business.Student("", "", "", (int) (short) 0);
        student59.addCompletedCourse("");
        java.lang.String str62 = student59.toString();
        java.lang.String str63 = student59.getStudentId();
        business.Student student68 = new business.Student("hi!", "", "hi!", 0);
        student68.setName(" -  (, Class of 10)");
        student68.setMajor("");
        java.lang.String str73 = student68.getMajor();
        business.Student student78 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList79 = student78.getCompletedCourses();
        student68.setCompletedCourses(strList79);
        student59.setCompletedCourses(strList79);
        student51.setCompletedCourses(strList79);
        student30.setCompletedCourses(strList79);
        student4.setCompletedCourses(strList79);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " -  (, Class of 10)" + "'", str44, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str53, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + " -  (, Class of 10)" + "'", str54, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + " -  (, Class of 0)" + "'", str62, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(strList79);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        java.lang.String str19 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of -1) ( -  (, Class of 0), Class of 1)", "hi! - hi! ( - hi! (, Class of -1), Class of 35)", "hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)", (int) (byte) 10);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setName("");
        java.lang.String str16 = student4.toString();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (, Class of 1)" + "'", str16, "hi! -  (, Class of 1)");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getMajor();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str9, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        int int10 = student4.getEnrollmentYear();
        business.Student student15 = new business.Student("", "hi!", "", 100);
        java.lang.String str16 = student15.getMajor();
        student15.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList19 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList19);
        student4.setName("hi! -  (, Class of 0)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        business.Student student4 = new business.Student(" - hi! ( - hi! (hi!, Class of 52), Class of -1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) ' ');
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 0)", (int) (short) 10);
        student4.setName(" - hi! (, Class of 100)");
        student4.setEnrollmentYear((-1));
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        java.lang.Class<?> wildcardClass61 = strList56.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getName();
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str14 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! ( -  (, Class of 10), Class of 100)" + "'", str14, "hi! - hi! ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        business.Student student4 = new business.Student("", "hi!", "", 0);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (, Class of -1)" + "'", str8, " - hi! (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of -1)" + "'", str9, " - hi! (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (hi!, Class of 100)", "hi! - hi! (hi!, Class of 35)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor(" - hi! (, Class of 100) - hi! (hi!, Class of 35)");
        int int8 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str5, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 100)");
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setEnrollmentYear((int) 'a');
        student4.addCompletedCourse(" -  (hi!, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  (hi!, Class of 0)", (-1));
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList30 = student29.getCompletedCourses();
        student29.setName("hi!");
        java.lang.String str33 = student29.getName();
        java.lang.String str34 = student29.getStudentId();
        student29.setEnrollmentYear((int) (short) 100);
        java.util.List<java.lang.String> strList37 = student29.getCompletedCourses();
        student4.setCompletedCourses(strList37);
        student4.setMajor("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.setStudentId("hi! -  (, Class of 0)");
        java.lang.String str18 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student16.setStudentId("");
        int int20 = student16.getEnrollmentYear();
        student16.setEnrollmentYear((int) (short) 1);
        student16.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str30 = student29.getName();
        student29.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList33 = student29.getCompletedCourses();
        java.lang.String str34 = student29.getName();
        business.Student student39 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student39.setStudentId("hi! -  (hi!, Class of 0)");
        int int42 = student39.getEnrollmentYear();
        java.util.List<java.lang.String> strList43 = student39.getCompletedCourses();
        student29.setCompletedCourses(strList43);
        java.lang.String str45 = student29.toString();
        java.util.List<java.lang.String> strList46 = student29.getCompletedCourses();
        student16.setCompletedCourses(strList46);
        business.Student student52 = new business.Student("hi!", "", "hi!", 0);
        student52.setName(" -  (, Class of 10)");
        student52.setMajor("");
        java.lang.String str57 = student52.getMajor();
        business.Student student62 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList63 = student62.getCompletedCourses();
        student52.setCompletedCourses(strList63);
        student16.setCompletedCourses(strList63);
        student4.setCompletedCourses(strList63);
        business.Student student71 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", "", (int) (byte) 10);
        business.Student student76 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList77 = student76.getCompletedCourses();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        student76.setCompletedCourses((java.util.List<java.lang.String>) strList81);
        int int84 = student76.getEnrollmentYear();
        student76.setMajor(" -  (, Class of 0)");
        int int87 = student76.getEnrollmentYear();
        student76.setStudentId("hi!");
        java.lang.String str90 = student76.toString();
        java.util.List<java.lang.String> strList91 = student76.getCompletedCourses();
        student71.setCompletedCourses(strList91);
        student4.setCompletedCourses(strList91);
        student4.setMajor("hi! -  (, Class of 10)");
        java.lang.String str96 = student4.toString();
        student4.setMajor(" - hi! (, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  (, Class of 10)" + "'", str45, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str90, "hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi! -  (hi! -  (, Class of 10), Class of 10)" + "'", str96, "hi! -  (hi! -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str14 = student4.toString();
        student4.setEnrollmentYear(0);
        student4.addCompletedCourse(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.setStudentId(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str14, " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setEnrollmentYear((int) '4');
        student4.setMajor("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        business.Student student4 = new business.Student(" -  (hi!, Class of 10)", "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)", " -  - hi! (, Class of -1) (hi!, Class of 10)", 35);
        student4.setEnrollmentYear((int) (short) 10);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setStudentId(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        student4.addCompletedCourse(" -  (hi!, Class of 100)");
        student4.setStudentId(" - hi! (, Class of 100) - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        student4.setMajor("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student16.setStudentId("");
        int int20 = student16.getEnrollmentYear();
        student16.setEnrollmentYear((int) (short) 1);
        student16.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str30 = student29.getName();
        student29.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList33 = student29.getCompletedCourses();
        java.lang.String str34 = student29.getName();
        business.Student student39 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student39.setStudentId("hi! -  (hi!, Class of 0)");
        int int42 = student39.getEnrollmentYear();
        java.util.List<java.lang.String> strList43 = student39.getCompletedCourses();
        student29.setCompletedCourses(strList43);
        java.lang.String str45 = student29.toString();
        java.util.List<java.lang.String> strList46 = student29.getCompletedCourses();
        student16.setCompletedCourses(strList46);
        business.Student student52 = new business.Student("hi!", "", "hi!", 0);
        student52.setName(" -  (, Class of 10)");
        student52.setMajor("");
        java.lang.String str57 = student52.getMajor();
        business.Student student62 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList63 = student62.getCompletedCourses();
        student52.setCompletedCourses(strList63);
        student16.setCompletedCourses(strList63);
        student4.setCompletedCourses(strList63);
        business.Student student71 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", "", (int) (byte) 10);
        business.Student student76 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList77 = student76.getCompletedCourses();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        student76.setCompletedCourses((java.util.List<java.lang.String>) strList81);
        int int84 = student76.getEnrollmentYear();
        student76.setMajor(" -  (, Class of 0)");
        int int87 = student76.getEnrollmentYear();
        student76.setStudentId("hi!");
        java.lang.String str90 = student76.toString();
        java.util.List<java.lang.String> strList91 = student76.getCompletedCourses();
        student71.setCompletedCourses(strList91);
        student4.setCompletedCourses(strList91);
        student4.setMajor("hi! -  (, Class of 10)");
        student4.setEnrollmentYear(0);
        java.lang.String str98 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  (, Class of 10)" + "'", str45, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str90, "hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi! -  (, Class of 10)" + "'", str98, "hi! -  (, Class of 10)");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getMajor();
        student4.setName("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 0)" + "'", str9, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", "hi! - hi! -  (, Class of 0) (hi!, Class of 35)", "hi! - hi! (hi!, Class of 35)", (int) (byte) 100);
        java.lang.String str5 = student4.toString();
        student4.addCompletedCourse(" - hi! -  (hi!, Class of 97) (, Class of 10)");
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)" + "'", str5, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)" + "'", str8, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        java.lang.String str22 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str22, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        java.lang.String str46 = student4.getStudentId();
        java.util.List<java.lang.String> strList47 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)" + "'", str46, "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((int) (short) 100);
        student4.setEnrollmentYear((int) (short) 1);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)");
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        student20.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student20.setStudentId("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.util.List<java.lang.String> strList25 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList25);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", (int) '4');
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        student4.setEnrollmentYear((int) '#');
        student4.addCompletedCourse("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str26 = student4.toString();
        business.Student student31 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList32 = student31.getCompletedCourses();
        student31.setName("hi!");
        student31.addCompletedCourse("");
        java.util.List<java.lang.String> strList37 = student31.getCompletedCourses();
        java.lang.String str38 = student31.getStudentId();
        java.lang.String str39 = student31.toString();
        business.Student student44 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList45 = student44.getCompletedCourses();
        student31.setCompletedCourses(strList45);
        business.Student student51 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList52 = student51.getCompletedCourses();
        student31.setCompletedCourses(strList52);
        student4.setCompletedCourses(strList52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)" + "'", str26, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " - hi! (, Class of 0)" + "'", str39, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList52);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        business.Student student4 = new business.Student(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) ( -  (, Class of 0), Class of -1)", " -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)", (int) (short) 100);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getName();
        business.Student student14 = new business.Student("hi!", "", "hi!", 0);
        student14.setName(" -  (, Class of 10)");
        student14.setMajor("");
        java.lang.String[] strArray22 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        student14.setCompletedCourses((java.util.List<java.lang.String>) strList23);
        business.Student student30 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int31 = student30.getEnrollmentYear();
        student30.setMajor("hi!");
        business.Student student38 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str39 = student38.getName();
        student38.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList42 = student38.getCompletedCourses();
        java.lang.String str43 = student38.getName();
        business.Student student48 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student48.setStudentId("hi! -  (hi!, Class of 0)");
        int int51 = student48.getEnrollmentYear();
        java.util.List<java.lang.String> strList52 = student48.getCompletedCourses();
        student38.setCompletedCourses(strList52);
        student30.setCompletedCourses(strList52);
        java.util.List<java.lang.String> strList55 = student30.getCompletedCourses();
        student14.setCompletedCourses(strList55);
        student4.setCompletedCourses(strList55);
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setEnrollmentYear((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", "hi! -  (, Class of 100)", "", (int) (byte) 10);
        business.Student student9 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student9.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList12 = student9.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student9.getCompletedCourses();
        java.lang.String str14 = student9.toString();
        student9.setEnrollmentYear((int) (short) -1);
        student9.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList19 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList19);
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str14, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str21, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        business.Student student4 = new business.Student("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)", "hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)", "", (int) (short) 100);
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.toString();
        business.Student student12 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList13 = student12.getCompletedCourses();
        business.Student student18 = new business.Student("", "hi!", "", 100);
        java.lang.String str19 = student18.getMajor();
        java.lang.String str20 = student18.toString();
        java.util.List<java.lang.String> strList21 = student18.getCompletedCourses();
        java.lang.String str22 = student18.getName();
        java.lang.String str23 = student18.getStudentId();
        java.lang.String str24 = student18.getName();
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList30 = student29.getCompletedCourses();
        student29.setName("hi!");
        student29.addCompletedCourse("");
        java.lang.String str35 = student29.toString();
        java.lang.String str36 = student29.getStudentId();
        java.lang.String str37 = student29.getMajor();
        java.util.List<java.lang.String> strList38 = student29.getCompletedCourses();
        student18.setCompletedCourses(strList38);
        student12.setCompletedCourses(strList38);
        student4.setCompletedCourses(strList38);
        java.lang.String str42 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str7, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 100)" + "'", str20, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " - hi! (, Class of 0)" + "'", str35, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " -  (, Class of 10)" + "'", str42, " -  (, Class of 10)");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)", " - hi! -  (hi!, Class of 0) (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)", 52);
        student4.setStudentId(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        business.Student student77 = new business.Student("hi!", "", "hi!", 0);
        student77.setName(" -  (, Class of 10)");
        student77.setEnrollmentYear((int) '#');
        java.lang.String str82 = student77.toString();
        java.lang.String str83 = student77.getMajor();
        java.lang.String str84 = student77.getStudentId();
        java.lang.String str85 = student77.getStudentId();
        java.lang.String str86 = student77.getStudentId();
        java.util.List<java.lang.String> strList87 = student77.getCompletedCourses();
        student4.setCompletedCourses(strList87);
        java.util.List<java.lang.String> strList89 = student4.getCompletedCourses();
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str82, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getMajor();
        int int16 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str14, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str15, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        business.Student student19 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student19.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList22 = student19.getCompletedCourses();
        java.util.List<java.lang.String> strList23 = student19.getCompletedCourses();
        java.lang.String str24 = student19.toString();
        student19.setEnrollmentYear((int) (short) -1);
        student19.setEnrollmentYear((int) (byte) 0);
        student19.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str31 = student19.getMajor();
        java.lang.String str32 = student19.getName();
        java.util.List<java.lang.String> strList33 = student19.getCompletedCourses();
        student4.setCompletedCourses(strList33);
        student4.setStudentId(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        java.lang.String str37 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str24, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " -  (, Class of 10)" + "'", str31, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str32, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)" + "'", str37, " - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        business.Student student4 = new business.Student(" -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "", 100);
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str7 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (, Class of 100)" + "'", str7, " -  (, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (, Class of 100)");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setEnrollmentYear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse("hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId(" -  (, Class of 10)");
        java.lang.String str18 = student4.getMajor();
        java.lang.String str19 = student4.getMajor();
        java.util.List<java.lang.String> strList20 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        java.lang.String str32 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str11 = student4.toString();
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getMajor();
        business.Student student18 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList19 = student18.getCompletedCourses();
        student18.setStudentId("");
        int int22 = student18.getEnrollmentYear();
        student18.setEnrollmentYear((int) (short) 1);
        student18.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student18.setEnrollmentYear((int) '#');
        business.Student student33 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList34 = student33.getCompletedCourses();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        student33.setCompletedCourses((java.util.List<java.lang.String>) strList38);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList38);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList38);
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        int int45 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 100)" + "'", str11, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        java.lang.String str25 = student4.getStudentId();
        student4.setEnrollmentYear(1);
        java.lang.Class<?> wildcardClass28 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 0)" + "'", str25, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        java.lang.String str25 = student4.toString();
        java.lang.String str26 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str24, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (hi!, Class of 0) -  (, Class of 0)" + "'", str25, "hi! -  (hi!, Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str26, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getStudentId();
        student4.setEnrollmentYear(0);
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)" + "'", str11, " -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getStudentId();
        business.Student student17 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.lang.String str24 = student4.getStudentId();
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList30 = student29.getCompletedCourses();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        student29.setCompletedCourses((java.util.List<java.lang.String>) strList34);
        int int37 = student29.getEnrollmentYear();
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList43 = student42.getCompletedCourses();
        student42.setName("hi!");
        student42.addCompletedCourse("");
        java.util.List<java.lang.String> strList48 = student42.getCompletedCourses();
        java.lang.String str49 = student42.getStudentId();
        java.lang.String str50 = student42.toString();
        business.Student student55 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList56 = student55.getCompletedCourses();
        student42.setCompletedCourses(strList56);
        business.Student student62 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList63 = student62.getCompletedCourses();
        student42.setCompletedCourses(strList63);
        student29.setCompletedCourses(strList63);
        int int66 = student29.getEnrollmentYear();
        student29.addCompletedCourse("");
        student29.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student75 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList76 = student75.getCompletedCourses();
        student29.setCompletedCourses(strList76);
        student4.setCompletedCourses(strList76);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str24, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " - hi! (, Class of 0)" + "'", str50, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(strList76);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  (hi!, Class of 0)", 35);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        java.lang.String str16 = student4.getMajor();
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        student21.setName(" -  (, Class of 10)");
        student21.setMajor("");
        student21.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str28 = student21.getMajor();
        java.lang.String str29 = student21.getMajor();
        student21.setName("hi!");
        java.lang.String str32 = student21.getName();
        business.Student student37 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList38 = student37.getCompletedCourses();
        student21.setCompletedCourses(strList38);
        student4.setCompletedCourses(strList38);
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str16, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str28, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str29, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        student9.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList12 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        java.lang.String str14 = student4.getStudentId();
        student4.setName(" -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", " - hi! (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 100)", 0);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        java.lang.String str11 = student9.getStudentId();
        java.lang.String str12 = student9.getName();
        java.lang.String str13 = student9.getMajor();
        java.lang.String str14 = student9.toString();
        business.Student student19 = new business.Student("", "hi!", "", 100);
        java.lang.String str20 = student19.getName();
        java.lang.String str21 = student19.toString();
        business.Student student26 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList27 = student26.getCompletedCourses();
        java.util.List<java.lang.String> strList28 = student26.getCompletedCourses();
        java.util.List<java.lang.String> strList29 = student26.getCompletedCourses();
        student19.setCompletedCourses(strList29);
        student9.setCompletedCourses(strList29);
        student4.setCompletedCourses(strList29);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 0)" + "'", str14, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 100)" + "'", str21, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        business.Student student4 = new business.Student(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)", " -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)", "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)", (int) (byte) 0);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", "", 1);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        student9.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str16 = student9.getMajor();
        java.lang.String str17 = student9.getMajor();
        java.util.List<java.lang.String> strList18 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        java.lang.String str20 = student4.getName();
        java.lang.String str21 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 100)" + "'", str20, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        java.lang.String str18 = student4.toString();
        java.util.List<java.lang.String> strList19 = student4.getCompletedCourses();
        student4.setEnrollmentYear(52);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str18, "hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! - hi! (hi!, Class of 35)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", "hi! - hi! (hi!, Class of 100)", "", 52);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! (hi!, Class of 100)" + "'", str6, "hi! - hi! (hi!, Class of 100)");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear(1);
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        student4.setMajor("hi! -  (hi!, Class of 97)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        business.Student student4 = new business.Student("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)", "hi! -  (, Class of 0)", 10);
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        int int41 = student4.getEnrollmentYear();
        student4.addCompletedCourse("");
        student4.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setEnrollmentYear(97);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        business.Student student4 = new business.Student(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", " -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)", (int) (short) 0);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! - hi! (hi!, Class of 35)");
        java.lang.String str8 = student4.getStudentId();
        int int9 = student4.getEnrollmentYear();
        int int10 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str9, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String str14 = student9.getMajor();
        java.lang.String str15 = student9.getName();
        java.util.List<java.lang.String> strList16 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        java.lang.String str18 = student4.toString();
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str18, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        student4.setEnrollmentYear((int) (short) 100);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52)");
        student4.setMajor(" - hi! -  (hi!, Class of 0) (, Class of 100)");
        java.util.List<java.lang.String> strList22 = student4.getCompletedCourses();
        java.lang.String str23 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", "hi! -  (hi!, Class of 0)", " - hi! (, Class of 100)", 0);
        student4.setMajor("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        java.lang.String str7 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! -  (, Class of 0) (hi!, Class of 35)" + "'", str7, "hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        business.Student student4 = new business.Student(" -  (, Class of 10)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)", (int) (short) 10);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        student4.addCompletedCourse("hi!");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        student4.setName("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String[] strArray17 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = student4.getStudentId();
        int int23 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        business.Student student12 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int13 = student12.getEnrollmentYear();
        student12.setMajor("hi!");
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
        student12.setCompletedCourses(strList34);
        student4.setCompletedCourses(strList34);
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        business.Student student13 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student13.setEnrollmentYear((int) (byte) 100);
        java.lang.String str16 = student13.toString();
        java.util.List<java.lang.String> strList17 = student13.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        student4.setEnrollmentYear((int) ' ');
        java.lang.String str23 = student4.getStudentId();
        java.lang.String str24 = student4.getStudentId();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str24, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear(35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", 0);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", "hi! - hi! (hi!, Class of 100)", "", 52);
        java.lang.String str5 = student4.getMajor();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        java.lang.String str15 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str15, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setMajor("hi! -  (, Class of 0)");
        business.Student student12 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  (, Class of 10)", "", (int) (short) 10);
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        student17.setEnrollmentYear(0);
        business.Student student24 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int25 = student24.getEnrollmentYear();
        student24.setMajor("hi!");
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str33 = student32.getName();
        student32.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList36 = student32.getCompletedCourses();
        java.lang.String str37 = student32.getName();
        business.Student student42 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student42.setStudentId("hi! -  (hi!, Class of 0)");
        int int45 = student42.getEnrollmentYear();
        java.util.List<java.lang.String> strList46 = student42.getCompletedCourses();
        student32.setCompletedCourses(strList46);
        student24.setCompletedCourses(strList46);
        student17.setCompletedCourses(strList46);
        student12.setCompletedCourses(strList46);
        student4.setCompletedCourses(strList46);
        int int52 = student4.getEnrollmentYear();
        java.lang.String str53 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str53, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear(0);
        java.lang.String str10 = student4.getMajor();
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
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
        student14.setEnrollmentYear((int) (byte) 100);
        java.util.List<java.lang.String> strList35 = student14.getCompletedCourses();
        java.lang.String str36 = student14.getName();
        business.Student student41 = new business.Student("hi!", "", "hi!", 0);
        student41.addCompletedCourse("");
        java.lang.String str44 = student41.getName();
        student41.setMajor("");
        java.lang.String str47 = student41.getName();
        int int48 = student41.getEnrollmentYear();
        int int49 = student41.getEnrollmentYear();
        business.Student student54 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (, Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", 52);
        java.lang.String str55 = student54.toString();
        java.util.List<java.lang.String> strList56 = student54.getCompletedCourses();
        student41.setCompletedCourses(strList56);
        student14.setCompletedCourses(strList56);
        student4.setCompletedCourses(strList56);
        java.util.List<java.lang.String> strList60 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)" + "'", str55, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        student4.setEnrollmentYear((int) (short) 0);
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str15 = student4.toString();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)" + "'", str15, " -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", 100);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (hi!, Class of 52)");
        student4.setEnrollmentYear((int) (byte) 1);
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        student19.setCompletedCourses((java.util.List<java.lang.String>) strList24);
        int int27 = student19.getEnrollmentYear();
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList33 = student32.getCompletedCourses();
        student32.setName("hi!");
        student32.addCompletedCourse("");
        java.util.List<java.lang.String> strList38 = student32.getCompletedCourses();
        java.lang.String str39 = student32.getStudentId();
        java.lang.String str40 = student32.toString();
        business.Student student45 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList46 = student45.getCompletedCourses();
        student32.setCompletedCourses(strList46);
        business.Student student52 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList53 = student52.getCompletedCourses();
        student32.setCompletedCourses(strList53);
        student19.setCompletedCourses(strList53);
        business.Student student60 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList61 = student60.getCompletedCourses();
        student60.setName("hi!");
        student60.addCompletedCourse("");
        java.util.List<java.lang.String> strList66 = student60.getCompletedCourses();
        java.lang.String str67 = student60.getStudentId();
        java.util.List<java.lang.String> strList68 = student60.getCompletedCourses();
        student19.setCompletedCourses(strList68);
        java.util.List<java.lang.String> strList70 = student19.getCompletedCourses();
        student4.setCompletedCourses(strList70);
        java.util.List<java.lang.String> strList72 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " - hi! (, Class of 0)" + "'", str40, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList72);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " -  (, Class of 100)", "hi! -  (hi!, Class of 0)", (int) '#');
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 100) (hi! -  (hi!, Class of 0), Class of 35)" + "'", str5, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 100) (hi! -  (hi!, Class of 0), Class of 35)");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  (, Class of 100)");
        student4.addCompletedCourse(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str17 = student4.getName();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 10)" + "'", str17, " -  (, Class of 10)");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setMajor(" - hi! (, Class of -1)");
        java.lang.String str11 = student4.getMajor();
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of -1)" + "'", str11, " - hi! (, Class of -1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        business.Student student29 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str30 = student29.getMajor();
        java.lang.String str31 = student29.getStudentId();
        student29.setEnrollmentYear((int) 'a');
        java.lang.String str34 = student29.getName();
        java.util.List<java.lang.String> strList35 = student29.getCompletedCourses();
        student4.setCompletedCourses(strList35);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 0)" + "'", str30, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str31, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " -  (, Class of 10)" + "'", str34, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str21 = student4.toString();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList24 = student4.getCompletedCourses();
        int int25 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str21, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) - hi! -  -  (, Class of 10) (, Class of 1) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getName();
        business.Student student11 = new business.Student("hi!", "", "hi!", 0);
        student11.setName(" -  (, Class of 10)");
        student11.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str16 = student11.toString();
        business.Student student21 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", 0);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        student11.setCompletedCourses(strList22);
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str29 = student28.getName();
        student28.setEnrollmentYear(10);
        student28.setEnrollmentYear((int) (byte) 0);
        student28.setEnrollmentYear((int) (byte) 100);
        java.lang.String str36 = student28.getName();
        business.Student student41 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str42 = student41.getName();
        student41.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList45 = student41.getCompletedCourses();
        java.lang.String str46 = student41.getName();
        business.Student student51 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student51.setStudentId("hi! -  (hi!, Class of 0)");
        int int54 = student51.getEnrollmentYear();
        java.util.List<java.lang.String> strList55 = student51.getCompletedCourses();
        student41.setCompletedCourses(strList55);
        java.lang.String str57 = student41.toString();
        java.util.List<java.lang.String> strList58 = student41.getCompletedCourses();
        business.Student student63 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str64 = student63.getName();
        java.lang.String str65 = student63.getName();
        java.lang.String str66 = student63.getStudentId();
        java.lang.String str67 = student63.toString();
        business.Student student72 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList73 = student72.getCompletedCourses();
        student63.setCompletedCourses(strList73);
        student41.setCompletedCourses(strList73);
        student28.setCompletedCourses(strList73);
        student11.setCompletedCourses(strList73);
        student4.setCompletedCourses(strList73);
        student4.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str81 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 10)" + "'", str6, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str16, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + " -  (, Class of 10)" + "'", str57, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str67, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 97)");
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
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str19 = student4.toString();
        student4.setEnrollmentYear(100);
        java.lang.String str22 = student4.getName();
        java.util.List<java.lang.String> strList23 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass24 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str19, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.addCompletedCourse(" -  (, Class of 100)");
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.lang.Class<?> wildcardClass16 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (hi!, Class of 100)", " - hi! (, Class of 0)", 52);
        java.lang.String str5 = student4.getName();
        student4.setStudentId("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str8 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi!, Class of 100)" + "'", str5, " -  (hi!, Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (, Class of 0)" + "'", str8, " - hi! (, Class of 0)");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        business.Student student10 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student10.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList13 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setEnrollmentYear(0);
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str22 = student21.getName();
        student21.setEnrollmentYear(10);
        student21.setStudentId("hi!");
        student21.addCompletedCourse(" -  (, Class of 100)");
        business.Student student33 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str34 = student33.getName();
        student33.setEnrollmentYear(10);
        student33.setEnrollmentYear((int) (byte) 0);
        student33.setEnrollmentYear((int) (byte) 100);
        java.lang.String str41 = student33.getName();
        business.Student student46 = new business.Student("hi!", "", "hi!", 0);
        student46.setName(" -  (, Class of 10)");
        student46.setMajor("");
        java.lang.String str51 = student46.getMajor();
        java.lang.String str52 = student46.getName();
        java.util.List<java.lang.String> strList53 = student46.getCompletedCourses();
        student33.setCompletedCourses(strList53);
        student21.setCompletedCourses(strList53);
        java.util.List<java.lang.String> strList56 = student21.getCompletedCourses();
        student4.setCompletedCourses(strList56);
        business.Student student62 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str63 = student62.getName();
        student62.setEnrollmentYear(10);
        student62.addCompletedCourse("hi! -  (hi!, Class of 0)");
        business.Student student72 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList73 = student72.getCompletedCourses();
        student72.setStudentId("");
        business.Student student80 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str81 = student80.getName();
        java.util.List<java.lang.String> strList82 = student80.getCompletedCourses();
        student72.setCompletedCourses(strList82);
        student62.setCompletedCourses(strList82);
        student4.setCompletedCourses(strList82);
        java.lang.Class<?> wildcardClass86 = strList82.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " -  (, Class of 10)" + "'", str52, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)", " - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)", 1);
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        student4.setName(" -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) (hi!, Class of 35)", "hi! -  (hi!, Class of 35)", " -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", (int) (byte) 100);
        student4.setEnrollmentYear((int) (short) 0);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setMajor("hi! -  (, Class of 0)");
        student4.addCompletedCourse(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str10, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" - hi! (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        business.Student student4 = new business.Student("hi!", "hi!", "hi! -  -  (, Class of 10) (, Class of 0)", 0);
        student4.setEnrollmentYear((int) ' ');
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setEnrollmentYear((-1));
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        student4.setName(" -  (, Class of 10)");
        java.lang.String str7 = student4.getName();
        int int8 = student4.getEnrollmentYear();
        student4.setStudentId("hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        business.Student student13 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str14 = student13.getStudentId();
        student13.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student13.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        business.Student student23 = new business.Student("hi!", "", "hi!", 0);
        student23.setName(" -  (, Class of 10)");
        student23.setMajor("");
        student23.setMajor("hi! -  (hi!, Class of 0)");
        student23.setName("");
        student23.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str34 = student23.toString();
        java.util.List<java.lang.String> strList35 = student23.getCompletedCourses();
        student13.setCompletedCourses(strList35);
        student4.setCompletedCourses(strList35);
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList43 = student42.getCompletedCourses();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        student42.setCompletedCourses((java.util.List<java.lang.String>) strList47);
        java.lang.String str50 = student42.getName();
        student42.setStudentId(" -  (, Class of 0)");
        student42.setMajor(" -  (, Class of 10)");
        student42.setEnrollmentYear((int) (byte) 100);
        student42.setEnrollmentYear(35);
        java.lang.String str59 = student42.getName();
        java.util.List<java.lang.String> strList60 = student42.getCompletedCourses();
        student4.setCompletedCourses(strList60);
        student4.addCompletedCourse(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str34, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52), Class of 52)", " - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)", " -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)", (int) (short) 1);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        student15.setCompletedCourses((java.util.List<java.lang.String>) strList20);
        int int23 = student15.getEnrollmentYear();
        student15.setMajor(" -  (, Class of 0)");
        int int26 = student15.getEnrollmentYear();
        student15.setStudentId("hi!");
        java.lang.String str29 = student15.getMajor();
        java.util.List<java.lang.String> strList30 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList30);
        int int32 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 0)" + "'", str29, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        student4.setName(" - hi! -  (hi!, Class of 97) (, Class of 10)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)", " -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! - hi! ( - hi! (, Class of -1), Class of 35)", (int) (short) 10);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of 0) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str10, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.toString();
        student4.addCompletedCourse(" -  (, Class of 10)");
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str21 = student4.getMajor();
        student4.setName(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str24 = student4.getStudentId();
        student4.addCompletedCourse("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  - hi! (, Class of 0) (, Class of 100)" + "'", str21, " -  - hi! (, Class of 0) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId(" -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 0)" + "'", str6, " - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str7, " - hi! (hi!, Class of 52)");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getMajor();
        student4.setMajor(" - hi! (, Class of 35)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setEnrollmentYear(97);
        business.Student student14 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str15 = student14.getMajor();
        java.lang.String str16 = student14.getStudentId();
        student14.setStudentId(" -  (, Class of 10)");
        student14.setName(" - hi! (, Class of 0)");
        business.Student student25 = new business.Student("hi!", "", "hi!", 0);
        student25.setName(" -  (, Class of 10)");
        student25.setEnrollmentYear((int) '#');
        java.lang.String str30 = student25.getMajor();
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        student35.addCompletedCourse("");
        java.lang.String str38 = student35.toString();
        java.lang.String str39 = student35.getStudentId();
        business.Student student44 = new business.Student("hi!", "", "hi!", 0);
        student44.setName(" -  (, Class of 10)");
        student44.setMajor("");
        java.lang.String str49 = student44.getMajor();
        business.Student student54 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList55 = student54.getCompletedCourses();
        student44.setCompletedCourses(strList55);
        student35.setCompletedCourses(strList55);
        student25.setCompletedCourses(strList55);
        student14.setCompletedCourses(strList55);
        student4.setCompletedCourses(strList55);
        business.Student student65 = new business.Student("hi!", "", "hi!", 0);
        student65.addCompletedCourse("");
        java.lang.String str68 = student65.getName();
        student65.addCompletedCourse(" -  (, Class of 100)");
        business.Student student75 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str76 = student75.getName();
        student75.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList79 = student75.getCompletedCourses();
        java.lang.String str80 = student75.getName();
        business.Student student85 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student85.setStudentId("hi! -  (hi!, Class of 0)");
        int int88 = student85.getEnrollmentYear();
        java.util.List<java.lang.String> strList89 = student85.getCompletedCourses();
        student75.setCompletedCourses(strList89);
        java.lang.String str91 = student75.toString();
        java.util.List<java.lang.String> strList92 = student75.getCompletedCourses();
        student65.setCompletedCourses(strList92);
        student4.setCompletedCourses(strList92);
        student4.addCompletedCourse("hi! -  (hi!, Class of 1)");
        int int97 = student4.getEnrollmentYear();
        int int98 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " -  (, Class of 0)" + "'", str38, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + " -  (, Class of 10)" + "'", str91, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 97 + "'", int97 == 97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 97 + "'", int98 == 97);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int14 = student4.getEnrollmentYear();
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getName();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = null;
        student4.setCompletedCourses(strList7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        java.lang.String str21 = student4.getStudentId();
        java.lang.String str22 = student4.getStudentId();
        student4.setEnrollmentYear((int) '#');
        java.lang.String str25 = student4.getMajor();
        java.lang.String str26 = student4.getMajor();
        java.lang.String str27 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " -  (, Class of 10)" + "'", str27, " -  (, Class of 10)");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        java.lang.String str9 = student4.getName();
        student4.setName(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
        java.lang.String str12 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)" + "'", str12, " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str14 = student4.getMajor();
        business.Student student19 = new business.Student("hi!", "", "hi!", 0);
        student19.setName(" -  (, Class of 10)");
        student19.setMajor("");
        student19.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str26 = student19.getMajor();
        java.lang.String str27 = student19.getMajor();
        student19.setName("hi!");
        java.lang.String str30 = student19.getName();
        int int31 = student19.getEnrollmentYear();
        student19.setName("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList34 = student19.getCompletedCourses();
        student4.setCompletedCourses(strList34);
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str26, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str27, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)", "hi! -  -  ( -  (, Class of 0), Class of 0) (hi!, Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)", (int) (short) 100);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        business.Student student4 = new business.Student("", "hi! -  (hi!, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", (int) (byte) 0);
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        java.lang.String str41 = student4.getName();
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str15, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " - hi! (, Class of 0)" + "'", str28, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 0)" + "'", str33, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.addCompletedCourse(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        java.lang.String str18 = student4.getMajor();
        java.util.List<java.lang.String> strList19 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass20 = student4.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", (int) '4');
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        student4.setEnrollmentYear(1);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        java.lang.String str23 = student4.getStudentId();
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("hi! -  (hi!, Class of 97)");
        java.lang.String str28 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList25 = student24.getCompletedCourses();
        student4.setCompletedCourses(strList25);
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setEnrollmentYear(1);
        int int31 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.toString();
        student4.addCompletedCourse(" -  (, Class of 10)");
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str21 = student4.getMajor();
        student4.setName(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str24 = student4.getStudentId();
        student4.addCompletedCourse("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  - hi! (, Class of 0) (, Class of 100)" + "'", str21, " -  - hi! (, Class of 0) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        student4.addCompletedCourse(" -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str22, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getStudentId();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str15 = student14.getName();
        student14.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList18 = student14.getCompletedCourses();
        java.lang.String str19 = student14.getStudentId();
        student14.setName(" - hi! (, Class of 100)");
        business.Student student26 = new business.Student("", "hi!", "", 100);
        student26.setEnrollmentYear((int) (short) -1);
        java.util.List<java.lang.String> strList29 = student26.getCompletedCourses();
        student14.setCompletedCourses(strList29);
        student4.setCompletedCourses(strList29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str7 = student4.getMajor();
        student4.setName(" -  (, Class of 0)");
        student4.setMajor("hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.addCompletedCourse("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        java.lang.String str28 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.addCompletedCourse(" -  (, Class of 0)");
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        business.Student student4 = new business.Student("hi! -  ( -  (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (, Class of 100)", 97);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        student4.addCompletedCourse("hi! - hi! (hi!, Class of 35)");
        java.util.List<java.lang.String> strList9 = null;
        student4.setCompletedCourses(strList9);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getName();
        student4.setStudentId(" - hi! (hi!, Class of 52)");
        java.lang.String str13 = student4.getName();
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        java.lang.String str30 = student18.getMajor();
        student18.setName(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList33 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList33);
        java.lang.Class<?> wildcardClass35 = strList33.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", "hi! -  (hi!, Class of 35)", " -  - hi! (, Class of -1) (hi!, Class of 10)", (int) (short) 10);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)", (int) (short) 1);
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str15 = student4.getName();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setStudentId(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        student4.addCompletedCourse(" -  - hi! (, Class of -1) (, Class of 0)");
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi!, Class of 0)" + "'", str8, " -  (hi!, Class of 0)");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", "hi! -  (hi!, Class of 0)", " -  (, Class of 10)", (int) (byte) 1);
        student4.setStudentId("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        java.lang.String str7 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 100) (hi!, Class of 35)" + "'", str7, "hi! -  -  (, Class of 100) (hi!, Class of 35)");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        student4.setStudentId(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        int int17 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        java.lang.String str12 = student4.toString();
        student4.setStudentId("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0)");
        java.lang.String str17 = student4.toString();
        java.lang.String str18 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 100)" + "'", str12, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0) (, Class of 100)" + "'", str17, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str13 = student4.toString();
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str13, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  (, Class of -1)", "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", (int) (short) 10);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)", "hi! -  (hi! -  (hi!, Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)", 1);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str10 = student9.getName();
        student9.setEnrollmentYear((int) 'a');
        java.lang.String str13 = student9.getMajor();
        java.lang.String str14 = student9.getName();
        java.lang.String str15 = student9.getStudentId();
        java.util.List<java.lang.String> strList16 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        student4.setEnrollmentYear((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.getMajor();
        business.Student student11 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", (-1));
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        int int16 = student4.getEnrollmentYear();
        student4.setStudentId(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        java.lang.String str35 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        student4.setEnrollmentYear((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        student17.setCompletedCourses((java.util.List<java.lang.String>) strList22);
        int int25 = student17.getEnrollmentYear();
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        student30.setName("hi!");
        student30.addCompletedCourse("");
        java.util.List<java.lang.String> strList36 = student30.getCompletedCourses();
        java.lang.String str37 = student30.getStudentId();
        java.lang.String str38 = student30.toString();
        business.Student student43 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList44 = student43.getCompletedCourses();
        student30.setCompletedCourses(strList44);
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        student30.setCompletedCourses(strList51);
        student17.setCompletedCourses(strList51);
        student4.setCompletedCourses(strList51);
        student4.setMajor(" -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " - hi! (, Class of 0)" + "'", str38, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        business.Student student20 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList21 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList21);
        java.lang.String str23 = student4.getStudentId();
        java.lang.String str24 = student4.getStudentId();
        student4.setEnrollmentYear((int) '4');
        student4.setEnrollmentYear((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)");
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.setName(" -  (, Class of 10)");
        student4.addCompletedCourse("hi! -  (, Class of 0) -  (, Class of 100)");
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        business.Student student4 = new business.Student("", " -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", (int) (byte) 0);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        java.lang.String str23 = student4.getStudentId();
        student4.setEnrollmentYear((int) ' ');
        java.lang.String str26 = student4.getStudentId();
        java.lang.String str27 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " - hi! (, Class of 32)" + "'", str27, " - hi! (, Class of 32)");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.addCompletedCourse("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        java.lang.String str18 = student4.getMajor();
        java.lang.String str19 = student4.getStudentId();
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        student4.setName("hi! -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getStudentId();
        business.Student student18 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList19 = student18.getCompletedCourses();
        student18.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str22 = student18.getName();
        student18.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        student18.setEnrollmentYear((int) 'a');
        java.util.List<java.lang.String> strList27 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str22, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        java.lang.String str16 = student4.getName();
        business.Student student21 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        java.util.List<java.lang.String> strList23 = student21.getCompletedCourses();
        student4.setCompletedCourses(strList23);
        java.lang.String str25 = student4.getName();
        java.lang.String str26 = student4.getMajor();
        java.lang.String str27 = student4.getName();
        int int28 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 10)" + "'", str25, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str26, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " -  (, Class of 10)" + "'", str27, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
        java.lang.String str16 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)" + "'", str16, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str7 = student4.toString();
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 0);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) - hi! - hi! (hi!, Class of 100) ( -  (, Class of 100), Class of 52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)" + "'", str7, " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        student4.addCompletedCourse(" - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
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
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId(" -  (, Class of 10)");
        student4.setEnrollmentYear(0);
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str22 = student4.getName();
        java.lang.String str23 = student4.getName();
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " - hi! (, Class of 0)" + "'", str22, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " - hi! (, Class of 0)" + "'", str23, " - hi! (, Class of 0)");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)", (int) ' ');
        student4.setName("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32)", " - hi! (, Class of 100)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", (int) (byte) 1);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        java.lang.String str36 = student4.toString();
        java.lang.String str37 = student4.getName();
        java.lang.String str38 = student4.getMajor();
        student4.addCompletedCourse(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 10)" + "'", str30, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi! -  (hi!, Class of 1)" + "'", str36, "hi! -  (hi!, Class of 1)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        student4.setName("hi! -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        java.util.List<java.lang.String> strList26 = student4.getCompletedCourses();
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        int int29 = student4.getEnrollmentYear();
        student4.setMajor(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", "hi! -  (hi! -  (hi!, Class of 0), Class of 0)", (int) (short) 1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str6, "hi! -  (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(100);
        java.lang.String str10 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        student4.setEnrollmentYear((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setMajor(" - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        java.lang.String str7 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)" + "'", str7, " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.setMajor("hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)");
        int int27 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        business.Student student15 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        java.lang.String str18 = student4.toString();
        student4.setStudentId(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        student4.setEnrollmentYear(97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str18, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        business.Student student10 = new business.Student("", "", "", (int) (short) 0);
        student10.setEnrollmentYear(0);
        business.Student student17 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int18 = student17.getEnrollmentYear();
        student17.setMajor("hi!");
        business.Student student25 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str26 = student25.getName();
        student25.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList29 = student25.getCompletedCourses();
        java.lang.String str30 = student25.getName();
        business.Student student35 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student35.setStudentId("hi! -  (hi!, Class of 0)");
        int int38 = student35.getEnrollmentYear();
        java.util.List<java.lang.String> strList39 = student35.getCompletedCourses();
        student25.setCompletedCourses(strList39);
        student17.setCompletedCourses(strList39);
        student10.setCompletedCourses(strList39);
        student4.setCompletedCourses(strList39);
        int int44 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList45 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setEnrollmentYear(97);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        student4.setName("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)" + "'", str6, " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)", "hi! -  (, Class of 10)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", (int) (byte) 1);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        business.Student student50 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", "", 1);
        business.Student student55 = new business.Student("hi!", "", "hi!", 0);
        student55.setName(" -  (, Class of 10)");
        student55.setMajor("");
        student55.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str62 = student55.getMajor();
        java.lang.String str63 = student55.getMajor();
        java.util.List<java.lang.String> strList64 = student55.getCompletedCourses();
        student50.setCompletedCourses(strList64);
        java.lang.String str66 = student50.getMajor();
        business.Student student71 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList72 = student71.getCompletedCourses();
        java.lang.String str73 = student71.getStudentId();
        java.lang.String str74 = student71.getName();
        java.lang.String str75 = student71.getMajor();
        java.util.List<java.lang.String> strList76 = student71.getCompletedCourses();
        student50.setCompletedCourses(strList76);
        student4.setCompletedCourses(strList76);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str45, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str62, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str63, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strList76);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)" + "'", str15, " - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
        int int19 = student4.getEnrollmentYear();
        java.lang.String str20 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 0)" + "'", str20, " -  (, Class of 0)");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getStudentId();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str16 = student15.getName();
        java.util.List<java.lang.String> strList17 = student15.getCompletedCourses();
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList23 = student22.getCompletedCourses();
        student15.setCompletedCourses(strList23);
        student15.setStudentId("");
        business.Student student31 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList32 = student31.getCompletedCourses();
        student15.setCompletedCourses(strList32);
        student4.setCompletedCourses(strList32);
        int int35 = student4.getEnrollmentYear();
        java.lang.String str36 = student4.getStudentId();
        student4.setEnrollmentYear((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        int int41 = student4.getEnrollmentYear();
        student4.addCompletedCourse("");
        business.Student student48 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str49 = student48.getName();
        java.util.List<java.lang.String> strList50 = student48.getCompletedCourses();
        business.Student student55 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList56 = student55.getCompletedCourses();
        student48.setCompletedCourses(strList56);
        student48.setName(" - hi! (, Class of 0)");
        student48.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str62 = student48.getStudentId();
        java.util.List<java.lang.String> strList63 = student48.getCompletedCourses();
        student4.setCompletedCourses(strList63);
        student4.setEnrollmentYear((int) (byte) -1);
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)");
        java.util.List<java.lang.String> strList69 = student4.getCompletedCourses();
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str62, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList69);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 100) (, Class of -1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)", (int) '#');
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        student4.addCompletedCourse(" - hi! (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        java.lang.String str18 = student4.getMajor();
        business.Student student23 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", 0);
        student23.setName("hi! -  (, Class of 10)");
        business.Student student30 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        student35.setName("hi!");
        business.Student student43 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str44 = student43.getName();
        java.util.List<java.lang.String> strList45 = student43.getCompletedCourses();
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        student43.setCompletedCourses(strList51);
        student35.setCompletedCourses(strList51);
        java.lang.String str54 = student35.getStudentId();
        student35.setEnrollmentYear((int) ' ');
        student35.setStudentId("hi! -  (hi!, Class of 97)");
        business.Student student63 = new business.Student("hi!", "", "hi!", 0);
        student63.addCompletedCourse("");
        business.Student student70 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str71 = student70.getName();
        java.util.List<java.lang.String> strList72 = student70.getCompletedCourses();
        student63.setCompletedCourses(strList72);
        student35.setCompletedCourses(strList72);
        student30.setCompletedCourses(strList72);
        student23.setCompletedCourses(strList72);
        student4.setCompletedCourses(strList72);
        student4.addCompletedCourse(" -  - hi! (, Class of -1) (hi!, Class of 10)");
        java.lang.String str80 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 10)" + "'", str18, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 0)", (int) '4');
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)");
        student4.addCompletedCourse("hi! -  (, Class of 10)");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getName();
        int int7 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getName();
        int int6 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) '4');
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String str14 = student9.getMajor();
        java.lang.String str15 = student9.getName();
        java.util.List<java.lang.String> strList16 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        student4.setMajor("hi! -  (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        student4.setMajor("hi! - hi! (hi!, Class of 100)");
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getMajor();
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student16.setName("hi!");
        student16.addCompletedCourse("");
        java.util.List<java.lang.String> strList22 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList22);
        business.Student student28 = new business.Student("hi!", "", "hi!", 0);
        student28.setName(" -  (, Class of 10)");
        student28.setMajor("");
        student28.setName(" - hi! (, Class of 100)");
        int int35 = student28.getEnrollmentYear();
        student28.setName("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student42 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str43 = student42.getMajor();
        java.util.List<java.lang.String> strList44 = student42.getCompletedCourses();
        java.lang.String str45 = student42.getMajor();
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str51 = student50.getName();
        java.util.List<java.lang.String> strList52 = student50.getCompletedCourses();
        business.Student student57 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList58 = student57.getCompletedCourses();
        student50.setCompletedCourses(strList58);
        student50.setName(" - hi! (, Class of 0)");
        java.lang.String str62 = student50.getName();
        java.lang.String str63 = student50.toString();
        int int64 = student50.getEnrollmentYear();
        java.util.List<java.lang.String> strList65 = student50.getCompletedCourses();
        student42.setCompletedCourses(strList65);
        student28.setCompletedCourses(strList65);
        student4.setCompletedCourses(strList65);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + " - hi! (, Class of 0)" + "'", str62, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str63, " -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(strList65);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        student4.setEnrollmentYear((int) '#');
        student4.setEnrollmentYear((int) (short) -1);
        student4.setStudentId(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (, Class of 100)", "", " - hi! (hi!, Class of 52)", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str19, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        int int41 = student4.getEnrollmentYear();
        student4.addCompletedCourse("");
        business.Student student48 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str49 = student48.getName();
        java.util.List<java.lang.String> strList50 = student48.getCompletedCourses();
        business.Student student55 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList56 = student55.getCompletedCourses();
        student48.setCompletedCourses(strList56);
        student48.setName(" - hi! (, Class of 0)");
        student48.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str62 = student48.getStudentId();
        java.util.List<java.lang.String> strList63 = student48.getCompletedCourses();
        student4.setCompletedCourses(strList63);
        student4.setEnrollmentYear((int) (byte) -1);
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)");
        java.util.List<java.lang.String> strList69 = student4.getCompletedCourses();
        student4.setStudentId(" - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)");
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str62, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList69);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", "", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", (int) (short) 1);
        student4.setStudentId(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.setName("hi! -  (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        student4.setMajor("hi! - hi! (, Class of 100)");
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
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setMajor(" - hi! (, Class of -1)");
        java.lang.String str11 = student4.getMajor();
        student4.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str14 = student4.getMajor();
        student4.setName(" -  ( -  (, Class of 0), Class of 0) -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of -1)" + "'", str11, " - hi! (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str14, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getStudentId();
        business.Student student13 = new business.Student("hi!", "", "hi!", 0);
        student13.setName(" -  (, Class of 10)");
        student13.setMajor("");
        java.lang.String str18 = student13.getMajor();
        business.Student student23 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        student13.setCompletedCourses(strList24);
        student4.setCompletedCourses(strList24);
        java.lang.String str27 = student4.getStudentId();
        student4.setName("hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)");
        java.util.List<java.lang.String> strList30 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        business.Student student4 = new business.Student(" -  (, Class of 0)", "hi! -  (hi!, Class of 0)", " - hi! (, Class of 100)", (int) (byte) 100);
        student4.addCompletedCourse(" - hi! ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of -1)");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        student4.setEnrollmentYear((int) ' ');
        java.lang.String str23 = student4.getMajor();
        java.lang.String str24 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  (hi!, Class of 0) -  (, Class of 32)" + "'", str24, "hi! -  (hi!, Class of 0) -  (, Class of 32)");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((int) (short) 100);
        student4.setEnrollmentYear((int) (short) 1);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)");
        java.lang.String str16 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 1)" + "'", str16, " - hi! (, Class of 1)");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        java.lang.String str25 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str24, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str25, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        java.lang.String str28 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str7 = student4.getMajor();
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        student12.setEnrollmentYear(10);
        student12.setStudentId("hi!");
        business.Student student22 = new business.Student("", "hi!", "", 100);
        java.lang.String str23 = student22.getMajor();
        java.lang.String str24 = student22.toString();
        java.util.List<java.lang.String> strList25 = student22.getCompletedCourses();
        student12.setCompletedCourses(strList25);
        java.util.List<java.lang.String> strList27 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList27);
        student4.setName(" -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)");
        java.util.List<java.lang.String> strList31 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " - hi! (, Class of 100)" + "'", str24, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        business.Student student15 = new business.Student("", "hi!", "", 100);
        java.lang.String str16 = student15.getMajor();
        int int17 = student15.getEnrollmentYear();
        student15.addCompletedCourse(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList20 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList20);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        student4.setEnrollmentYear((int) 'a');
        int int21 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) (byte) 0);
        int int5 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) ' ');
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.toString();
        java.lang.Class<?> wildcardClass12 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)" + "'", str10, "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)" + "'", str11, "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        student4.setEnrollmentYear((int) '#');
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList29 = student28.getCompletedCourses();
        student4.setCompletedCourses(strList29);
        student4.setName(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.getMajor();
        business.Student student11 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", (-1));
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        int int10 = student4.getEnrollmentYear();
        business.Student student15 = new business.Student("", "hi!", "", 100);
        java.lang.String str16 = student15.getMajor();
        student15.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList19 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList19);
        student4.setName("hi! -  (, Class of 0)");
        student4.setStudentId("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 35)", "hi! -  -  ( -  (, Class of 0), Class of 0) (hi!, Class of 0)", 0);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        java.lang.String str21 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        student4.setName(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) 'a');
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { " - hi! (, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", " -  (, Class of 10)" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        student4.setName(" -  (, Class of 10)");
        java.lang.String str7 = student4.getName();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        student4.setName(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        java.lang.String str28 = student4.getStudentId();
        int int29 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        business.Student student4 = new business.Student("", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 100)", (int) (byte) -1);
        java.lang.String str5 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)" + "'", str10, " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( -  (, Class of 100), Class of -1)" + "'", str11, " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( -  (, Class of 100), Class of -1)");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 100);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        business.Student student4 = new business.Student("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)", " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100) -  (, Class of 0)", (int) (byte) 100);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str11 = student4.getMajor();
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)");
        student4.setName(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        int int41 = student4.getEnrollmentYear();
        student4.addCompletedCourse("");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        student50.setName("hi!");
        student50.addCompletedCourse("");
        java.lang.String str56 = student50.toString();
        java.lang.String str57 = student50.getStudentId();
        java.lang.String str58 = student50.getMajor();
        business.Student student63 = new business.Student("hi!", "", "hi!", 0);
        student63.setName(" -  (, Class of 10)");
        student63.setMajor("");
        student63.setMajor("hi! -  (hi!, Class of 0)");
        student63.setName("");
        student63.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str74 = student63.toString();
        java.util.List<java.lang.String> strList75 = student63.getCompletedCourses();
        student50.setCompletedCourses(strList75);
        student4.setCompletedCourses(strList75);
        student4.setEnrollmentYear((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + " - hi! (, Class of 0)" + "'", str56, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str74, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList75);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId(" - hi! (, Class of -1)");
        java.lang.String str11 = student4.getName();
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of -1) (, Class of 0)", (int) '4');
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        business.Student student4 = new business.Student(" -  ( -  (, Class of 10), Class of 0)", "hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)", " -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", 52);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getStudentId();
        student4.setEnrollmentYear(0);
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str10, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str19 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        business.Student student4 = new business.Student("hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)", " -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", 32);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        java.lang.String str16 = student4.toString();
        int int17 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (hi! -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str16, "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str18 = student17.getName();
        student17.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList21 = student17.getCompletedCourses();
        java.lang.String str22 = student17.getName();
        business.Student student27 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student27.setStudentId("hi! -  (hi!, Class of 0)");
        int int30 = student27.getEnrollmentYear();
        java.util.List<java.lang.String> strList31 = student27.getCompletedCourses();
        student17.setCompletedCourses(strList31);
        java.lang.String str33 = student17.toString();
        java.util.List<java.lang.String> strList34 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList34);
        java.lang.String str36 = student4.getStudentId();
        java.lang.String str37 = student4.toString();
        java.util.List<java.lang.String> strList38 = student4.getCompletedCourses();
        int int39 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 10)" + "'", str33, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)" + "'", str37, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        int int14 = student4.getEnrollmentYear();
        java.lang.String str15 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getName();
        student4.setStudentId(" - hi! (hi!, Class of 52)");
        java.lang.String str13 = student4.getName();
        java.lang.String str14 = student4.getMajor();
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        java.lang.String str16 = student4.toString();
        student4.setName(" -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)" + "'", str16, " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", " - hi! (, Class of 32)", "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)", (int) (short) 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        student4.setMajor(" - hi! (, Class of 100)");
        student4.addCompletedCourse("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str12 = student4.getStudentId();
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        student4.setStudentId(" -  - hi! (, Class of -1) (hi!, Class of 10)");
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str21 = student20.getName();
        student20.setEnrollmentYear(10);
        student20.setStudentId("hi!");
        student20.addCompletedCourse(" -  (, Class of 100)");
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str33 = student32.getName();
        student32.setEnrollmentYear(10);
        student32.setEnrollmentYear((int) (byte) 0);
        student32.setEnrollmentYear((int) (byte) 100);
        java.lang.String str40 = student32.getName();
        business.Student student45 = new business.Student("hi!", "", "hi!", 0);
        student45.setName(" -  (, Class of 10)");
        student45.setMajor("");
        java.lang.String str50 = student45.getMajor();
        java.lang.String str51 = student45.getName();
        java.util.List<java.lang.String> strList52 = student45.getCompletedCourses();
        student32.setCompletedCourses(strList52);
        student20.setCompletedCourses(strList52);
        java.util.List<java.lang.String> strList55 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList55);
        java.util.List<java.lang.String> strList57 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " -  (, Class of 10)" + "'", str51, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList57);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        business.Student student4 = new business.Student("", "hi! - hi! (hi!, Class of 35)", "hi! -  (, Class of 0)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (, Class of 0)" + "'", str5, "hi! -  (, Class of 0)");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 10)" + "'", str6, " -  (, Class of 10)");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        student4.setMajor(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.setName("hi! -  (hi!, Class of 0) - hi! (hi! -  (hi!, Class of 0), Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId(" - hi! (, Class of -1)");
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        student11.setEnrollmentYear(10);
        student11.setStudentId("hi!");
        business.Student student21 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student26 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList27 = student26.getCompletedCourses();
        student21.setCompletedCourses(strList27);
        student11.setCompletedCourses(strList27);
        student4.setCompletedCourses(strList27);
        int int31 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str17 = student16.getName();
        java.util.List<java.lang.String> strList18 = student16.getCompletedCourses();
        java.lang.String str19 = student16.getStudentId();
        business.Student student24 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str25 = student24.getStudentId();
        java.util.List<java.lang.String> strList26 = student24.getCompletedCourses();
        student16.setCompletedCourses(strList26);
        student4.setCompletedCourses(strList26);
        java.lang.String str29 = student4.getMajor();
        student4.setMajor(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.toString();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.String str13 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str11, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        business.Student student20 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        java.lang.String str21 = student20.getName();
        student20.setName("");
        java.util.List<java.lang.String> strList24 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        business.Student student30 = new business.Student("hi!", "", "hi!", 0);
        student30.setName(" -  (, Class of 10)");
        student30.setEnrollmentYear((int) '#');
        java.lang.String str35 = student30.toString();
        student30.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList38 = student30.getCompletedCourses();
        student4.setCompletedCourses(strList38);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 0)" + "'", str21, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str35, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        student4.setStudentId("hi! -  (, Class of 10)");
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (, Class of 10)" + "'", str11, "hi! -  (, Class of 10)");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        int int16 = student4.getEnrollmentYear();
        int int17 = student4.getEnrollmentYear();
        java.lang.String str18 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str21 = student20.getName();
        student20.setEnrollmentYear(10);
        student20.setEnrollmentYear((int) (byte) 0);
        student20.setMajor(" - hi! (, Class of 0)");
        java.lang.String str28 = student20.getName();
        student20.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str31 = student20.getStudentId();
        student20.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.util.List<java.lang.String> strList34 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList34);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  (, Class of 0)");
        int int12 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! (hi!, Class of 35)");
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str20 = student19.getName();
        student19.setEnrollmentYear(10);
        student19.addCompletedCourse("hi! -  (hi!, Class of 0)");
        int int25 = student19.getEnrollmentYear();
        java.util.List<java.lang.String> strList26 = student19.getCompletedCourses();
        student4.setCompletedCourses(strList26);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        student4.addCompletedCourse("");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        int int20 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str15 = student4.getMajor();
        student4.setMajor("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        int int8 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        student4.setName("");
        student4.setStudentId("hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        int int9 = student4.getEnrollmentYear();
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str15 = student14.getName();
        java.util.List<java.lang.String> strList16 = student14.getCompletedCourses();
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        student14.setCompletedCourses(strList22);
        student4.setCompletedCourses(strList22);
        student4.setEnrollmentYear(10);
        java.lang.String str27 = student4.getMajor();
        java.util.List<java.lang.String> strList28 = student4.getCompletedCourses();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        int int10 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (, Class of 100)");
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)");
        java.lang.Class<?> wildcardClass15 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.toString();
        student4.setStudentId(" -  (hi!, Class of 100)");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        student12.setCompletedCourses(strList20);
        student12.setName(" - hi! (, Class of 0)");
        java.lang.String str24 = student12.getName();
        java.lang.String str25 = student12.toString();
        int int26 = student12.getEnrollmentYear();
        java.util.List<java.lang.String> strList27 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList27);
        student4.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) - hi! (hi!, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " - hi! (, Class of 0)" + "'", str24, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str25, " -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str8 = student4.getName();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        student4.setEnrollmentYear((int) 'a');
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        student4.setName(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str8, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId(" -  (, Class of 10)");
        student4.setEnrollmentYear(0);
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str22 = student4.getName();
        java.lang.String str23 = student4.getName();
        student4.setName("hi! - hi! ( - hi! (, Class of -1), Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " - hi! (, Class of 0)" + "'", str22, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " - hi! (, Class of 0)" + "'", str23, " - hi! (, Class of 0)");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        business.Student student13 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList14 = student13.getCompletedCourses();
        student13.setName("hi!");
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str22 = student21.getName();
        java.util.List<java.lang.String> strList23 = student21.getCompletedCourses();
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList29 = student28.getCompletedCourses();
        student21.setCompletedCourses(strList29);
        student13.setCompletedCourses(strList29);
        student4.setCompletedCourses(strList29);
        student4.setStudentId(" -  ( -  (, Class of 10), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList6 = null;
        student4.setCompletedCourses(strList6);
        int int8 = student4.getEnrollmentYear();
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse("hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        student4.setEnrollmentYear(35);
        student4.setMajor(" -  (hi!, Class of 100)");
        java.lang.String str14 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi!, Class of 100)" + "'", str14, " -  (hi!, Class of 100)");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getName();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.lang.String str15 = student4.getStudentId();
        student4.setStudentId(" -  (hi!, Class of 10)");
        java.lang.Class<?> wildcardClass18 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        int int12 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.setStudentId("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
        student4.addCompletedCourse(" -  (, Class of 0) -  (, Class of 100)");
        java.util.List<java.lang.String> strList20 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str17, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
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
        java.lang.String str21 = student4.getStudentId();
        java.lang.String str22 = student4.getStudentId();
        student4.setEnrollmentYear((int) '#');
        java.lang.String str25 = student4.getMajor();
        java.lang.String str26 = student4.getMajor();
        java.lang.Class<?> wildcardClass27 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        business.Student student4 = new business.Student(" -  (hi! -  (hi!, Class of 0), Class of 0)", " -  (hi!, Class of 100)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)", (-1));
        student4.setEnrollmentYear(100);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        student4.setMajor(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        business.Student student16 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student16.setStudentId("hi! -  (hi!, Class of 0)");
        int int19 = student16.getEnrollmentYear();
        java.util.List<java.lang.String> strList20 = student16.getCompletedCourses();
        java.lang.String str21 = student16.getMajor();
        java.lang.String str22 = student16.getMajor();
        student16.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str25 = student16.getName();
        java.util.List<java.lang.String> strList26 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList26);
        java.util.List<java.lang.String> strList28 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str25, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        int int9 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        student11.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList14 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)" + "'", str6, " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.toString();
        student4.addCompletedCourse(" -  (, Class of 10)");
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str21 = student4.getMajor();
        student4.setName(" -  ( -  (, Class of 0), Class of 0)");
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
        int int26 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  - hi! (, Class of 0) (, Class of 100)" + "'", str21, " -  - hi! (, Class of 0) (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        java.lang.String str78 = student4.getMajor();
        java.lang.String str79 = student4.toString();
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi! -  (, Class of 100)" + "'", str79, "hi! -  (, Class of 100)");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        int int13 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setStudentId(" -  -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0) (, Class of 10)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setEnrollmentYear(97);
        business.Student student14 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str15 = student14.getMajor();
        java.lang.String str16 = student14.getStudentId();
        student14.setStudentId(" -  (, Class of 10)");
        student14.setName(" - hi! (, Class of 0)");
        business.Student student25 = new business.Student("hi!", "", "hi!", 0);
        student25.setName(" -  (, Class of 10)");
        student25.setEnrollmentYear((int) '#');
        java.lang.String str30 = student25.getMajor();
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        student35.addCompletedCourse("");
        java.lang.String str38 = student35.toString();
        java.lang.String str39 = student35.getStudentId();
        business.Student student44 = new business.Student("hi!", "", "hi!", 0);
        student44.setName(" -  (, Class of 10)");
        student44.setMajor("");
        java.lang.String str49 = student44.getMajor();
        business.Student student54 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList55 = student54.getCompletedCourses();
        student44.setCompletedCourses(strList55);
        student35.setCompletedCourses(strList55);
        student25.setCompletedCourses(strList55);
        student14.setCompletedCourses(strList55);
        student4.setCompletedCourses(strList55);
        business.Student student65 = new business.Student("hi!", "", "hi!", 0);
        student65.addCompletedCourse("");
        java.lang.String str68 = student65.getName();
        student65.addCompletedCourse(" -  (, Class of 100)");
        business.Student student75 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str76 = student75.getName();
        student75.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList79 = student75.getCompletedCourses();
        java.lang.String str80 = student75.getName();
        business.Student student85 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student85.setStudentId("hi! -  (hi!, Class of 0)");
        int int88 = student85.getEnrollmentYear();
        java.util.List<java.lang.String> strList89 = student85.getCompletedCourses();
        student75.setCompletedCourses(strList89);
        java.lang.String str91 = student75.toString();
        java.util.List<java.lang.String> strList92 = student75.getCompletedCourses();
        student65.setCompletedCourses(strList92);
        student4.setCompletedCourses(strList92);
        java.lang.Class<?> wildcardClass95 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " -  (, Class of 0)" + "'", str38, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + " -  (, Class of 10)" + "'", str91, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        business.Student student4 = new business.Student(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)", "hi! - hi! (hi!, Class of 100)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)", (int) (short) 1);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        java.lang.String str23 = student4.getStudentId();
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("hi! -  (hi!, Class of 97)");
        int int28 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        java.lang.String str21 = student4.getMajor();
        int int22 = student4.getEnrollmentYear();
        java.lang.String str23 = student4.getMajor();
        student4.setMajor("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        business.Student student4 = new business.Student("", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (short) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.toString();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)" + "'", str8, " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)", "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)", 52);
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52), Class of 52)" + "'", str5, " -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52), Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str6, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", " - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (byte) -1);
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str8, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) 10);
        int int18 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        business.Student student4 = new business.Student("", "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)", "hi! - hi! (hi!, Class of 100)", 0);
        business.Student student9 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", "hi! -  (hi! -  (hi!, Class of 0), Class of 0)", (int) (short) 1);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        business.Student student4 = new business.Student("", "hi! -  (hi!, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", (int) (byte) 0);
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10), Class of 97)" + "'", str10, " -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10), Class of 97)");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52)");
        student4.setMajor(" - hi! -  (hi!, Class of 0) (, Class of 100)");
        java.util.List<java.lang.String> strList22 = student4.getCompletedCourses();
        student4.setMajor(" -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)");
        java.lang.String str25 = student4.getName();
        java.lang.String str26 = student4.getMajor();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 10)" + "'", str25, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)" + "'", str26, " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        java.util.List<java.lang.String> strList55 = student4.getCompletedCourses();
        student4.setStudentId("");
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
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) -1);
        java.lang.String str7 = student4.getMajor();
        student4.setMajor(" - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getName();
        student4.setStudentId(" - hi! (, Class of 100) - hi! - hi! (hi!, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        student4.setStudentId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        student4.setEnrollmentYear((int) '#');
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str26 = student4.toString();
        student4.addCompletedCourse(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)");
        int int29 = student4.getEnrollmentYear();
        java.lang.String str30 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)" + "'", str26, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str30, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        java.util.List<java.lang.String> strList29 = student4.getCompletedCourses();
        java.lang.String str30 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str28, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.setEnrollmentYear(32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        student4.setEnrollmentYear((int) '4');
        student4.setName("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList23 = student22.getCompletedCourses();
        student22.setName("hi!");
        student22.addCompletedCourse("");
        java.util.List<java.lang.String> strList28 = student22.getCompletedCourses();
        java.lang.String str29 = student22.getStudentId();
        java.lang.String str30 = student22.toString();
        business.Student student35 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        student22.setCompletedCourses(strList36);
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList43 = student42.getCompletedCourses();
        student22.setCompletedCourses(strList43);
        student4.setCompletedCourses(strList43);
        java.lang.String str46 = student4.getMajor();
        java.lang.String str47 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " - hi! (, Class of 0)" + "'", str30, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + " -  (, Class of 0)" + "'", str46, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str47, "hi! -  ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student14.setStudentId("");
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str23 = student22.getName();
        java.util.List<java.lang.String> strList24 = student22.getCompletedCourses();
        student14.setCompletedCourses(strList24);
        student4.setCompletedCourses(strList24);
        int int27 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(0);
        java.lang.String str30 = student4.toString();
        student4.setEnrollmentYear(1);
        java.util.List<java.lang.String> strList33 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 0)" + "'", str30, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        business.Student student13 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str14 = student13.getStudentId();
        student13.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student13.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        business.Student student23 = new business.Student("hi!", "", "hi!", 0);
        student23.setName(" -  (, Class of 10)");
        student23.setMajor("");
        student23.setMajor("hi! -  (hi!, Class of 0)");
        student23.setName("");
        student23.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str34 = student23.toString();
        java.util.List<java.lang.String> strList35 = student23.getCompletedCourses();
        student13.setCompletedCourses(strList35);
        student4.setCompletedCourses(strList35);
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList43 = student42.getCompletedCourses();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        student42.setCompletedCourses((java.util.List<java.lang.String>) strList47);
        java.lang.String str50 = student42.getName();
        student42.setStudentId(" -  (, Class of 0)");
        student42.setMajor(" -  (, Class of 10)");
        student42.setEnrollmentYear((int) (byte) 100);
        student42.setEnrollmentYear(35);
        java.lang.String str59 = student42.getName();
        java.util.List<java.lang.String> strList60 = student42.getCompletedCourses();
        student4.setCompletedCourses(strList60);
        student4.addCompletedCourse(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
        student4.addCompletedCourse("");
        java.lang.String str66 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str34, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi! -  (hi!, Class of 0) - hi! (, Class of 100)" + "'", str66, "hi! -  (hi!, Class of 0) - hi! (, Class of 100)");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getName();
        student4.addCompletedCourse("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str21 = student20.getName();
        student20.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList24 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 100)" + "'", str12, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.getName();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        java.lang.String str11 = student4.getMajor();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! - hi! (hi!, Class of 35)");
        java.lang.String str8 = student4.getStudentId();
        int int9 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        java.lang.String str16 = student4.getStudentId();
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) -1);
        int int8 = student4.getEnrollmentYear();
        business.Student student13 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList14 = student13.getCompletedCourses();
        student13.setStudentId("");
        int int17 = student13.getEnrollmentYear();
        student13.setEnrollmentYear((int) (short) 1);
        student13.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        java.util.List<java.lang.String> strList22 = student13.getCompletedCourses();
        student4.setCompletedCourses(strList22);
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  (, Class of -1)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        business.Student student4 = new business.Student(" -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)", " -  -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0) (, Class of 10)", " -  (, Class of 0)", (int) '4');
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setStudentId("hi! -  (, Class of 0)");
        java.lang.String str14 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  (, Class of 0) -  (, Class of 100)" + "'", str14, "hi! -  (, Class of 0) -  (, Class of 100)");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str11 = student4.getMajor();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)", " -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", 0);
        business.Student student9 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str10 = student9.getName();
        java.lang.String str11 = student9.getMajor();
        java.util.List<java.lang.String> strList12 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        int int9 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 100)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)", 100);
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  (, Class of 100)");
        java.lang.String str15 = student4.getMajor();
        student4.setEnrollmentYear((int) (byte) 1);
        java.lang.String str18 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 100)" + "'", str15, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  -  (, Class of 10) ( -  (, Class of 100), Class of 1)" + "'", str18, "hi! -  -  (, Class of 10) ( -  (, Class of 100), Class of 1)");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)", " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)", 52);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        java.lang.String str31 = student4.getStudentId();
        java.util.List<java.lang.String> strList32 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 10)" + "'", str26, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " -  (, Class of 0)" + "'", str31, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        java.lang.String str21 = student4.toString();
        java.lang.String str22 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str21, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.setName(" -  (, Class of 10)");
        student4.addCompletedCourse("hi! -  (, Class of 0) -  (, Class of 100)");
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
        int int44 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(0);
        java.lang.Class<?> wildcardClass47 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        business.Student student4 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)" + "'", str6, "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        business.Student student11 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        java.util.List<java.lang.String> strList14 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setEnrollmentYear((int) (byte) -1);
        student4.setMajor("");
        student4.setEnrollmentYear((int) (short) -1);
        int int22 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        student4.setName("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        business.Student student4 = new business.Student("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)", "hi! -  ( -  (, Class of 0), Class of 0)", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", 100);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        java.lang.String str13 = student4.toString();
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)" + "'", str13, "hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)");
        org.junit.Assert.assertNull(strList14);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        java.lang.String str16 = student4.getMajor();
        int int17 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str16, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear(0);
        java.lang.String str10 = student4.getMajor();
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)");
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" - hi! (hi!, Class of 52)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        student4.setName("");
        student4.setEnrollmentYear((int) (short) 100);
        java.util.List<java.lang.String> strList37 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass38 = strList37.getClass();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str17 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", 97);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setStudentId(" -  (, Class of 10)");
        java.lang.String str18 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setStudentId("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.setName("hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", "hi! -  (hi!, Class of 0)", " - hi! (, Class of 100)", 0);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        int int7 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 100)");
        java.lang.String str10 = student4.getStudentId();
        student4.addCompletedCourse(" -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10), Class of 97)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        java.lang.String str14 = student4.getStudentId();
        int int15 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        java.lang.String str21 = student4.getStudentId();
        student4.setMajor("hi! - hi! (hi!, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 0)" + "'", str21, " -  (, Class of 0)");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        business.Student student4 = new business.Student("", "hi! -  (hi!, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", (int) (byte) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)", "hi! -  -  (, Class of 10) (, Class of 1) - hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32), Class of 97)", " -  ( -  (, Class of 0), Class of 0)", (int) (short) 100);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str11 = student4.getMajor();
        student4.setMajor("hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
        java.lang.String str14 = student4.toString();
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)" + "'", str14, " - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setName("");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getName();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.addCompletedCourse("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        student4.setMajor(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)");
        java.lang.String str22 = student4.toString();
        student4.setStudentId("");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)" + "'", str22, "hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)", "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)", (int) (short) 10);
        student4.setMajor("");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getName();
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.lang.String str13 = student4.toString();
        student4.addCompletedCourse(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str13, "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str15 = student4.toString();
        business.Student student20 = new business.Student("hi!", "", "hi!", 0);
        student20.setName(" -  (, Class of 10)");
        student20.setEnrollmentYear((int) '#');
        java.lang.String str25 = student20.getMajor();
        java.util.List<java.lang.String> strList26 = student20.getCompletedCourses();
        student20.setMajor(" - hi! (hi!, Class of 52)");
        student20.setEnrollmentYear((int) (byte) 1);
        business.Student student35 = new business.Student("hi!", "", "hi!", 0);
        student35.setName(" -  (, Class of 10)");
        student35.setEnrollmentYear((int) '#');
        java.lang.String str40 = student35.getMajor();
        int int41 = student35.getEnrollmentYear();
        java.util.List<java.lang.String> strList42 = student35.getCompletedCourses();
        student20.setCompletedCourses(strList42);
        student4.setCompletedCourses(strList42);
        java.lang.String str45 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)" + "'", str15, " -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" - hi! (, Class of 100)");
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (, Class of 32)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0), Class of 100)", (int) '4');
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (short) 10);
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str7 = student4.getMajor();
        student4.setName(" -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse(" -  (, Class of 0)");
        int int12 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        business.Student student4 = new business.Student(" -  - hi! (, Class of -1) (hi!, Class of 10)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", " -  (hi! -  (hi!, Class of 0), Class of 0)", (int) (byte) 1);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  - hi! (, Class of -1) (hi!, Class of 10)" + "'", str5, " -  - hi! (, Class of -1) (hi!, Class of 10)");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str38 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 10)" + "'", str30, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        int int16 = student4.getEnrollmentYear();
        student4.setMajor("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        java.lang.String str25 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)" + "'", str25, "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        business.Student student18 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student18.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str21 = student18.getMajor();
        java.util.List<java.lang.String> strList22 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList22);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str21, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        int int17 = student4.getEnrollmentYear();
        java.lang.String str18 = student4.getMajor();
        java.lang.String str19 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)");
        java.lang.Class<?> wildcardClass22 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
        java.lang.String str35 = student4.getMajor();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList6 = null;
        student4.setCompletedCourses(strList6);
        java.lang.String str8 = student4.toString();
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse(" -  (hi!, Class of 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str8, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)", "hi! -  (hi!, Class of 97)", (int) (short) 100);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setEnrollmentYear(32);
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", (-1));
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.setName(" - hi! (, Class of 0)");
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str15 = student14.getName();
        student14.setEnrollmentYear(10);
        student14.setEnrollmentYear((int) (byte) 0);
        student14.setMajor(" - hi! (, Class of 0)");
        java.lang.String str22 = student14.getMajor();
        int int23 = student14.getEnrollmentYear();
        java.lang.String str24 = student14.getMajor();
        student14.setStudentId(" -  (, Class of 0)");
        business.Student student31 = new business.Student("hi!", "", "hi!", 0);
        student31.addCompletedCourse("");
        java.lang.String str34 = student31.getName();
        student31.setMajor("");
        java.lang.String str37 = student31.getName();
        int int38 = student31.getEnrollmentYear();
        java.util.List<java.lang.String> strList39 = student31.getCompletedCourses();
        student14.setCompletedCourses(strList39);
        student4.setCompletedCourses(strList39);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " - hi! (, Class of 0)" + "'", str22, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " - hi! (, Class of 0)" + "'", str24, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! -  - hi! (, Class of 0) (, Class of 10)", " -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)", (int) (byte) 10);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.setMajor("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 100)", "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)", "hi! -  (hi! -  (, Class of 10), Class of 10)", 35);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        student4.setName("hi!");
        java.lang.String str15 = student4.getName();
        java.lang.String str16 = student4.getMajor();
        student4.setName("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        business.Student student4 = new business.Student("hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)", "hi! -  (hi!, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", (int) (byte) 0);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        business.Student student14 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student14.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student14.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList25 = student24.getCompletedCourses();
        student24.setName("hi!");
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str33 = student32.getName();
        java.util.List<java.lang.String> strList34 = student32.getCompletedCourses();
        business.Student student39 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList40 = student39.getCompletedCourses();
        student32.setCompletedCourses(strList40);
        student24.setCompletedCourses(strList40);
        student14.setCompletedCourses(strList40);
        student4.setCompletedCourses(strList40);
        student4.setEnrollmentYear(0);
        business.Student student51 = new business.Student("hi!", "", "hi!", 0);
        student51.setName(" -  (, Class of 10)");
        student51.setEnrollmentYear((int) '#');
        java.lang.String str56 = student51.toString();
        java.lang.String str57 = student51.getMajor();
        java.lang.String str58 = student51.getStudentId();
        java.lang.String str59 = student51.getStudentId();
        java.lang.String str60 = student51.getStudentId();
        java.util.List<java.lang.String> strList61 = student51.getCompletedCourses();
        student4.setCompletedCourses(strList61);
        java.lang.Class<?> wildcardClass63 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str56, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        student4.setName("hi!");
        java.lang.String str15 = student4.getName();
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int14 = student4.getEnrollmentYear();
        java.lang.String str15 = student4.getStudentId();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str15, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", 0);
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 10)" + "'", str6, " -  (, Class of 10)");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        business.Student student4 = new business.Student(" - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)", "hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", 1);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        java.lang.String str14 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 0)" + "'", str14, " -  (, Class of 0)");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setEnrollmentYear(0);
        java.lang.String str7 = student4.getStudentId();
        student4.addCompletedCourse(" -  (, Class of 0)");
        student4.setStudentId(" - hi! (, Class of -1)");
        student4.setMajor("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        int int15 = student4.getEnrollmentYear();
        student4.setStudentId("hi! - hi! (hi!, Class of 35)");
        java.lang.String str18 = student4.toString();
        java.lang.String str19 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi! (hi!, Class of 35) -  ( -  (, Class of 0), Class of 0)" + "'", str18, "hi! - hi! (hi!, Class of 35) -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi! (hi!, Class of 35) -  ( -  (, Class of 0), Class of 0)" + "'", str19, "hi! - hi! (hi!, Class of 35) -  ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
        java.lang.String str71 = student4.getMajor();
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + " - hi! (, Class of 0)" + "'", str71, " - hi! (, Class of 0)");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String[] strArray17 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        int int22 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList23 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 0)" + "'", str14, " - hi! (, Class of 0)");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setEnrollmentYear((int) '4');
        business.Student student11 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 0)", (int) (short) 10);
        java.lang.String str12 = student11.toString();
        business.Student student17 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.String str18 = student17.getStudentId();
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str24 = student23.getName();
        student23.setEnrollmentYear((int) (byte) 10);
        java.lang.String str27 = student23.toString();
        student23.setEnrollmentYear((int) (byte) 100);
        java.lang.String str30 = student23.toString();
        java.lang.String str31 = student23.getName();
        java.lang.String str32 = student23.getMajor();
        business.Student student37 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList38 = student37.getCompletedCourses();
        student37.setStudentId("");
        int int41 = student37.getEnrollmentYear();
        student37.setEnrollmentYear((int) (short) 1);
        student37.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student37.setEnrollmentYear((int) '#');
        business.Student student52 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList53 = student52.getCompletedCourses();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        student52.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student37.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student23.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student17.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student11.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)" + "'", str12, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str18, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " -  (, Class of 10)" + "'", str27, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 100)" + "'", str30, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        business.Student student4 = new business.Student("", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (short) 100);
        student4.setName(" - hi! (, Class of 100)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student13 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student13.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList16 = student13.getCompletedCourses();
        java.util.List<java.lang.String> strList17 = student13.getCompletedCourses();
        java.lang.String str18 = student13.toString();
        student13.setEnrollmentYear((int) (short) -1);
        student13.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str23 = student13.getMajor();
        java.lang.String str24 = student13.getMajor();
        business.Student student29 = new business.Student("hi!", "", "hi!", 0);
        student29.setName(" -  (, Class of 10)");
        student29.setMajor("");
        java.lang.String str34 = student29.getMajor();
        java.lang.String str35 = student29.getStudentId();
        java.lang.String str36 = student29.getName();
        java.util.List<java.lang.String> strList37 = student29.getCompletedCourses();
        student29.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str40 = student29.getStudentId();
        java.lang.String str41 = student29.getMajor();
        business.Student student46 = new business.Student("hi!", "", "hi!", 0);
        student46.setName(" -  (, Class of 10)");
        student46.setMajor("");
        student46.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str53 = student46.getMajor();
        java.lang.String str54 = student46.getMajor();
        student46.setName("hi!");
        java.lang.String str57 = student46.getName();
        business.Student student62 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList63 = student62.getCompletedCourses();
        student46.setCompletedCourses(strList63);
        student29.setCompletedCourses(strList63);
        student13.setCompletedCourses(strList63);
        student4.setCompletedCourses(strList63);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str18, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 10)" + "'", str24, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " -  (, Class of 10)" + "'", str36, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str41, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str53, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str54, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(strList63);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        business.Student student16 = new business.Student("hi!", "", "hi!", 0);
        student16.setName(" -  (, Class of 10)");
        student16.setMajor("");
        java.lang.String str21 = student16.getMajor();
        java.lang.String str22 = student16.getStudentId();
        java.lang.String str23 = student16.getName();
        java.util.List<java.lang.String> strList24 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        student4.setEnrollmentYear((int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) (hi!, Class of 35)", "", "hi! -  (hi!, Class of 0) -  -  (, Class of 100) (, Class of -1)", (int) (byte) -1);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setMajor("");
        java.lang.String[] strArray26 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList27);
        java.util.List<java.lang.String> strList31 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList31);
    }
}

