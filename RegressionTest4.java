import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        business.Student student4 = new business.Student(" -  (hi! -  (hi!, Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", " - hi! (, Class of -1)", (int) (short) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        int int8 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str7 = student4.toString();
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)" + "'", str7, " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", "", "hi! -  (, Class of 0)", 100);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str5, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", " - hi! (, Class of 0)", "", (int) '4');
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        business.Student student11 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        java.lang.String str14 = student4.toString();
        java.lang.String str15 = student4.getName();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)" + "'", str14, " - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! (, Class of 0)" + "'", str15, " - hi! (, Class of 0)");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)");
        java.lang.String str25 = student4.getName();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)" + "'", str25, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        student4.setStudentId(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        java.lang.String str13 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 0)" + "'", str13, " -  (, Class of 0)");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        business.Student student26 = new business.Student("hi!", "", "hi!", 0);
        student26.setName(" -  (, Class of 10)");
        student26.setMajor("");
        student26.setMajor("hi! -  (hi!, Class of 0)");
        student26.setName("");
        student26.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        int int37 = student26.getEnrollmentYear();
        java.util.List<java.lang.String> strList38 = student26.getCompletedCourses();
        student4.setCompletedCourses(strList38);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str10 = student9.getName();
        student9.setEnrollmentYear(10);
        student9.setEnrollmentYear((int) (byte) 0);
        student9.setEnrollmentYear((int) (byte) 100);
        java.lang.String str17 = student9.getName();
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str23 = student22.getName();
        student22.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList26 = student22.getCompletedCourses();
        java.lang.String str27 = student22.getName();
        business.Student student32 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student32.setStudentId("hi! -  (hi!, Class of 0)");
        int int35 = student32.getEnrollmentYear();
        java.util.List<java.lang.String> strList36 = student32.getCompletedCourses();
        student22.setCompletedCourses(strList36);
        java.lang.String str38 = student22.toString();
        java.util.List<java.lang.String> strList39 = student22.getCompletedCourses();
        business.Student student44 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str45 = student44.getName();
        java.lang.String str46 = student44.getName();
        java.lang.String str47 = student44.getStudentId();
        java.lang.String str48 = student44.toString();
        business.Student student53 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList54 = student53.getCompletedCourses();
        student44.setCompletedCourses(strList54);
        student22.setCompletedCourses(strList54);
        student9.setCompletedCourses(strList54);
        student4.setCompletedCourses(strList54);
        java.lang.String str59 = student4.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " -  (, Class of 10)" + "'", str38, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str48, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " -  (, Class of 10)" + "'", str59, " -  (, Class of 10)");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        java.util.List<java.lang.String> strList41 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str15, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " - hi! (, Class of 0)" + "'", str28, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 0)" + "'", str33, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)");
        int int23 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi!, Class of 10)" + "'", str12, " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi!, Class of 10)");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (byte) 0);
        java.lang.String str5 = student4.getMajor();
        student4.addCompletedCourse(" - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)");
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)" + "'", str8, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str12, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        student4.setEnrollmentYear(35);
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getName();
        java.lang.String str17 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 10)" + "'", str17, " -  (, Class of 10)");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  (, Class of 10)", "", (int) (short) 10);
        java.lang.String str5 = student4.toString();
        student4.setEnrollmentYear(0);
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)" + "'", str8, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.lang.String str13 = student4.toString();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        java.lang.String str16 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)" + "'", str13, "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str16, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        student4.addCompletedCourse(" -  - hi! (, Class of -1) (, Class of 0)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getName();
        int int11 = student4.getEnrollmentYear();
        business.Student student16 = new business.Student("", "hi!", "", 100);
        student16.setEnrollmentYear((int) (short) -1);
        java.lang.String str19 = student16.getMajor();
        student16.setEnrollmentYear(52);
        java.util.List<java.lang.String> strList22 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", (-1));
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str6, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.toString();
        int int10 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)");
        java.lang.String str13 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! (hi!, Class of 100)" + "'", str9, "hi! - hi! (hi!, Class of 100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) - hi! (hi!, Class of 100)" + "'", str13, "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) - hi! (hi!, Class of 100)");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId("hi! -  (, Class of 100)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) - hi! (hi!, Class of 100)", " -  - hi! (, Class of 0) (, Class of 0)", "hi! -  (hi!, Class of 0) -  (, Class of 0)", (int) (short) 100);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.util.List<java.lang.String> strList25 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 100) (, Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setEnrollmentYear(52);
        student4.setStudentId("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        business.Student student4 = new business.Student("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)", "hi! -  (, Class of 100)", "hi! -  (hi!, Class of 1)", 0);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)" + "'", str5, "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", (int) (short) 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        int int8 = student4.getEnrollmentYear();
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 0)" + "'", str11, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        business.Student student4 = new business.Student("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)", "hi! -  (, Class of 0)", 10);
        student4.setEnrollmentYear((int) (byte) 100);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        business.Student student4 = new business.Student(" -  (hi!, Class of 10)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)", (int) '#');
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.toString();
        student4.setStudentId(" -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.lang.String str20 = student4.getStudentId();
        student4.setStudentId(" - hi! (, Class of 100)");
        java.lang.String str23 = student4.getStudentId();
        business.Student student28 = new business.Student("", "hi!", "", 100);
        java.lang.String str29 = student28.getMajor();
        java.util.List<java.lang.String> strList30 = student28.getCompletedCourses();
        student4.setCompletedCourses(strList30);
        java.util.List<java.lang.String> strList32 = student4.getCompletedCourses();
        java.lang.String str33 = student4.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " - hi! (, Class of 100)" + "'", str23, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str33, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)", "hi! -  - hi! (, Class of 0) (, Class of 10)", 32);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        business.Student student4 = new business.Student(" -  (, Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)", "hi! -  (hi!, Class of 1)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)", (int) (byte) 10);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str10 = student9.getName();
        student9.setEnrollmentYear(10);
        student9.setEnrollmentYear((int) (byte) 0);
        student9.setMajor(" - hi! (, Class of 0)");
        java.lang.String str17 = student9.getName();
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList23 = student22.getCompletedCourses();
        student22.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str26 = student22.getName();
        business.Student student31 = new business.Student("hi!", "", "hi!", 0);
        student31.setName(" -  (, Class of 10)");
        student31.setMajor("");
        java.lang.String str36 = student31.getMajor();
        java.lang.String str37 = student31.getStudentId();
        java.lang.String str38 = student31.getName();
        java.util.List<java.lang.String> strList39 = student31.getCompletedCourses();
        student31.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str42 = student31.getStudentId();
        java.lang.String str43 = student31.getMajor();
        business.Student student48 = new business.Student("hi!", "", "hi!", 0);
        student48.setName(" -  (, Class of 10)");
        student48.setMajor("");
        student48.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str55 = student48.getMajor();
        java.lang.String str56 = student48.getMajor();
        student48.setName("hi!");
        java.lang.String str59 = student48.getName();
        business.Student student64 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList65 = student64.getCompletedCourses();
        student48.setCompletedCourses(strList65);
        student31.setCompletedCourses(strList65);
        student22.setCompletedCourses(strList65);
        student9.setCompletedCourses(strList65);
        student4.setCompletedCourses(strList65);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str26, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " -  (, Class of 10)" + "'", str38, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str43, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str55, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str56, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(strList65);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        student4.setStudentId("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str7, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)" + "'", str8, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str11 = student4.getMajor();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        business.Student student4 = new business.Student(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", " - hi! -  (hi!, Class of 0) (, Class of 100)", (int) (byte) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        student4.setEnrollmentYear((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        business.Student student4 = new business.Student("hi! -  (, Class of 10)", " -  - hi! (, Class of -1) (hi!, Class of 10)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", (int) (short) -1);
        student4.setName("hi! -  (hi! -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getName();
        int int6 = student4.getEnrollmentYear();
        int int7 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.toString();
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str12, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        java.lang.String str38 = student4.getMajor();
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " - hi! (, Class of 0)" + "'", str38, " - hi! (, Class of 0)");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 100)", "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)", 32);
        student4.setStudentId("");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)", 35);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", "hi! - hi! -  (, Class of 0) (hi!, Class of 35)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", (int) (byte) 0);
        student4.setMajor(" -  (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        java.lang.String str24 = student4.getName();
        business.Student student29 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 97)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)", 0);
        java.util.List<java.lang.String> strList30 = student29.getCompletedCourses();
        student4.setCompletedCourses(strList30);
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        student4.setName(" - hi! (, Class of -1)");
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        int int27 = student4.getEnrollmentYear();
        java.lang.String str28 = student4.getMajor();
        java.lang.String str29 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str11 = student4.getName();
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setMajor(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        business.Student student10 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList11 = student10.getCompletedCourses();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        student10.setCompletedCourses((java.util.List<java.lang.String>) strList15);
        int int18 = student10.getEnrollmentYear();
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        student23.setName("hi!");
        student23.addCompletedCourse("");
        java.util.List<java.lang.String> strList29 = student23.getCompletedCourses();
        java.lang.String str30 = student23.getStudentId();
        java.lang.String str31 = student23.toString();
        business.Student student36 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList37 = student36.getCompletedCourses();
        student23.setCompletedCourses(strList37);
        business.Student student43 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList44 = student43.getCompletedCourses();
        student23.setCompletedCourses(strList44);
        student10.setCompletedCourses(strList44);
        student4.setCompletedCourses(strList44);
        business.Student student52 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList53 = student52.getCompletedCourses();
        student52.setStudentId("");
        business.Student student60 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str61 = student60.getName();
        java.util.List<java.lang.String> strList62 = student60.getCompletedCourses();
        student52.setCompletedCourses(strList62);
        java.lang.String str64 = student52.getStudentId();
        student52.setStudentId(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.util.List<java.lang.String> strList67 = student52.getCompletedCourses();
        student4.setCompletedCourses(strList67);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " - hi! (, Class of 0)" + "'", str31, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strList67);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        student4.setName("hi!");
        int int22 = student4.getEnrollmentYear();
        student4.setStudentId("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.lang.String str25 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str25, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        business.Student student4 = new business.Student(" -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)", "", "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)", 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.addCompletedCourse(" -  (, Class of 0)");
        int int17 = student4.getEnrollmentYear();
        java.lang.String str18 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        business.Student student4 = new business.Student("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)", " -  - hi! (, Class of -1) (hi!, Class of 10)", (int) (short) 10);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear(0);
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)", "hi! -  (hi!, Class of 1)", (int) (short) 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.lang.String str25 = student4.toString();
        student4.addCompletedCourse(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10), Class of 0)" + "'", str25, " -  (, Class of 10) - hi! -  (hi!, Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10), Class of 0)");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", " -  (, Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", 35);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str14 = student4.getMajor();
        student4.addCompletedCourse(" - hi! (hi!, Class of 52)");
        student4.setName(" - hi! (, Class of 100)");
        java.lang.Class<?> wildcardClass19 = student4.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.lang.String str7 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (hi!, Class of 52)");
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setStudentId("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)");
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getName();
        student4.setMajor(" -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str12 = student4.getName();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        business.Student student18 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList19 = student18.getCompletedCourses();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList23);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList23);
        java.lang.String str27 = student4.getName();
        int int28 = student4.getEnrollmentYear();
        int int29 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)", "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", 32);
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32)" + "'", str5, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32)");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)", " -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", (int) (short) 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        student4.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        java.util.List<java.lang.String> strList24 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.setName("");
        java.lang.String str19 = student4.getName();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        business.Student student4 = new business.Student("hi! -  ( -  (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (, Class of 100)", 97);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        java.lang.String str7 = student4.getMajor();
        student4.addCompletedCourse("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", " - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)", (int) (short) -1);
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)" + "'", str5, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)" + "'", str6, " - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.getStudentId();
        int int11 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 1)");
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getName();
        java.lang.String str16 = student4.getMajor();
        student4.setEnrollmentYear((-1));
        student4.setStudentId(" - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 0)" + "'", str14, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 0)" + "'", str16, " - hi! (, Class of 0)");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        business.Student student4 = new business.Student(" -  - hi! (, Class of -1) (hi!, Class of 10)", "hi! -  (hi! -  (hi!, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)", 97);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        business.Student student34 = new business.Student(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", (int) ' ');
        business.Student student39 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str40 = student39.getName();
        student39.setEnrollmentYear((int) 'a');
        java.lang.String str43 = student39.getMajor();
        java.lang.String str44 = student39.getName();
        java.lang.String str45 = student39.getStudentId();
        java.util.List<java.lang.String> strList46 = student39.getCompletedCourses();
        student34.setCompletedCourses(strList46);
        student4.setCompletedCourses(strList46);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.lang.String str7 = student4.getMajor();
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        student12.setEnrollmentYear(10);
        student12.setEnrollmentYear((int) (byte) 0);
        student12.setMajor(" - hi! (, Class of 0)");
        java.lang.String str20 = student12.getMajor();
        java.lang.String str21 = student12.getName();
        java.util.List<java.lang.String> strList22 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList22);
        student4.setName("hi! - hi! (hi!, Class of 100)");
        student4.setEnrollmentYear((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 0)" + "'", str20, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) (byte) 0);
        java.lang.String str14 = student4.getMajor();
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        java.lang.String str16 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)", " - hi! (hi!, Class of 10)", (int) (byte) 10);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        java.util.List<java.lang.String> strList22 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 0)", (int) (short) 10);
        student4.setName(" - hi! (, Class of 100)");
        student4.setEnrollmentYear((-1));
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        business.Student student4 = new business.Student(" - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 100)" + "'", str11, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 100)" + "'", str14, " -  (, Class of 100)");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        student4.addCompletedCourse("hi! -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        business.Student student4 = new business.Student(" - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)", 10);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.getMajor();
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str7, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 0)" + "'", str9, " - hi! (, Class of 0)");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("");
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        business.Student student4 = new business.Student(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", " -  (, Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)", (int) '4');
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str16 = student4.getName();
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 0)" + "'", str16, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.String str14 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str14, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", 0);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 10)" + "'", str6, " -  (, Class of 10)");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        student4.setStudentId("");
        java.lang.String str21 = student4.getMajor();
        student4.setEnrollmentYear(32);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 0)" + "'", str21, " - hi! (, Class of 0)");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) 'a');
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList13 = student12.getCompletedCourses();
        student12.setName("hi!");
        student12.addCompletedCourse("");
        java.lang.String str18 = student12.toString();
        java.lang.String str19 = student12.getStudentId();
        java.lang.String str20 = student12.getMajor();
        java.util.List<java.lang.String> strList21 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList21);
        student4.setName(" - hi! -  (hi!, Class of 0) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! (, Class of 0)" + "'", str18, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.getMajor();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        student4.addCompletedCourse(" -  (hi!, Class of 100)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.toString();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setMajor(" -  (hi!, Class of 100)");
        java.lang.String str17 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) - hi! ( -  (hi!, Class of 100), Class of 0)" + "'", str17, "hi! -  -  (, Class of 10) (, Class of 0) - hi! ( -  (hi!, Class of 100), Class of 0)");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        business.Student student4 = new business.Student(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)", " - hi! (, Class of -1)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", 10);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        java.lang.String str25 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str24, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 0)", (int) (short) 10);
        student4.setName(" - hi! (, Class of 100)");
        student4.setEnrollmentYear((-1));
        int int9 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str15 = student4.toString();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str15, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str14 = student4.toString();
        student4.setName("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        java.lang.String str17 = student4.getStudentId();
        java.lang.Class<?> wildcardClass18 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str14, " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setEnrollmentYear(35);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        java.lang.String str11 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", " -  - hi! (, Class of 0) (, Class of 0)", (int) (short) 1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        student4.setEnrollmentYear((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str17, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0)", (int) ' ');
        student4.setEnrollmentYear((int) (byte) 1);
        java.lang.String str7 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str7, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        student4.setEnrollmentYear(0);
        student4.setMajor(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        java.lang.String str8 = student4.getStudentId();
        student4.setEnrollmentYear((-1));
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int14 = student4.getEnrollmentYear();
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)", " -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", " -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)", 32);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((-1));
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        int int14 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(0);
        student4.setEnrollmentYear(1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)", " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)", "", 32);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)" + "'", str7, " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.lang.String str13 = student4.getName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str10, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 10)" + "'", str13, " -  (, Class of 10)");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", 10);
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId(" - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 0)" + "'", str9, " - hi! (, Class of 0)");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        business.Student student51 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student56 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList57 = student56.getCompletedCourses();
        student51.setCompletedCourses(strList57);
        student4.setCompletedCourses(strList57);
        java.lang.String str60 = student4.getMajor();
        java.lang.Class<?> wildcardClass61 = student4.getClass();
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
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + " -  (, Class of 0)" + "'", str60, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        java.lang.String str22 = student4.getMajor();
        java.lang.String str23 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setMajor("hi!");
        java.lang.String str11 = student4.toString();
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        student16.addCompletedCourse("");
        java.lang.String str19 = student16.toString();
        student16.setMajor(" -  (, Class of 0)");
        java.lang.String str22 = student16.getStudentId();
        java.lang.String str23 = student16.getMajor();
        java.util.List<java.lang.String> strList24 = student16.getCompletedCourses();
        business.Student student29 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList30 = null;
        student29.setCompletedCourses(strList30);
        java.lang.String str32 = student29.getMajor();
        business.Student student37 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str38 = student37.getName();
        student37.setEnrollmentYear(10);
        student37.setEnrollmentYear((int) (byte) 0);
        student37.setMajor(" - hi! (, Class of 0)");
        java.lang.String str45 = student37.getMajor();
        java.lang.String str46 = student37.getName();
        java.util.List<java.lang.String> strList47 = student37.getCompletedCourses();
        student29.setCompletedCourses(strList47);
        student16.setCompletedCourses(strList47);
        student4.setCompletedCourses(strList47);
        java.lang.String str51 = student4.getName();
        java.lang.String str52 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (hi!, Class of 10)" + "'", str11, " -  (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  (, Class of 0)" + "'", str19, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 0)" + "'", str23, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " - hi! (, Class of 0)" + "'", str45, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        student4.setMajor(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        student4.setName(" -  ( -  (, Class of 10), Class of 0)");
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        java.lang.String str20 = student4.getName();
        student4.setMajor(" -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 0)" + "'", str20, " - hi! (, Class of 0)");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        int int10 = student4.getEnrollmentYear();
        int int11 = student4.getEnrollmentYear();
        student4.setMajor(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        int int19 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass20 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        java.lang.String str8 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", (int) 'a');
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setName(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", (int) '4');
        student4.setName("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
        business.Student student11 = new business.Student("hi! -  (hi!, Class of 97)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", (int) 'a');
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 0)", (int) (short) 10);
        student4.setName(" - hi! (, Class of 100)");
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str8, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        java.lang.String str14 = student4.toString();
        int int15 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str14, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        business.Student student9 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str10 = student9.getName();
        business.Student student15 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str16 = student15.getMajor();
        business.Student student21 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student21.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList24 = student21.getCompletedCourses();
        student15.setCompletedCourses(strList24);
        student9.setCompletedCourses(strList24);
        student4.setCompletedCourses(strList24);
        java.lang.String str28 = student4.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 0)" + "'", str16, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) - hi! ( -  (hi!, Class of 100), Class of 0)", "hi! -  (hi!, Class of 35)", "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)", (int) (byte) 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        business.Student student4 = new business.Student("hi! - hi! ( - hi! (, Class of -1), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", "hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)", 1);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        java.lang.Class<?> wildcardClass33 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.lang.String str7 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        business.Student student30 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", (int) ' ');
        java.lang.String str31 = student30.toString();
        java.util.List<java.lang.String> strList32 = student30.getCompletedCourses();
        student4.setCompletedCourses(strList32);
        student4.setStudentId("hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)" + "'", str31, "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        int int38 = student4.getEnrollmentYear();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.setName("hi! -  - hi! (, Class of 100) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str11 = student4.getName();
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        student4.setStudentId(" - hi! (, Class of 0) - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", "hi! -  (hi! -  (hi!, Class of 0), Class of 0)", (int) (short) 1);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", " -  ( -  (, Class of 0), Class of 0)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", (int) (short) 100);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)" + "'", str5, " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.lang.String str7 = student4.getMajor();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setStudentId("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getName();
        student4.setName(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str9, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str10 = student9.getName();
        student9.setEnrollmentYear((int) 'a');
        java.lang.String str13 = student9.getMajor();
        java.lang.String str14 = student9.getName();
        java.lang.String str15 = student9.getStudentId();
        java.util.List<java.lang.String> strList16 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        student4.addCompletedCourse("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        business.Student student51 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student56 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList57 = student56.getCompletedCourses();
        student51.setCompletedCourses(strList57);
        student4.setCompletedCourses(strList57);
        java.lang.String str60 = student4.toString();
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
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str60, "hi! -  ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        student4.setEnrollmentYear((int) ' ');
        java.lang.String str36 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str36, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", " - hi! (hi!, Class of 52)", (int) (byte) 0);
        student4.setStudentId(" - hi! (, Class of 35)");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " - hi! (, Class of 100)", "hi!", 10);
        java.lang.String str5 = student4.getName();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (, Class of 100)" + "'", str7, " - hi! (, Class of 100)");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)", " - hi! -  (hi!, Class of 0) (, Class of 100)", " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)", (int) 'a');
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        java.util.List<java.lang.String> strList30 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (, Class of 100)" + "'", str25, "hi! -  (, Class of 100)");
        org.junit.Assert.assertNull(strList30);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        java.lang.String str42 = student4.getStudentId();
        java.lang.String str43 = student4.getMajor();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str42, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        business.Student student10 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str11 = student10.getName();
        java.util.List<java.lang.String> strList12 = student10.getCompletedCourses();
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        student10.setCompletedCourses(strList18);
        student10.setStudentId("");
        business.Student student26 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList27 = student26.getCompletedCourses();
        student10.setCompletedCourses(strList27);
        student4.setCompletedCourses(strList27);
        java.lang.Class<?> wildcardClass30 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        business.Student student4 = new business.Student("", "hi! -  -  (, Class of 100) (hi!, Class of 35)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)", (int) (short) 0);
        student4.setEnrollmentYear(0);
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 0)" + "'", str6, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (, Class of 0)" + "'", str7, " - hi! (, Class of 0)");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)", " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)", " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", (int) (short) 10);
        student4.setEnrollmentYear((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " -  (, Class of 10) - hi! -  (hi!, Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", (int) (short) 0);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " -  - hi! (, Class of 0) (, Class of 100)", "", 0);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str10 = student9.getName();
        java.util.List<java.lang.String> strList11 = student9.getCompletedCourses();
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student9.setCompletedCourses(strList17);
        student9.setName(" - hi! (, Class of 0)");
        student9.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str23 = student9.getStudentId();
        java.util.List<java.lang.String> strList24 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        java.lang.String str26 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str23, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str26, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getName();
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        student4.setEnrollmentYear(52);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getMajor();
        business.Student student11 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str12 = student11.getName();
        student11.setEnrollmentYear((int) (short) 100);
        student11.setMajor(" -  (, Class of 10)");
        student11.setEnrollmentYear(100);
        java.util.List<java.lang.String> strList19 = student11.getCompletedCourses();
        business.Student student24 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student29 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList30 = student29.getCompletedCourses();
        student24.setCompletedCourses(strList30);
        student11.setCompletedCourses(strList30);
        student4.setCompletedCourses(strList30);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)", " -  ( -  (, Class of 0), Class of 0)", 32);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.addCompletedCourse("hi! -  (, Class of 100)");
        java.lang.String str14 = student4.getStudentId();
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)", "hi! -  (, Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (-1));
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str5, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        int int7 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        student4.setName(" - hi! (hi!, Class of 10)");
        int int8 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.getStudentId();
        student4.setStudentId(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.util.List<java.lang.String> strList19 = student4.getCompletedCourses();
        java.lang.String str20 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.String str13 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str13, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", " -  - hi! (, Class of -1) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)", (int) (short) 10);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        java.lang.String str13 = student4.getName();
        business.Student student18 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList19 = student18.getCompletedCourses();
        student18.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student18.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList29 = student28.getCompletedCourses();
        student28.setName("hi!");
        business.Student student36 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str37 = student36.getName();
        java.util.List<java.lang.String> strList38 = student36.getCompletedCourses();
        business.Student student43 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList44 = student43.getCompletedCourses();
        student36.setCompletedCourses(strList44);
        student28.setCompletedCourses(strList44);
        student18.setCompletedCourses(strList44);
        student4.setCompletedCourses(strList44);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId("hi! - hi! ( - hi! (, Class of -1), Class of 35)");
        int int11 = student4.getEnrollmentYear();
        student4.setMajor(" - hi! (, Class of 100) - hi! (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        student4.setName(" -  ( -  (, Class of 0), Class of 0)");
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        student4.setName("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " -  (, Class of 10)", 10);
        student4.setMajor("hi!");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student11.setName("hi!");
        student11.addCompletedCourse("");
        int int17 = student11.getEnrollmentYear();
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        student22.setEnrollmentYear(0);
        business.Student student29 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int30 = student29.getEnrollmentYear();
        student29.setMajor("hi!");
        business.Student student37 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str38 = student37.getName();
        student37.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList41 = student37.getCompletedCourses();
        java.lang.String str42 = student37.getName();
        business.Student student47 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student47.setStudentId("hi! -  (hi!, Class of 0)");
        int int50 = student47.getEnrollmentYear();
        java.util.List<java.lang.String> strList51 = student47.getCompletedCourses();
        student37.setCompletedCourses(strList51);
        student29.setCompletedCourses(strList51);
        student22.setCompletedCourses(strList51);
        student11.setCompletedCourses(strList51);
        student4.setCompletedCourses(strList51);
        student4.setEnrollmentYear((int) (short) 1);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setEnrollmentYear((int) 'a');
        int int8 = student4.getEnrollmentYear();
        student4.setName("hi! -  (hi! -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        int int10 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str13 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        student4.setName(" - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (, Class of 0)");
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setEnrollmentYear((int) '4');
        student4.setMajor("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        business.Student student19 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", 10);
        java.lang.String str20 = student19.getMajor();
        business.Student student25 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList26 = student25.getCompletedCourses();
        student19.setCompletedCourses(strList26);
        student4.setCompletedCourses(strList26);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str20, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 0)" + "'", str13, " -  (, Class of 0)");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        business.Student student4 = new business.Student("", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", 10);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)");
        business.Student student61 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList62 = student61.getCompletedCourses();
        student61.setStudentId("");
        business.Student student69 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str70 = student69.getName();
        java.util.List<java.lang.String> strList71 = student69.getCompletedCourses();
        student61.setCompletedCourses(strList71);
        java.lang.String str73 = student61.toString();
        student61.setStudentId("hi! -  (hi!, Class of 0)");
        student61.setMajor("");
        java.util.List<java.lang.String> strList78 = student61.getCompletedCourses();
        student4.setCompletedCourses(strList78);
        java.lang.String str80 = student4.toString();
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
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + " -  (, Class of 0)" + "'", str73, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100) -  (, Class of 0)" + "'", str80, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100) -  (, Class of 0)");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        student4.setStudentId("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        business.Student student4 = new business.Student("", " - hi! -  (hi!, Class of 97) (, Class of 10)", " -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", (int) (byte) 1);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setStudentId("hi!");
        student4.setMajor(" - hi! (, Class of 0)");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        student4.setMajor("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        student4.setMajor(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
        java.lang.String str33 = student4.getMajor();
        java.lang.Class<?> wildcardClass34 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)" + "'", str33, " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        student4.setStudentId(" -  (, Class of 10)");
        int int24 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getMajor();
        student4.setStudentId("");
        business.Student student17 = new business.Student("hi!", "hi!", "hi! -  -  (, Class of 10) (, Class of 0)", 0);
        student17.setEnrollmentYear((int) ' ');
        java.lang.String str20 = student17.getName();
        business.Student student25 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str26 = student25.getName();
        student25.setEnrollmentYear((int) (short) 100);
        student25.setMajor(" -  (, Class of 10)");
        java.lang.String str31 = student25.getName();
        student25.setStudentId(" - hi! (hi!, Class of 52)");
        java.lang.String str34 = student25.getName();
        business.Student student39 = new business.Student("hi!", "", "hi!", 0);
        student39.setName(" -  (, Class of 10)");
        student39.setMajor("");
        java.lang.String[] strArray47 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        student39.setCompletedCourses((java.util.List<java.lang.String>) strList48);
        java.lang.String str51 = student39.getMajor();
        student39.setName(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList54 = student39.getCompletedCourses();
        student25.setCompletedCourses(strList54);
        student17.setCompletedCourses(strList54);
        student4.setCompletedCourses(strList54);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        business.Student student10 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student10.setStudentId("hi! -  (hi!, Class of 0)");
        int int13 = student10.getEnrollmentYear();
        java.lang.String str14 = student10.getMajor();
        java.lang.String str15 = student10.getMajor();
        java.util.List<java.lang.String> strList16 = student10.getCompletedCourses();
        java.lang.String str17 = student10.getName();
        java.util.List<java.lang.String> strList18 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        student4.setName(" -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)");
        student4.setEnrollmentYear((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 10)" + "'", str17, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.lang.String str7 = student4.getMajor();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setName("hi! -  ( -  (, Class of 0), Class of 0)");
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse(" -  (, Class of 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 10)" + "'", str12, " -  (, Class of 10)");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.toString();
        student4.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str12, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str13, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.setStudentId(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getName();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        student4.setName(" -  (hi!, Class of 100)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        java.lang.String str13 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)" + "'", str6, " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (hi!, Class of 100)" + "'", str13, " -  (hi!, Class of 100)");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        student4.setStudentId(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        java.lang.String str11 = student4.getName();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        student4.setName(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        student4.setName(" -  (hi!, Class of 100)");
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
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        int int11 = student4.getEnrollmentYear();
        java.lang.String str12 = student4.toString();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        business.Student student18 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList19 = student18.getCompletedCourses();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList23);
        int int26 = student18.getEnrollmentYear();
        java.lang.String str27 = student18.getMajor();
        int int28 = student18.getEnrollmentYear();
        student18.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        student18.setMajor("hi! -  (hi!, Class of 0)");
        student18.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str35 = student18.toString();
        student18.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student18.setEnrollmentYear(10);
        java.util.List<java.lang.String> strList40 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList40);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str35, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        student4.setEnrollmentYear(32);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        student4.setMajor(" -  (, Class of 0) -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getMajor();
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        business.Student student4 = new business.Student(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)", (int) (short) 1);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student9.setName("hi!");
        student9.addCompletedCourse("");
        java.lang.String str15 = student9.toString();
        java.lang.String str16 = student9.getStudentId();
        java.lang.String str17 = student9.getMajor();
        business.Student student22 = new business.Student("hi!", "", "hi!", 0);
        student22.setName(" -  (, Class of 10)");
        student22.setMajor("");
        student22.setMajor("hi! -  (hi!, Class of 0)");
        student22.setName("");
        student22.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str33 = student22.toString();
        java.util.List<java.lang.String> strList34 = student22.getCompletedCourses();
        student9.setCompletedCourses(strList34);
        student4.setCompletedCourses(strList34);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! (, Class of 0)" + "'", str15, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str33, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        java.lang.String str8 = student4.getName();
        student4.setMajor("hi! -  - hi! (, Class of 0) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getStudentId();
        student4.setMajor("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.lang.String str7 = student4.getMajor();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.getName();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = null;
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) ' ');
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.setName("hi! -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        int int24 = student4.getEnrollmentYear();
        student4.setName(" - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        business.Student student10 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList11 = student10.getCompletedCourses();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        student10.setCompletedCourses((java.util.List<java.lang.String>) strList15);
        int int18 = student10.getEnrollmentYear();
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        student23.setName("hi!");
        student23.addCompletedCourse("");
        java.util.List<java.lang.String> strList29 = student23.getCompletedCourses();
        java.lang.String str30 = student23.getStudentId();
        java.lang.String str31 = student23.toString();
        business.Student student36 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList37 = student36.getCompletedCourses();
        student23.setCompletedCourses(strList37);
        business.Student student43 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList44 = student43.getCompletedCourses();
        student23.setCompletedCourses(strList44);
        student10.setCompletedCourses(strList44);
        student4.setCompletedCourses(strList44);
        java.lang.String str48 = student4.getName();
        java.lang.String str49 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " - hi! (, Class of 0)" + "'", str31, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        business.Student student4 = new business.Student(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)", " -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)", "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", (int) (byte) 10);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getStudentId();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        student11.setCompletedCourses((java.util.List<java.lang.String>) strList16);
        java.lang.String str19 = student11.getName();
        student11.setStudentId(" -  (, Class of 0)");
        student11.setMajor(" -  (, Class of 10)");
        student11.setMajor(" - hi! (, Class of 0)");
        java.lang.String str26 = student11.getMajor();
        student11.setName("hi!");
        java.lang.String str29 = student11.toString();
        student11.setStudentId("");
        java.util.List<java.lang.String> strList32 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 0)" + "'", str6, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " - hi! (, Class of 0)" + "'", str26, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str29, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        business.Student student25 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str26 = student25.getMajor();
        student25.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str29 = student25.getStudentId();
        business.Student student34 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str35 = student34.getMajor();
        java.util.List<java.lang.String> strList36 = student34.getCompletedCourses();
        java.lang.String str37 = student34.getMajor();
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str43 = student42.getName();
        java.util.List<java.lang.String> strList44 = student42.getCompletedCourses();
        business.Student student49 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList50 = student49.getCompletedCourses();
        student42.setCompletedCourses(strList50);
        student42.setName(" - hi! (, Class of 0)");
        java.lang.String str54 = student42.getName();
        java.lang.String str55 = student42.toString();
        int int56 = student42.getEnrollmentYear();
        java.util.List<java.lang.String> strList57 = student42.getCompletedCourses();
        student34.setCompletedCourses(strList57);
        student25.setCompletedCourses(strList57);
        student4.setCompletedCourses(strList57);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 100)" + "'", str26, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str29, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + " - hi! (, Class of 0)" + "'", str54, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str55, " -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(strList57);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (hi!, Class of 100)", " - hi! (, Class of 0)", 52);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi!, Class of 100)" + "'", str5, " -  (hi!, Class of 100)");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        java.lang.String str33 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str36 = student4.toString();
        student4.setStudentId("");
        int int39 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 0)" + "'", str33, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str36, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        student21.setName("hi!");
        java.lang.String str25 = student21.getName();
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        student30.setName("hi!");
        business.Student student38 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str39 = student38.getName();
        java.util.List<java.lang.String> strList40 = student38.getCompletedCourses();
        business.Student student45 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList46 = student45.getCompletedCourses();
        student38.setCompletedCourses(strList46);
        student30.setCompletedCourses(strList46);
        student21.setCompletedCourses(strList46);
        student4.setCompletedCourses(strList46);
        java.lang.String str51 = student4.getStudentId();
        student4.setName("hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.getStudentId();
        java.lang.String str17 = student4.toString();
        student4.setMajor(" -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (, Class of 100)", 1);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        student9.addCompletedCourse("");
        student9.addCompletedCourse("");
        business.Student student18 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student23 = new business.Student("hi!", "", "hi!", 0);
        student23.setName(" -  (, Class of 10)");
        student23.setMajor("");
        java.lang.String[] strArray31 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        student23.setCompletedCourses((java.util.List<java.lang.String>) strList32);
        student18.setCompletedCourses((java.util.List<java.lang.String>) strList32);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList32);
        java.lang.String str37 = student9.getStudentId();
        student9.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.util.List<java.lang.String> strList40 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList40);
        java.util.List<java.lang.String> strList42 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setMajor(" - hi! (, Class of -1)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        business.Student student4 = new business.Student(" -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", (int) (byte) 100);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 0)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        student4.addCompletedCourse(" - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        int int28 = student4.getEnrollmentYear();
        java.lang.String str29 = student4.toString();
        java.lang.Class<?> wildcardClass30 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 10)" + "'", str25, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str29, "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)");
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
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        student4.addCompletedCourse(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        student4.setEnrollmentYear(10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", 97);
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1) - hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32), Class of 97)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 1) - hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32), Class of 97)");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", " -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)", (int) ' ');
        student4.setMajor(" - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        student4.setName("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.addCompletedCourse(" -  (, Class of 100)");
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.setName(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        business.Student student4 = new business.Student(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)", 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getMajor();
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str11 = student4.getMajor();
        student4.setName("hi!");
        business.Student student18 = new business.Student("", "hi!", "", 100);
        java.lang.String str19 = student18.getMajor();
        java.lang.String str20 = student18.getStudentId();
        student18.setStudentId("hi! -  (hi!, Class of 0)");
        student18.setMajor("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        business.Student student29 = new business.Student("", "hi!", "", 100);
        java.lang.String str30 = student29.getMajor();
        java.lang.String str31 = student29.toString();
        int int32 = student29.getEnrollmentYear();
        student29.setStudentId(" -  - hi! (, Class of 0) (, Class of 100)");
        java.util.List<java.lang.String> strList35 = student29.getCompletedCourses();
        student18.setCompletedCourses(strList35);
        student4.setCompletedCourses(strList35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str11, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " - hi! (, Class of 100)" + "'", str31, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        java.lang.String str24 = student4.getName();
        int int25 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str21, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        int int8 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        student4.setName(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str17 = student16.getName();
        student16.setEnrollmentYear(10);
        student16.setEnrollmentYear((int) (byte) 0);
        student16.setEnrollmentYear((int) (byte) 100);
        java.lang.String str24 = student16.getName();
        business.Student student29 = new business.Student("hi!", "", "hi!", 0);
        student29.setName(" -  (, Class of 10)");
        student29.setMajor("");
        java.lang.String str34 = student29.getMajor();
        java.lang.String str35 = student29.getName();
        java.util.List<java.lang.String> strList36 = student29.getCompletedCourses();
        student16.setCompletedCourses(strList36);
        student4.setCompletedCourses(strList36);
        java.util.List<java.lang.String> strList39 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList40 = student4.getCompletedCourses();
        int int41 = student4.getEnrollmentYear();
        java.lang.String str42 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " -  (, Class of 10)" + "'", str35, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)" + "'", str8, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  -  ( -  (, Class of 0), Class of 0) (hi!, Class of 0)" + "'", str11, "hi! -  -  ( -  (, Class of 0), Class of 0) (hi!, Class of 0)");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str13 = student4.getName();
        java.lang.String str14 = student4.getMajor();
        student4.setName(" -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 10)" + "'", str13, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 100)" + "'", str14, " - hi! (, Class of 100)");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) -1);
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.lang.String str9 = student4.getStudentId();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", "hi! -  (hi!, Class of 0)", " - hi! (, Class of 100)", 0);
        student4.setStudentId(" - hi! (, Class of 100)");
        student4.setEnrollmentYear((int) (byte) 100);
        int int9 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) -1);
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        student16.setCompletedCourses((java.util.List<java.lang.String>) strList21);
        int int24 = student16.getEnrollmentYear();
        business.Student student29 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList30 = student29.getCompletedCourses();
        student29.setName("hi!");
        student29.addCompletedCourse("");
        java.util.List<java.lang.String> strList35 = student29.getCompletedCourses();
        java.lang.String str36 = student29.getStudentId();
        java.lang.String str37 = student29.toString();
        business.Student student42 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList43 = student42.getCompletedCourses();
        student29.setCompletedCourses(strList43);
        business.Student student49 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList50 = student49.getCompletedCourses();
        student29.setCompletedCourses(strList50);
        student16.setCompletedCourses(strList50);
        int int53 = student16.getEnrollmentYear();
        student16.addCompletedCourse("");
        student16.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        int int58 = student16.getEnrollmentYear();
        java.lang.String str59 = student16.getName();
        java.util.List<java.lang.String> strList60 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " - hi! (, Class of 0)" + "'", str37, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str59, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str8, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList6 = null;
        student4.setCompletedCourses(strList6);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (, Class of 100)", "", " - hi! (hi!, Class of 52)", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList16);
        java.lang.String str19 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "hi! -  (, Class of 100)", "", " - hi! (hi!, Class of 52)", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", (int) (byte) 100);
        java.lang.String str5 = student4.getName();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)" + "'", str5, " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setEnrollmentYear((int) (byte) 10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        java.lang.String str17 = student4.getMajor();
        student4.setMajor(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.lang.String str20 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)" + "'", str20, " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)", (-1));
        student4.setStudentId(" - hi! (, Class of 0) -  -  (, Class of 10) (, Class of 100)");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        int int10 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        java.lang.String str20 = student4.getStudentId();
        java.lang.String str21 = student4.getName();
        business.Student student26 = new business.Student("", "", "", (int) (short) 0);
        student26.addCompletedCourse("");
        java.lang.String str29 = student26.toString();
        java.lang.String str30 = student26.getName();
        java.lang.String str31 = student26.getMajor();
        int int32 = student26.getEnrollmentYear();
        business.Student student37 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student42 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList43 = student42.getCompletedCourses();
        student37.setCompletedCourses(strList43);
        student37.setEnrollmentYear((int) (byte) 1);
        business.Student student51 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student56 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList57 = student56.getCompletedCourses();
        student51.setCompletedCourses(strList57);
        student37.setCompletedCourses(strList57);
        student26.setCompletedCourses(strList57);
        student4.setCompletedCourses(strList57);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str21, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 0)" + "'", str29, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList57);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "hi! - hi! (hi!, Class of 35)", " - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)", (-1));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String str14 = student9.getMajor();
        java.lang.String str15 = student9.getName();
        java.util.List<java.lang.String> strList16 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        java.lang.String str18 = student4.getMajor();
        business.Student student23 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str24 = student23.getMajor();
        java.lang.String str25 = student23.getStudentId();
        student23.setName("hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        business.Student student32 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student32.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList35 = student32.getCompletedCourses();
        java.util.List<java.lang.String> strList36 = student32.getCompletedCourses();
        java.lang.String str37 = student32.toString();
        student32.setEnrollmentYear((int) (short) -1);
        student32.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str42 = student32.getMajor();
        business.Student student47 = new business.Student("hi!", "", "hi!", 0);
        student47.setName(" -  (, Class of 10)");
        student47.setMajor("");
        student47.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str54 = student47.getMajor();
        java.lang.String str55 = student47.getMajor();
        student47.setName("hi!");
        java.lang.String str58 = student47.getName();
        int int59 = student47.getEnrollmentYear();
        student47.setName("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList62 = student47.getCompletedCourses();
        student32.setCompletedCourses(strList62);
        student23.setCompletedCourses(strList62);
        student4.setCompletedCourses(strList62);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 0)" + "'", str24, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str25, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str37, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " -  (, Class of 10)" + "'", str42, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str54, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str55, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(strList62);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList13 = student12.getCompletedCourses();
        student12.setName("hi!");
        student12.addCompletedCourse("");
        java.lang.String str18 = student12.toString();
        java.lang.String str19 = student12.getStudentId();
        java.lang.String str20 = student12.getMajor();
        java.util.List<java.lang.String> strList21 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList21);
        java.lang.String str23 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! (, Class of 0)" + "'", str18, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str21, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.setStudentId(" -  (hi!, Class of 100)");
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getStudentId();
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (hi!, Class of 100)" + "'", str13, " -  (hi!, Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi!, Class of 100)" + "'", str14, " -  (hi!, Class of 100)");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 0)", (int) '4');
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)");
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", "hi! - hi! -  (, Class of 0) (hi!, Class of 35)", 0);
        student4.setName(" - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", (int) 'a');
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str9, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 100)" + "'", str10, " -  (, Class of 100)");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  (, Class of 0)");
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getStudentId();
        student4.addCompletedCourse("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 0)" + "'", str13, " -  (, Class of 0)");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = student4.getName();
        student4.setStudentId("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setEnrollmentYear((int) (byte) 100);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str15 = student4.toString();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) ' ');
        java.lang.String str21 = student4.getName();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str15, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str21, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        business.Student student4 = new business.Student("hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)", "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", 35);
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        int int30 = student4.getEnrollmentYear();
        java.lang.String str31 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (, Class of 0)" + "'", str31, " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (, Class of 0)");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 0)" + "'", str9, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 0)" + "'", str11, " - hi! (, Class of 0)");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        int int22 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 0)" + "'", str21, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getStudentId();
        student4.setMajor("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        int int30 = student4.getEnrollmentYear();
        student4.setStudentId(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)", "hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)", (int) (byte) 10);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        java.util.List<java.lang.String> strList29 = student4.getCompletedCourses();
        int int30 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        student4.setName("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)" + "'", str6, " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.String str44 = student4.toString();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " -  (, Class of 0)" + "'", str44, " -  (, Class of 0)");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.getName();
        student4.setEnrollmentYear((int) (short) 10);
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 0)" + "'", str9, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
        student4.setStudentId("hi! -  (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        java.util.List<java.lang.String> strList37 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (short) 10);
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
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        business.Student student27 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str28 = student27.getName();
        student27.setEnrollmentYear((int) 'a');
        java.util.List<java.lang.String> strList31 = student27.getCompletedCourses();
        student4.setCompletedCourses(strList31);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str19, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str8 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        java.lang.String str11 = student4.toString();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str11, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        business.Student student4 = new business.Student("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", "hi! -  (hi!, Class of 0)", 52);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        business.Student student17 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student22 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList23 = student22.getCompletedCourses();
        student17.setCompletedCourses(strList23);
        student4.setCompletedCourses(strList23);
        int int26 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)");
        java.util.List<java.lang.String> strList29 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", "hi! - hi! -  (, Class of 0) (hi!, Class of 35)", "hi! - hi! (hi!, Class of 35)", (int) (byte) 100);
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  (, Class of 0) (hi!, Class of 35)" + "'", str5, "hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        student35.setStudentId("");
        student35.setEnrollmentYear((int) (byte) 10);
        student35.setEnrollmentYear((int) (short) 1);
        student35.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        java.util.List<java.lang.String> strList45 = student35.getCompletedCourses();
        student4.setCompletedCourses(strList45);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 10)" + "'", str26, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 1)", "hi! - hi! ( -  (, Class of 10), Class of 100)", " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)", 52);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", 35);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor("hi! -  (hi!, Class of 100)");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        student4.addCompletedCourse("hi!");
        int int16 = student4.getEnrollmentYear();
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        student4.setStudentId("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        java.lang.String str15 = student4.getStudentId();
        java.lang.String str16 = student4.toString();
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)" + "'", str15, "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) (hi!, Class of 0)" + "'", str16, "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)", " - hi! (, Class of 0) - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)", (int) (byte) -1);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        business.Student student4 = new business.Student(" -  (, Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)", "hi! -  (hi!, Class of 1)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)", (int) (byte) 10);
        student4.setStudentId(" -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student11.setStudentId("");
        business.Student student19 = new business.Student("hi!", "", "hi!", 0);
        student19.setName(" -  (, Class of 10)");
        student19.setMajor("");
        student19.setName(" - hi! (, Class of 100)");
        java.lang.String[] strArray33 = new java.lang.String[] { " - hi! (, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", " -  (, Class of 10)" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        student19.setCompletedCourses((java.util.List<java.lang.String>) strList34);
        student11.setCompletedCourses((java.util.List<java.lang.String>) strList34);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList34);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { " - hi! (, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", " -  (, Class of 10)" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        business.Student student4 = new business.Student(" - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)", " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)", "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)", (int) (byte) 1);
        student4.setEnrollmentYear(97);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        java.lang.String str15 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) (byte) 0);
        java.lang.String str14 = student4.getMajor();
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        business.Student student14 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str15 = student14.getName();
        java.lang.String str16 = student14.getName();
        java.lang.String str17 = student14.getStudentId();
        java.util.List<java.lang.String> strList18 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        int int20 = student4.getEnrollmentYear();
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 0)" + "'", str21, " - hi! (, Class of 0)");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        java.lang.String str18 = student4.getMajor();
        int int19 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        java.lang.Class<?> wildcardClass24 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        java.util.List<java.lang.String> strList23 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str8, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)" + "'", str18, "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        java.lang.String str20 = student4.getName();
        int int21 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 0)" + "'", str20, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str10 = student4.getName();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        java.util.List<java.lang.String> strList18 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        student4.setStudentId("");
        business.Student student31 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) (byte) 0);
        int int32 = student31.getEnrollmentYear();
        java.util.List<java.lang.String> strList33 = student31.getCompletedCourses();
        student4.setCompletedCourses(strList33);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getStudentId();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", " - hi! (, Class of 0)", "", (int) '4');
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        business.Student student11 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        student4.setName("hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", " - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (byte) -1);
        int int5 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse("hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  - hi! (, Class of 0) (, Class of 100)" + "'", str9, " -  - hi! (, Class of 0) (, Class of 100)");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) 100);
        int int12 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        java.lang.Class<?> wildcardClass15 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        business.Student student4 = new business.Student(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)", " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)", 10);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.toString();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        java.lang.Class<?> wildcardClass16 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str13, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.addCompletedCourse(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.lang.String str15 = student4.getName();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str12, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.getStudentId();
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)");
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str15, " -  ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", " -  (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", (int) (byte) 100);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        int int6 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        java.lang.String str11 = student4.toString();
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)" + "'", str11, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str15 = student4.getMajor();
        java.lang.String str16 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str15, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", " - hi! (hi!, Class of 52)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", 1);
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        java.lang.String str7 = student4.toString();
        java.util.List<java.lang.String> strList8 = null;
        student4.setCompletedCourses(strList8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)" + "'", str7, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        java.lang.String str18 = student4.getStudentId();
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        student19.setName("hi!");
        business.Student student27 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str28 = student27.getName();
        java.util.List<java.lang.String> strList29 = student27.getCompletedCourses();
        business.Student student34 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList35 = student34.getCompletedCourses();
        student27.setCompletedCourses(strList35);
        student19.setCompletedCourses(strList35);
        student4.setCompletedCourses(strList35);
        java.util.List<java.lang.String> strList39 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.setName(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str12 = student4.getStudentId();
        student4.setStudentId("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        student4.setEnrollmentYear(35);
        student4.setStudentId(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)", " - hi! -  (hi!, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)", 1);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        java.lang.String str23 = student4.getMajor();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setStudentId(" - hi! (, Class of 0) - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
        java.lang.String str15 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)" + "'", str15, "hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", (int) (byte) 100);
        java.lang.String str5 = student4.getName();
        int int6 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)" + "'", str5, " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)", "hi!", (int) (short) 0);
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (, Class of 1) (, Class of 1)");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  (, Class of 10)", "", (int) (short) 10);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        student9.setEnrollmentYear(0);
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
        student9.setCompletedCourses(strList38);
        student4.setCompletedCourses(strList38);
        business.Student student47 = new business.Student("hi!", "", "hi!", 0);
        student47.setName(" -  (, Class of 10)");
        student47.setEnrollmentYear((int) '#');
        java.lang.String str52 = student47.getMajor();
        java.util.List<java.lang.String> strList53 = student47.getCompletedCourses();
        student4.setCompletedCourses(strList53);
        int int55 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str8 = student4.getName();
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.addCompletedCourse(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) (, Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str8, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str16, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        business.Student student4 = new business.Student(" -  (hi!, Class of 100)", "hi!", "hi! -  -  (, Class of 10) (, Class of 1)", (int) '4');
        student4.addCompletedCourse(" - hi! (, Class of 100) - hi! - hi! (hi!, Class of 100) (hi!, Class of 35)");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
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
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.toString();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str10, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        business.Student student4 = new business.Student(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)", " - hi! (, Class of 0) -  -  (, Class of 10) (, Class of 100)", " -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)", 32);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getMajor();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setStudentId(" - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)");
        student4.setEnrollmentYear((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  (hi!, Class of 0)", 35);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str16 = student4.getMajor();
        java.lang.String str17 = student4.getName();
        int int18 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str17, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setName(" -  (, Class of 0)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        java.lang.String str23 = student4.getName();
        int int24 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", "", "", 100);
        student4.setMajor(" -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setEnrollmentYear((int) (short) 1);
        student4.addCompletedCourse("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)");
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0) - hi! ( -  (hi!, Class of 100), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        int int9 = student4.getEnrollmentYear();
        student4.setName(" - hi! (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        java.lang.String str20 = student4.toString();
        java.lang.String str21 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)" + "'", str20, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)" + "'", str21, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setStudentId("");
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student21 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student26 = new business.Student("hi!", "", "hi!", 0);
        student26.setName(" -  (, Class of 10)");
        student26.setMajor("");
        java.lang.String[] strArray34 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        student26.setCompletedCourses((java.util.List<java.lang.String>) strList35);
        student21.setCompletedCourses((java.util.List<java.lang.String>) strList35);
        student21.addCompletedCourse("");
        int int41 = student21.getEnrollmentYear();
        int int42 = student21.getEnrollmentYear();
        java.util.List<java.lang.String> strList43 = student21.getCompletedCourses();
        student4.setCompletedCourses(strList43);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList19 = student4.getCompletedCourses();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
        java.lang.String str22 = student4.getName();
        student4.setName(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " - hi! (, Class of 0)" + "'", str22, " - hi! (, Class of 0)");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        business.Student student35 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", (int) (byte) 0);
        business.Student student40 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str41 = student40.getStudentId();
        student40.setMajor("");
        student40.setStudentId(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList46 = student40.getCompletedCourses();
        student35.setCompletedCourses(strList46);
        student4.setCompletedCourses(strList46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        java.lang.String str33 = student4.getStudentId();
        java.lang.Class<?> wildcardClass34 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.toString();
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)" + "'", str8, "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        int int11 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.getName();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 0)" + "'", str10, " -  (, Class of 0)");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setEnrollmentYear(52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        student4.setMajor(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.Class<?> wildcardClass16 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 0)", (int) '4');
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)");
        business.Student student11 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", (-1));
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 97)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", (int) 'a');
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 97) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100) (hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0), Class of 97)" + "'", str5, "hi! -  (hi!, Class of 97) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100) (hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0), Class of 97)");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        student4.addCompletedCourse("hi!");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        java.lang.String str18 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 10)" + "'", str18, " -  (, Class of 10)");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        business.Student student4 = new business.Student("hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)", "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", 35);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        business.Student student4 = new business.Student(" -  (, Class of 0)", "hi! -  (hi!, Class of 0)", " - hi! (, Class of 100)", (int) (byte) 100);
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear(100);
        student4.setStudentId("hi! -  (hi!, Class of 97) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100) (hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0), Class of 97)");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        business.Student student4 = new business.Student("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)", " -  - hi! (, Class of -1) (, Class of 0)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)", (int) '#');
        java.lang.String str5 = student4.toString();
        student4.setMajor(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)" + "'", str5, "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        int int9 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        java.lang.String str18 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 100)" + "'", str14, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)" + "'", str18, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)", (int) (byte) 1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.setEnrollmentYear((int) (short) 100);
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.String str13 = student4.getStudentId();
        java.lang.String str14 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)" + "'", str14, " - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str12, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setName("");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.addCompletedCourse("");
        java.lang.String str14 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str14, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)", " -  (hi! -  (hi!, Class of 0), Class of 0)", "", (int) (byte) -1);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", (-1));
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        business.Student student4 = new business.Student(" -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)", "hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)", " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", (int) (short) 0);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        student4.setMajor("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        student4.setStudentId("hi! -  - hi! (, Class of 0) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str8, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)" + "'", str18, "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        business.Student student4 = new business.Student(" -  (hi!, Class of 10)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", "hi! -  (, Class of 0)", (int) (byte) 1);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (, Class of 0)" + "'", str5, "hi! -  (, Class of 0)");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        student4.addCompletedCourse("");
        java.lang.Class<?> wildcardClass40 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getName();
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        student17.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str21 = student17.getName();
        business.Student student26 = new business.Student("hi!", "", "hi!", 0);
        student26.setName(" -  (, Class of 10)");
        student26.setMajor("");
        java.lang.String str31 = student26.getMajor();
        java.lang.String str32 = student26.getStudentId();
        java.lang.String str33 = student26.getName();
        java.util.List<java.lang.String> strList34 = student26.getCompletedCourses();
        student26.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str37 = student26.getStudentId();
        java.lang.String str38 = student26.getMajor();
        business.Student student43 = new business.Student("hi!", "", "hi!", 0);
        student43.setName(" -  (, Class of 10)");
        student43.setMajor("");
        student43.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str50 = student43.getMajor();
        java.lang.String str51 = student43.getMajor();
        student43.setName("hi!");
        java.lang.String str54 = student43.getName();
        business.Student student59 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList60 = student59.getCompletedCourses();
        student43.setCompletedCourses(strList60);
        student26.setCompletedCourses(strList60);
        student17.setCompletedCourses(strList60);
        student4.setCompletedCourses(strList60);
        int int65 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str21, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 10)" + "'", str33, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str38, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str50, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str51, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        student4.setMajor("hi!");
        int int23 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        student4.setName("hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)");
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str21, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        business.Student student10 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student10.setStudentId("hi! -  (hi!, Class of 0)");
        int int13 = student10.getEnrollmentYear();
        java.lang.String str14 = student10.getMajor();
        java.lang.String str15 = student10.getMajor();
        java.util.List<java.lang.String> strList16 = student10.getCompletedCourses();
        java.lang.String str17 = student10.getName();
        java.util.List<java.lang.String> strList18 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        java.util.List<java.lang.String> strList20 = student4.getCompletedCourses();
        java.lang.String str21 = student4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 10)" + "'", str17, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str21, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)", "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.lang.String str10 = student4.getMajor();
        student4.setEnrollmentYear((int) ' ');
        student4.setEnrollmentYear(52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) - hi! (hi!, Class of 100)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)", "hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)", 35);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int21 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        java.lang.String str18 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 100)" + "'", str14, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str18, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setMajor("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        business.Student student12 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList13 = null;
        student12.setCompletedCourses(strList13);
        java.util.List<java.lang.String> strList15 = student12.getCompletedCourses();
        java.lang.String str16 = student12.getStudentId();
        student12.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student12.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        business.Student student25 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int26 = student25.getEnrollmentYear();
        java.lang.String str27 = student25.toString();
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        student32.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList35 = student32.getCompletedCourses();
        student25.setCompletedCourses(strList35);
        student12.setCompletedCourses(strList35);
        student4.setCompletedCourses(strList35);
        student4.setMajor("hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)" + "'", str27, " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 0)" + "'", str12, "hi! -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        java.util.List<java.lang.String> strList28 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        student4.setName("hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        java.lang.String str33 = student4.getMajor();
        business.Student student38 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList39 = student38.getCompletedCourses();
        student38.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList42 = student38.getCompletedCourses();
        business.Student student47 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str48 = student47.getName();
        student47.setEnrollmentYear((int) (byte) 10);
        java.lang.String str51 = student47.toString();
        student47.setEnrollmentYear((int) (byte) 100);
        java.lang.String str54 = student47.toString();
        java.lang.String str55 = student47.getName();
        java.lang.String str56 = student47.getMajor();
        business.Student student61 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList62 = student61.getCompletedCourses();
        student61.setStudentId("");
        int int65 = student61.getEnrollmentYear();
        student61.setEnrollmentYear((int) (short) 1);
        student61.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student61.setEnrollmentYear((int) '#');
        business.Student student76 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList77 = student76.getCompletedCourses();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        student76.setCompletedCourses((java.util.List<java.lang.String>) strList81);
        student61.setCompletedCourses((java.util.List<java.lang.String>) strList81);
        student47.setCompletedCourses((java.util.List<java.lang.String>) strList81);
        student38.setCompletedCourses((java.util.List<java.lang.String>) strList81);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList81);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " -  (, Class of 10)" + "'", str51, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + " -  (, Class of 100)" + "'", str54, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        student4.setEnrollmentYear((int) '4');
        student4.setMajor(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
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
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "", "hi! - hi! (hi!, Class of 35)", (int) (byte) 10);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" -  ( -  (, Class of 0), Class of 0)");
        student4.setMajor(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1) (, Class of 100)");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str15 = student4.getStudentId();
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        student4.setEnrollmentYear(32);
        int int20 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.setName(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        java.lang.String str15 = student4.getMajor();
        int int16 = student4.getEnrollmentYear();
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        student4.setEnrollmentYear(0);
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        business.Student student17 = new business.Student("hi!", " -  ( -  (, Class of 0), Class of 0)", " - hi! (, Class of 0)", (int) '4');
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        student22.addCompletedCourse("");
        java.lang.String str25 = student22.toString();
        student22.setMajor(" -  (, Class of 0)");
        java.lang.String str28 = student22.getStudentId();
        java.lang.String str29 = student22.getMajor();
        java.util.List<java.lang.String> strList30 = student22.getCompletedCourses();
        business.Student student35 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList36 = null;
        student35.setCompletedCourses(strList36);
        java.lang.String str38 = student35.getMajor();
        business.Student student43 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str44 = student43.getName();
        student43.setEnrollmentYear(10);
        student43.setEnrollmentYear((int) (byte) 0);
        student43.setMajor(" - hi! (, Class of 0)");
        java.lang.String str51 = student43.getMajor();
        java.lang.String str52 = student43.getName();
        java.util.List<java.lang.String> strList53 = student43.getCompletedCourses();
        student35.setCompletedCourses(strList53);
        student22.setCompletedCourses(strList53);
        student17.setCompletedCourses(strList53);
        student4.setCompletedCourses(strList53);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 0)" + "'", str25, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 0)" + "'", str29, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " - hi! (, Class of 0)" + "'", str51, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strList53);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        java.lang.String str23 = student4.getName();
        java.lang.String str24 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 10)" + "'", str24, " -  (, Class of 10)");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        business.Student student4 = new business.Student(" -  (hi!, Class of 100)", "hi!", "hi! -  -  (, Class of 10) (, Class of 1)", (int) '4');
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        student4.setName(" - hi! (, Class of -1)");
        student4.setStudentId(" - hi! (, Class of -1)");
        java.lang.String str23 = student4.getMajor();
        java.lang.String str24 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 10)" + "'", str18, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " - hi! (, Class of -1)" + "'", str24, " - hi! (, Class of -1)");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setEnrollmentYear((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        business.Student student17 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student22 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList23 = student22.getCompletedCourses();
        student17.setCompletedCourses(strList23);
        student4.setCompletedCourses(strList23);
        int int26 = student4.getEnrollmentYear();
        business.Student student31 = new business.Student("hi!", "", "hi!", 0);
        student31.setName(" -  (, Class of 10)");
        student31.setMajor("");
        java.lang.String str36 = student31.getMajor();
        java.lang.String str37 = student31.getName();
        java.util.List<java.lang.String> strList38 = student31.getCompletedCourses();
        student31.setEnrollmentYear(1);
        student31.addCompletedCourse("hi!");
        java.lang.String str43 = student31.toString();
        student31.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str46 = student31.toString();
        java.lang.String str47 = student31.getName();
        java.util.List<java.lang.String> strList48 = student31.getCompletedCourses();
        student4.setCompletedCourses(strList48);
        student4.setStudentId(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " -  (, Class of 10)" + "'", str37, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str43, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)" + "'", str46, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + " -  (, Class of 10)" + "'", str47, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList13 = student12.getCompletedCourses();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        student12.setCompletedCourses((java.util.List<java.lang.String>) strList17);
        int int20 = student12.getEnrollmentYear();
        student12.setMajor(" -  (, Class of 0)");
        int int23 = student12.getEnrollmentYear();
        student12.setStudentId("hi!");
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
        student12.setCompletedCourses(strList51);
        student4.setCompletedCourses(strList51);
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " - hi! (, Class of 0)" + "'", str38, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", 0);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setEnrollmentYear(97);
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        business.Student student4 = new business.Student("", "hi! -  (hi!, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", (int) (byte) 0);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)", "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)", 52);
        java.lang.String str5 = student4.toString();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52), Class of 52)" + "'", str5, " -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52), Class of 52)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        business.Student student4 = new business.Student(" -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)", " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)", "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)", (int) (short) -1);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        student4.setEnrollmentYear((-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str22, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0) (, Class of 10)" + "'", str11, " -  -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0) (, Class of 10)");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str15 = student4.toString();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setStudentId("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse(" -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str15, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        business.Student student4 = new business.Student("hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)", " -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)", (int) (byte) 10);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 10);
        student4.setMajor(" - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1) - hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32), Class of 97)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (, Class of 10)");
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 100)" + "'", str10, " - hi! (, Class of 100)");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        java.lang.String str26 = student4.getMajor();
        student4.setMajor("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        java.lang.String str25 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str14, " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)" + "'", str25, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 100)" + "'", str14, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  ( -  (, Class of 0), Class of 0) -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)" + "'", str15, " -  ( -  (, Class of 0), Class of 0) -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        java.lang.String str20 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str19, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)", "hi! - hi! (hi!, Class of 100)", 0);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)" + "'", str5, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0)", (int) ' ');
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.toString();
        int int10 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! (hi!, Class of 100)" + "'", str9, "hi! - hi! (hi!, Class of 100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.lang.String str31 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str31, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        business.Student student4 = new business.Student(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)", "", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", (int) (short) 10);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str6, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getMajor();
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str11 = student4.getMajor();
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str11, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        student4.addCompletedCourse(" - hi! (hi!, Class of 52)");
        java.lang.Class<?> wildcardClass18 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 10)" + "'", str6, " -  (, Class of 10)");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 10);
        student4.setEnrollmentYear(52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        business.Student student13 = new business.Student("", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (short) 100);
        student13.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList16 = student13.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        java.lang.String str18 = student4.getMajor();
        student4.setEnrollmentYear((int) (byte) 1);
        business.Student student25 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str26 = student25.getStudentId();
        student25.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student25.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        java.util.List<java.lang.String> strList31 = student25.getCompletedCourses();
        student4.setCompletedCourses(strList31);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        business.Student student4 = new business.Student(" -  ( -  (, Class of 10), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)", " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi!, Class of 10)", 0);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        int int42 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str34 = student4.getName();
        student4.setEnrollmentYear((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        java.lang.String str15 = student4.getName();
        java.lang.String str16 = student4.toString();
        java.lang.String str17 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 35)" + "'", str16, "hi! -  (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 35)" + "'", str17, "hi! -  (hi!, Class of 35)");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.getMajor();
        student4.setName(" -  - hi! (, Class of -1) (, Class of 0)");
        java.lang.String str13 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 0)" + "'", str9, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        student4.setStudentId(" - hi! (, Class of -1)");
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        student4.setEnrollmentYear((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        business.Student student4 = new business.Student(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", " - hi! (hi!, Class of 52)", (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        java.lang.String str13 = student4.toString();
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)" + "'", str13, "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str21 = student4.getName();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        java.lang.String str15 = student4.getName();
        java.lang.String str16 = student4.getStudentId();
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str15 = student4.toString();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str18 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str15, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str18, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  (hi!, Class of 0)", 35);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str12 = student11.getMajor();
        java.lang.String str13 = student11.getStudentId();
        student11.setStudentId(" -  (, Class of 10)");
        java.lang.String str16 = student11.toString();
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        student21.addCompletedCourse("");
        java.lang.String str24 = student21.toString();
        java.lang.String str25 = student21.getStudentId();
        java.lang.String str26 = student21.getName();
        java.util.List<java.lang.String> strList27 = student21.getCompletedCourses();
        student11.setCompletedCourses(strList27);
        student4.setCompletedCourses(strList27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 0)" + "'", str12, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str13, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str16, " -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 0)" + "'", str24, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        student4.setName("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        business.Student student13 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList14 = student13.getCompletedCourses();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        int int21 = student13.getEnrollmentYear();
        java.lang.String str22 = student13.getMajor();
        int int23 = student13.getEnrollmentYear();
        student13.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        student30.setName("hi!");
        student30.addCompletedCourse("");
        student30.setEnrollmentYear((int) (short) 100);
        java.lang.String str38 = student30.getName();
        java.util.List<java.lang.String> strList39 = student30.getCompletedCourses();
        business.Student student44 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList45 = student44.getCompletedCourses();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        student44.setCompletedCourses((java.util.List<java.lang.String>) strList49);
        student30.setCompletedCourses((java.util.List<java.lang.String>) strList49);
        student13.setCompletedCourses((java.util.List<java.lang.String>) strList49);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList49);
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str57 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)", " -  (, Class of 0)", (int) (short) 10);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str11 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)" + "'", str11, "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        java.lang.String str5 = student4.getName();
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        student4.setName(" -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)", " -  - hi! (, Class of -1) (hi!, Class of 10)", "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)", (int) 'a');
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (, Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", 52);
        student4.setEnrollmentYear((int) (short) 10);
        student4.setMajor("hi! -  (, Class of 10)");
        business.Student student13 = new business.Student(" - hi! (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (short) 10);
        student13.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str16 = student13.getMajor();
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str22 = student21.getName();
        java.util.List<java.lang.String> strList23 = student21.getCompletedCourses();
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList29 = student28.getCompletedCourses();
        student21.setCompletedCourses(strList29);
        student21.setName(" - hi! (, Class of 0)");
        java.lang.String str33 = student21.getName();
        java.lang.String str34 = student21.toString();
        student21.setStudentId(" - hi! (, Class of 0)");
        business.Student student41 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", "", (int) (byte) 10);
        business.Student student46 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList47 = student46.getCompletedCourses();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        student46.setCompletedCourses((java.util.List<java.lang.String>) strList51);
        int int54 = student46.getEnrollmentYear();
        student46.setMajor(" -  (, Class of 0)");
        int int57 = student46.getEnrollmentYear();
        student46.setStudentId("hi!");
        java.lang.String str60 = student46.toString();
        java.util.List<java.lang.String> strList61 = student46.getCompletedCourses();
        student41.setCompletedCourses(strList61);
        student21.setCompletedCourses(strList61);
        student13.setCompletedCourses(strList61);
        student4.setCompletedCourses(strList61);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " - hi! (, Class of 0)" + "'", str33, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str34, " -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str60, "hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList61);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        java.lang.String str21 = student4.getMajor();
        int int22 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", 10);
        java.lang.String str5 = student4.toString();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str8 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)" + "'", str5, " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str8, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        student4.addCompletedCourse("hi!");
        java.lang.String str16 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str19 = student4.toString();
        java.lang.String str20 = student4.getName();
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        business.Student student26 = new business.Student("", "", "", (int) (short) 0);
        student26.addCompletedCourse("");
        student26.addCompletedCourse("");
        business.Student student35 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student40 = new business.Student("hi!", "", "hi!", 0);
        student40.setName(" -  (, Class of 10)");
        student40.setMajor("");
        java.lang.String[] strArray48 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        student40.setCompletedCourses((java.util.List<java.lang.String>) strList49);
        student35.setCompletedCourses((java.util.List<java.lang.String>) strList49);
        student26.setCompletedCourses((java.util.List<java.lang.String>) strList49);
        java.lang.String str54 = student26.getStudentId();
        student26.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        int int57 = student26.getEnrollmentYear();
        java.util.List<java.lang.String> strList58 = student26.getCompletedCourses();
        student4.setCompletedCourses(strList58);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)" + "'", str19, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strList58);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        business.Student student4 = new business.Student(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100) -  (, Class of 0)", "hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)", (int) '#');
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        int int7 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        business.Student student4 = new business.Student(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)", " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (, Class of 0)", "hi! -  (, Class of 0)", 10);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        int int8 = student4.getEnrollmentYear();
        student4.setStudentId("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        int int7 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        java.util.List<java.lang.String> strList25 = student4.getCompletedCourses();
        java.lang.String str26 = student4.getName();
        business.Student student31 = new business.Student("hi!", "", "hi!", 0);
        student31.addCompletedCourse("");
        java.lang.String str34 = student31.getName();
        student31.setMajor("");
        java.lang.String str37 = student31.getName();
        int int38 = student31.getEnrollmentYear();
        int int39 = student31.getEnrollmentYear();
        business.Student student44 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (, Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", 52);
        java.lang.String str45 = student44.toString();
        java.util.List<java.lang.String> strList46 = student44.getCompletedCourses();
        student31.setCompletedCourses(strList46);
        student4.setCompletedCourses(strList46);
        java.lang.Class<?> wildcardClass49 = strList46.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)" + "'", str45, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        int int8 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 0) (, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 0) (, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 0) (, Class of 0)");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (short) 10);
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str7 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        int int10 = student4.getEnrollmentYear();
        business.Student student15 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.String str16 = student15.getStudentId();
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str22 = student21.getName();
        student21.setEnrollmentYear((int) (byte) 10);
        java.lang.String str25 = student21.toString();
        student21.setEnrollmentYear((int) (byte) 100);
        java.lang.String str28 = student21.toString();
        java.lang.String str29 = student21.getName();
        java.lang.String str30 = student21.getMajor();
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        student35.setStudentId("");
        int int39 = student35.getEnrollmentYear();
        student35.setEnrollmentYear((int) (short) 1);
        student35.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student35.setEnrollmentYear((int) '#');
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        student50.setCompletedCourses((java.util.List<java.lang.String>) strList55);
        student35.setCompletedCourses((java.util.List<java.lang.String>) strList55);
        student21.setCompletedCourses((java.util.List<java.lang.String>) strList55);
        student15.setCompletedCourses((java.util.List<java.lang.String>) strList55);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList55);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str16, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 10)" + "'", str25, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  (, Class of 100)" + "'", str28, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        business.Student student27 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList28 = student27.getCompletedCourses();
        student27.setName("hi!");
        java.lang.String str31 = student27.getName();
        java.lang.String str32 = student27.getStudentId();
        student27.setEnrollmentYear((int) (short) 100);
        java.util.List<java.lang.String> strList35 = student27.getCompletedCourses();
        student4.setCompletedCourses(strList35);
        java.lang.String str37 = student4.getMajor();
        int int38 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (, Class of 100)" + "'", str22, "hi! -  (, Class of 100)");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        java.util.List<java.lang.String> strList25 = student4.getCompletedCourses();
        student4.setName(" -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        student4.setEnrollmentYear((int) (byte) 0);
        java.lang.String str18 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        business.Student student4 = new business.Student(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  (, Class of 0)", "hi! -  (hi!, Class of 0) - hi! -  -  (, Class of 10) (, Class of 1) ( -  (, Class of 10), Class of 100)", (int) '#');
        student4.setEnrollmentYear(1);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        student4.setStudentId(" -  - hi! (, Class of 0) (, Class of 0)");
        java.lang.String str7 = student4.getMajor();
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str8, " -  - hi! (, Class of 0) (, Class of 0)");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        business.Student student4 = new business.Student(" -  - hi! (, Class of -1) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", (int) '4');
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.toString();
        student4.setStudentId("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  - hi! (, Class of -1) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) (hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0), Class of 52)" + "'", str8, " -  - hi! (, Class of -1) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) (hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0), Class of 52)");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        student4.addCompletedCourse("hi!");
        java.lang.String str16 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str19 = student4.toString();
        java.lang.String str20 = student4.getName();
        java.lang.String str21 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)" + "'", str19, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        java.lang.String str42 = student4.getName();
        java.util.List<java.lang.String> strList43 = student4.getCompletedCourses();
        student4.setMajor(" -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)");
        business.Student student50 = new business.Student("hi!", "", "hi!", 0);
        student50.addCompletedCourse("");
        java.util.List<java.lang.String> strList53 = student50.getCompletedCourses();
        student4.setCompletedCourses(strList53);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList53);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getName();
        student4.setStudentId(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        student4.addCompletedCourse("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        student4.setMajor("hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str5, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        int int15 = student4.getEnrollmentYear();
        student4.setMajor(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        java.lang.String str21 = student4.getMajor();
        student4.setStudentId(" - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str14, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        student4.addCompletedCourse("hi! -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setName(" - hi! (, Class of 100)");
        int int11 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! -  (hi!, Class of 97) (, Class of 10)");
        business.Student student18 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (, Class of 0)", (int) '#');
        business.Student student23 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str24 = student23.getStudentId();
        student23.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student23.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        java.util.List<java.lang.String> strList29 = student23.getCompletedCourses();
        student18.setCompletedCourses(strList29);
        student4.setCompletedCourses(strList29);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) ( - hi! (, Class of 100), Class of 0)", " - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", 32);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        java.lang.String str12 = student4.toString();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)");
        java.lang.String str15 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 100)" + "'", str12, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        business.Student student4 = new business.Student(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", (int) ' ');
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getName();
        business.Student student11 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (byte) 0);
        student11.setEnrollmentYear((int) (byte) -1);
        student11.setMajor("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        java.lang.String str16 = student11.toString();
        student11.setMajor("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        java.lang.String str19 = student11.getStudentId();
        java.util.List<java.lang.String> strList20 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList20);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)" + "'", str16, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str19, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertNotNull(strList20);
    }
}

