import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getMajor();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        java.lang.String str17 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 0)" + "'", str14, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)" + "'", str17, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)", " - hi! (, Class of -1)", 52);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.addCompletedCourse(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.lang.String str15 = student4.getName();
        student4.setStudentId("hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str12, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        student4.setMajor(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList31 = student4.getCompletedCourses();
        int int32 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        student4.setStudentId("hi!");
        int int25 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        java.lang.String str33 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str33, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str10 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("");
        student4.setStudentId(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", (-1));
        java.lang.String str5 = student4.getMajor();
        student4.addCompletedCourse(" -  (hi!, Class of 10)");
        java.lang.String str8 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)" + "'", str8, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
        student4.setStudentId(" -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getMajor();
        student4.setStudentId(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setMajor(" - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        java.lang.String str14 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        student4.setStudentId(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.setStudentId(" -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.util.List<java.lang.String> strList26 = student4.getCompletedCourses();
        java.lang.String str27 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str23, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " -  (, Class of 10)" + "'", str27, " -  (, Class of 10)");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)" + "'", str7, "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        java.util.List<java.lang.String> strList38 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " - hi! (, Class of 0)" + "'", str33, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.String str27 = student4.getName();
        int int28 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList29 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)" + "'", str26, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " - hi! (, Class of 100)" + "'", str27, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        business.Student student4 = new business.Student("hi!", "hi!", "hi! -  -  (, Class of 10) (, Class of 0)", 0);
        student4.setEnrollmentYear((int) ' ');
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.toString();
        business.Student student10 = new business.Student("hi!", "", "hi!", 0);
        student10.setName(" -  (, Class of 10)");
        student10.setEnrollmentYear((int) '#');
        java.lang.String str15 = student10.toString();
        java.lang.String str16 = student10.getMajor();
        java.lang.String str17 = student10.getStudentId();
        java.util.List<java.lang.String> strList18 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str15, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        student4.setName(" -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        business.Student student4 = new business.Student("", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", 10);
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str5, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        business.Student student15 = new business.Student("hi!", "", "hi!", 0);
        business.Student student20 = new business.Student("hi!", "", "hi!", 0);
        student20.setName(" -  (, Class of 10)");
        student20.setMajor("");
        java.lang.String str25 = student20.getMajor();
        java.lang.String str26 = student20.getName();
        java.util.List<java.lang.String> strList27 = student20.getCompletedCourses();
        student15.setCompletedCourses(strList27);
        business.Student student33 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList34 = student33.getCompletedCourses();
        student33.setName("hi!");
        student33.addCompletedCourse("");
        java.util.List<java.lang.String> strList39 = student33.getCompletedCourses();
        int int40 = student33.getEnrollmentYear();
        java.lang.String str41 = student33.toString();
        java.util.List<java.lang.String> strList42 = student33.getCompletedCourses();
        student15.setCompletedCourses(strList42);
        student4.setCompletedCourses(strList42);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 10)" + "'", str26, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " - hi! (, Class of 0)" + "'", str41, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", (int) (byte) -1);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        student4.setMajor(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
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
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(97);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str17 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String[] strArray17 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        student4.addCompletedCourse("");
        int int24 = student4.getEnrollmentYear();
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        business.Student student4 = new business.Student(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! -  (, Class of 0) -  (, Class of 100)", (int) (byte) 1);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        business.Student student4 = new business.Student(" -  (hi!, Class of 100)", "hi!", "hi! -  -  (, Class of 10) (, Class of 1)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.String str30 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str30, " - hi! (hi!, Class of 52)");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        java.lang.String str23 = student4.getName();
        student4.setName(" - hi! -  (hi!, Class of 97) (, Class of 10)");
        student4.setMajor(" -  (hi!, Class of 10)");
        student4.setEnrollmentYear(10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str11 = student4.getMajor();
        int int12 = student4.getEnrollmentYear();
        int int13 = student4.getEnrollmentYear();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.Class<?> wildcardClass16 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.String str22 = student4.getMajor();
        java.lang.Class<?> wildcardClass23 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str21, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str22, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", "", "hi! - hi! ( - hi! (, Class of -1), Class of 35)", (int) '#');
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        student4.setStudentId("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        java.lang.String str30 = student4.getName();
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        student35.setCompletedCourses((java.util.List<java.lang.String>) strList40);
        int int43 = student35.getEnrollmentYear();
        business.Student student48 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList49 = student48.getCompletedCourses();
        student48.setName("hi!");
        student48.addCompletedCourse("");
        java.util.List<java.lang.String> strList54 = student48.getCompletedCourses();
        java.lang.String str55 = student48.getStudentId();
        java.lang.String str56 = student48.toString();
        business.Student student61 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList62 = student61.getCompletedCourses();
        student48.setCompletedCourses(strList62);
        business.Student student68 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList69 = student68.getCompletedCourses();
        student48.setCompletedCourses(strList69);
        student35.setCompletedCourses(strList69);
        int int72 = student35.getEnrollmentYear();
        business.Student student77 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList78 = student77.getCompletedCourses();
        student77.setName("hi!");
        student77.addCompletedCourse("");
        java.util.List<java.lang.String> strList83 = student77.getCompletedCourses();
        java.lang.String str84 = student77.getStudentId();
        java.lang.String str85 = student77.toString();
        business.Student student90 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList91 = student90.getCompletedCourses();
        student77.setCompletedCourses(strList91);
        student35.setCompletedCourses(strList91);
        student4.setCompletedCourses(strList91);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + " - hi! (, Class of 0)" + "'", str56, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + " - hi! (, Class of 0)" + "'", str85, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList91);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", 35);
        student4.setName("hi! -  (hi!, Class of 97)");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str12 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str12, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        student4.setMajor(" -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.util.List<java.lang.String> strList31 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        student4.addCompletedCourse(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        java.lang.String str17 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0) -  (, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0) -  (, Class of 0)");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.toString();
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setName(" -  (, Class of 0)");
        student4.setMajor("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str7, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str8, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        java.lang.String str61 = student4.getName();
        student4.setStudentId("hi!");
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + " -  (, Class of 10)" + "'", str61, " -  (, Class of 10)");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setName("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        int int28 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", 0);
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getName();
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        int int9 = student4.getEnrollmentYear();
        int int10 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear(100);
        student4.setMajor("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        java.lang.String str15 = student4.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)" + "'", str15, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        java.util.List<java.lang.String> strList22 = null;
        student4.setCompletedCourses(strList22);
        java.lang.String str24 = student4.getStudentId();
        java.lang.String str25 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 0)" + "'", str24, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str25, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getName();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getStudentId();
        student4.addCompletedCourse(" -  (, Class of 0)");
        student4.setEnrollmentYear((int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        java.lang.String str26 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)" + "'", str26, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        business.Student student4 = new business.Student("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)", " -  - hi! (, Class of 0) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", 100);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str10 = student9.getName();
        student9.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList13 = student9.getCompletedCourses();
        student9.setMajor("hi!");
        business.Student student20 = new business.Student("hi!", "", "hi!", 0);
        student20.setName(" -  (, Class of 10)");
        student20.setEnrollmentYear((int) '#');
        java.lang.String str25 = student20.toString();
        java.lang.String str26 = student20.getMajor();
        java.lang.String str27 = student20.getStudentId();
        java.util.List<java.lang.String> strList28 = student20.getCompletedCourses();
        student9.setCompletedCourses(strList28);
        student4.setCompletedCourses(strList28);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str25, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        java.lang.String str22 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str25 = student4.getStudentId();
        java.lang.String str26 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str22, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  (, Class of 0)" + "'", str25, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 0)" + "'", str26, " -  (, Class of 0)");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId(" -  (, Class of 10)");
        student4.setEnrollmentYear(0);
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList25 = student24.getCompletedCourses();
        student24.setStudentId("");
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str33 = student32.getName();
        java.util.List<java.lang.String> strList34 = student32.getCompletedCourses();
        student24.setCompletedCourses(strList34);
        student24.setStudentId(" -  (, Class of 10)");
        student24.setMajor(" - hi! (, Class of 100)");
        java.util.List<java.lang.String> strList40 = student24.getCompletedCourses();
        business.Student student45 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList46 = student45.getCompletedCourses();
        student24.setCompletedCourses(strList46);
        student4.setCompletedCourses(strList46);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        student4.setName(" - hi! (, Class of 100)");
        student4.setEnrollmentYear((-1));
        student4.setEnrollmentYear(100);
        student4.setStudentId(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", "", (int) (byte) 10);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) (, Class of 52)", "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)", (int) 'a');
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        student4.addCompletedCourse(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str28, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        business.Student student4 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)" + "'", str6, "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str7, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        int int23 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        business.Student student21 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", " -  - hi! (, Class of 0) (, Class of 0)", (int) (short) 1);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        student4.setCompletedCourses(strList22);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)", "", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", 32);
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        java.lang.String str7 = student4.getStudentId();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str10, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        java.lang.String str17 = student4.toString();
        java.lang.String str18 = student4.getMajor();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str17, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 0)", 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        java.lang.String str19 = student4.getName();
        business.Student student24 = new business.Student("hi!", "", "hi!", 0);
        student24.setName(" -  (, Class of 10)");
        student24.setEnrollmentYear((int) '#');
        java.lang.String str29 = student24.getMajor();
        java.util.List<java.lang.String> strList30 = student24.getCompletedCourses();
        student4.setCompletedCourses(strList30);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.lang.String str25 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str21, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)" + "'", str25, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        int int38 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " - hi! (, Class of 0)" + "'", str33, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setStudentId("hi! -  (, Class of 0)");
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        java.lang.String str16 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (, Class of 0)" + "'", str16, "hi! -  (, Class of 0)");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        int int10 = student4.getEnrollmentYear();
        student4.setName(" - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        student4.addCompletedCourse(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        student4.setStudentId(" - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getName();
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 0)" + "'", str14, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        int int20 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.lang.String str23 = student4.getMajor();
        java.lang.Class<?> wildcardClass24 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (, Class of 100)" + "'", str22, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", " -  - hi! (, Class of 0) (, Class of 0)", " -  (, Class of 100)", (int) (byte) -1);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str9, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        student4.setName("hi!");
        student4.setMajor("hi! - hi! ( - hi! (, Class of -1), Class of 35)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        java.lang.String str22 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)" + "'", str22, " -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.toString();
        student4.setName(" -  (, Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)");
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str10, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        business.Student student4 = new business.Student("hi! -  ( -  (, Class of 0), Class of 0)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " - hi! (, Class of 0)", (int) (short) 100);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str5, "hi! -  ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        student4.setStudentId(" - hi! (, Class of 0) - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str28, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        business.Student student4 = new business.Student("", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0)", (int) (short) 0);
        java.lang.String str5 = student4.getMajor();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student12 = new business.Student("", "hi!", "", 100);
        student12.setEnrollmentYear((int) (short) -1);
        student12.setEnrollmentYear((int) ' ');
        student12.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str24 = student23.getName();
        java.util.List<java.lang.String> strList25 = student23.getCompletedCourses();
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        student23.setCompletedCourses(strList31);
        student23.setName(" - hi! (, Class of 0)");
        java.lang.String str35 = student23.getName();
        business.Student student40 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList41 = student40.getCompletedCourses();
        student40.setName("hi!");
        student40.addCompletedCourse("");
        student40.setEnrollmentYear((int) (short) 100);
        java.lang.String str48 = student40.getName();
        java.util.List<java.lang.String> strList49 = student40.getCompletedCourses();
        student23.setCompletedCourses(strList49);
        int int51 = student23.getEnrollmentYear();
        java.util.List<java.lang.String> strList52 = student23.getCompletedCourses();
        student12.setCompletedCourses(strList52);
        student4.setCompletedCourses(strList52);
        student4.setEnrollmentYear(35);
        int int57 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " - hi! (, Class of 0)" + "'", str35, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str7, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getStudentId();
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.toString();
        student4.setStudentId(" -  (hi!, Class of 100)");
        java.lang.String str8 = student4.getName();
        int int9 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 0)" + "'", str8, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        business.Student student4 = new business.Student(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)", "", " -  (, Class of 10)", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str10 = student4.getMajor();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        business.Student student4 = new business.Student("", "hi!", "", 0);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        business.Student student4 = new business.Student(" -  (, Class of 0)", "", "", 100);
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) -  (, Class of 100)" + "'", str5, " -  (, Class of 0) -  (, Class of 100)");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.lang.String str21 = student4.getMajor();
        java.lang.String str22 = student4.toString();
        student4.setMajor(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str22, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        student4.setMajor(" - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        java.lang.String str60 = student4.toString();
        int int61 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " -  (, Class of 10)" + "'", str52, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + " -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)" + "'", str60, " -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
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
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 100)", (int) (short) -1);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " -  (hi!, Class of 100)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", (int) '#');
        student4.setEnrollmentYear((int) '#');
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (hi!, Class of 100)" + "'", str7, " -  (hi!, Class of 100)");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 100)", "", 1);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        student9.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str16 = student9.getMajor();
        java.lang.String str17 = student9.getMajor();
        java.util.List<java.lang.String> strList18 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        business.Student student24 = new business.Student("", "hi!", "", 100);
        student24.setEnrollmentYear((int) (short) -1);
        int int27 = student24.getEnrollmentYear();
        student24.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str30 = student24.getStudentId();
        student24.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        student24.setMajor(" - hi! (hi!, Class of 52)");
        java.lang.String str35 = student24.toString();
        business.Student student40 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str41 = student40.getName();
        student40.setEnrollmentYear(10);
        student40.setEnrollmentYear((int) (byte) 0);
        student40.setMajor(" - hi! (, Class of 0)");
        java.lang.String str48 = student40.getMajor();
        student40.setStudentId(" -  (, Class of 0)");
        student40.setEnrollmentYear((int) 'a');
        java.lang.String str53 = student40.getStudentId();
        int int54 = student40.getEnrollmentYear();
        student40.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        java.util.List<java.lang.String> strList57 = student40.getCompletedCourses();
        student24.setCompletedCourses(strList57);
        student4.setCompletedCourses(strList57);
        java.lang.String str60 = student4.getStudentId();
        student4.setStudentId("hi! -  (, Class of 0) -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str35, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + " - hi! (, Class of 0)" + "'", str48, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + " -  (, Class of 0)" + "'", str53, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str60, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str14 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getStudentId();
        int int14 = student4.getEnrollmentYear();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getMajor();
        student4.setMajor("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str14, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str15, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)", 52);
        student4.setName("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        business.Student student4 = new business.Student("hi!", "hi!", "hi! -  -  (, Class of 10) (, Class of 0)", 0);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student9.setStudentId("");
        int int13 = student9.getEnrollmentYear();
        student9.setEnrollmentYear((int) (short) 1);
        student9.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        java.util.List<java.lang.String> strList18 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setEnrollmentYear(97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        student4.setEnrollmentYear((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  -  (, Class of 10) (hi!, Class of 35)", " -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)", (int) '#');
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 1), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str14, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("");
        student4.setStudentId(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 0) -  -  (, Class of 10) (, Class of 100)" + "'", str11, " - hi! (, Class of 0) -  -  (, Class of 10) (, Class of 100)");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        student4.setStudentId(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        java.lang.String str13 = student4.getName();
        student4.setMajor(" -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - hi! (, Class of 0)" + "'", str13, " - hi! (, Class of 0)");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.lang.String str20 = student4.getName();
        student4.setMajor("hi!");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " - hi! (, Class of 100)", "hi!", 10);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
        student4.setName(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        int int11 = student4.getEnrollmentYear();
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", " - hi! (, Class of 0)", "", (int) '4');
        java.lang.String str5 = student4.getStudentId();
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        int int10 = student4.getEnrollmentYear();
        int int11 = student4.getEnrollmentYear();
        student4.setStudentId("hi! - hi! (hi!, Class of 100)");
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        business.Student student4 = new business.Student(" -  - hi! (, Class of -1) (, Class of 0)", " - hi! (, Class of -1)", "", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  - hi! (, Class of -1) (, Class of 0)" + "'", str5, " -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  - hi! (, Class of -1) (, Class of 0)" + "'", str6, " -  - hi! (, Class of -1) (, Class of 0)");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 0)", (int) (short) 10);
        student4.setName(" - hi! (, Class of 100)");
        java.lang.String str7 = student4.getStudentId();
        student4.setEnrollmentYear((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setEnrollmentYear((int) 'a');
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getName();
        student4.setStudentId(" - hi! (hi!, Class of 52)");
        student4.setEnrollmentYear((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        business.Student student4 = new business.Student("", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (short) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear((int) '4');
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)" + "'", str8, " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.String str22 = student4.getStudentId();
        java.lang.String str23 = student4.getName();
        java.lang.String str24 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " - hi! (, Class of 0)" + "'", str23, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " - hi! (, Class of 0)" + "'", str24, " - hi! (, Class of 0)");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setEnrollmentYear((int) (short) 1);
        student4.addCompletedCourse("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)");
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        business.Student student4 = new business.Student("hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)", " - hi! (hi!, Class of 10)", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        java.util.List<java.lang.String> strList6 = null;
        student4.setCompletedCourses(strList6);
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        student4.setStudentId(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        student4.setEnrollmentYear((int) (byte) 100);
        int int28 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getMajor();
        student4.setName(" - hi! (, Class of -1)");
        student4.setMajor(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getName();
        student4.setStudentId(" - hi! (hi!, Class of 52)");
        java.lang.String str13 = student4.getName();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getMajor();
        int int16 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getStudentId();
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setEnrollmentYear((int) 'a');
        student4.setEnrollmentYear(32);
        java.lang.String str11 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)", "", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)", (int) (short) -1);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        java.lang.String str42 = student4.toString();
        business.Student student47 = new business.Student("hi!", "", "hi!", 0);
        int int48 = student47.getEnrollmentYear();
        student47.addCompletedCourse("hi! - hi! (hi!, Class of 35)");
        java.lang.String str51 = student47.getStudentId();
        int int52 = student47.getEnrollmentYear();
        java.util.List<java.lang.String> strList53 = student47.getCompletedCourses();
        student4.setCompletedCourses(strList53);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)" + "'", str42, " - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(strList53);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        java.lang.Class<?> wildcardClass33 = strList31.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " - hi! (, Class of 0)" + "'", str30, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        java.lang.String str38 = student4.getMajor();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str36 = student4.getMajor();
        java.lang.String str37 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 0)" + "'", str16, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str36, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " - hi! (, Class of 0)" + "'", str37, " - hi! (, Class of 0)");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        business.Student student4 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)" + "'", str6, "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        int int10 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        java.lang.Class<?> wildcardClass21 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        student4.setMajor("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
        student4.setStudentId(" -  - hi! (, Class of -1) (hi!, Class of 10)");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        java.lang.String str21 = student4.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str18, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str21, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        java.lang.String str26 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str21, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)" + "'", str26, "hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)");
        student4.addCompletedCourse("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        business.Student student4 = new business.Student(" -  (, Class of 0) -  (, Class of 100)", " -  (, Class of 0)", "hi! -  (, Class of 10)", (int) (short) 1);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        student4.setEnrollmentYear((int) ' ');
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        business.Student student4 = new business.Student("", "hi!", "", 0);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getStudentId();
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getMajor();
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.addCompletedCourse("hi! - hi! ( - hi! (, Class of -1), Class of 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (, Class of 100)" + "'", str8, " - hi! (, Class of 100)");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        student4.setStudentId("hi!");
        int int9 = student4.getEnrollmentYear();
        student4.setStudentId(" -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList15);
        java.lang.String str17 = student4.getMajor();
        business.Student student22 = new business.Student("hi!", "hi!", "hi! -  -  (, Class of 10) (, Class of 0)", 0);
        student22.setEnrollmentYear((int) ' ');
        java.lang.String str25 = student22.getName();
        business.Student student30 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str31 = student30.getName();
        student30.setEnrollmentYear((int) (short) 100);
        student30.setMajor(" -  (, Class of 10)");
        java.lang.String str36 = student30.getName();
        student30.setStudentId(" - hi! (hi!, Class of 52)");
        java.lang.String str39 = student30.getName();
        business.Student student44 = new business.Student("hi!", "", "hi!", 0);
        student44.setName(" -  (, Class of 10)");
        student44.setMajor("");
        java.lang.String[] strArray52 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        student44.setCompletedCourses((java.util.List<java.lang.String>) strList53);
        java.lang.String str56 = student44.getMajor();
        student44.setName(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList59 = student44.getCompletedCourses();
        student30.setCompletedCourses(strList59);
        student22.setCompletedCourses(strList59);
        student4.setCompletedCourses(strList59);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strList59);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        business.Student student10 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student10.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList13 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setEnrollmentYear(0);
        java.lang.String str17 = student4.getMajor();
        java.lang.String str18 = student4.getMajor();
        student4.setMajor(" - hi! -  (hi!, Class of 0) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! (, Class of 0)" + "'", str17, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! (, Class of 0)" + "'", str18, " - hi! (, Class of 0)");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        student4.setName(" -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)", " -  ( -  (, Class of 0), Class of 0)", "hi! -  -  (, Class of 10) (, Class of 1)", 0);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        business.Student student4 = new business.Student("", " -  (, Class of 100)", "", (int) (short) -1);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 100) (, Class of -1)" + "'", str8, "hi! -  (hi!, Class of 0) -  -  (, Class of 100) (, Class of -1)");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        student4.addCompletedCourse("hi! -  (hi!, Class of 1)");
        java.util.List<java.lang.String> strList31 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " -  (, Class of 10)", 10);
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        business.Student student11 = new business.Student("hi!", "", "hi!", 0);
        student11.addCompletedCourse("");
        java.lang.String str14 = student11.getName();
        student11.addCompletedCourse(" -  (, Class of 100)");
        java.lang.String str17 = student11.getStudentId();
        java.util.List<java.lang.String> strList18 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        java.lang.String str20 = student4.toString();
        java.lang.String str21 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str5, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str20, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str21, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        business.Student student45 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student45.setName("");
        java.util.List<java.lang.String> strList48 = student45.getCompletedCourses();
        java.util.List<java.lang.String> strList49 = student45.getCompletedCourses();
        student4.setCompletedCourses(strList49);
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
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        java.lang.String str16 = student4.getMajor();
        student4.setMajor("");
        student4.setStudentId(" - hi! (, Class of 100) - hi! (hi!, Class of 35)");
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 100) - hi! (hi!, Class of 35)" + "'", str21, " - hi! (, Class of 100) - hi! (hi!, Class of 35)");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str14 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        student4.setEnrollmentYear(52);
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
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.setStudentId(" -  (hi!, Class of 100)");
        student4.setEnrollmentYear((int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.String str21 = student4.toString();
        student4.setStudentId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 100)" + "'", str16, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)" + "'", str21, "hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setEnrollmentYear((int) (byte) 10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)");
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) - hi! (hi! -  (hi!, Class of 0), Class of 100)" + "'", str11, "hi! -  (hi!, Class of 0) - hi! (hi! -  (hi!, Class of 0), Class of 100)");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setMajor("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        student4.addCompletedCourse(" - hi! (, Class of 100)");
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
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getName();
        business.Student student10 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str11 = student10.getMajor();
        business.Student student16 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student16.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList19 = student16.getCompletedCourses();
        student10.setCompletedCourses(strList19);
        student4.setCompletedCourses(strList19);
        int int22 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass23 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 0)" + "'", str11, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor("");
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear(0);
        student4.setMajor(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str7 = student4.toString();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)" + "'", str7, " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        business.Student student4 = new business.Student("", "hi! -  (hi!, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", (int) (byte) 0);
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setMajor("hi! -  (, Class of 100)");
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)", "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", 0);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", " - hi! (, Class of -1)", (int) (short) 10);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        business.Student student4 = new business.Student("hi! - hi! ( - hi! (, Class of -1), Class of 35)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)", "hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0)", (int) (byte) 0);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        student4.setEnrollmentYear((int) (short) 0);
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)", "hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0)", "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)", 32);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) -1);
        java.lang.String str7 = student4.getMajor();
        student4.setStudentId(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        java.lang.String str26 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 0)" + "'", str21, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 0)" + "'", str26, " -  (, Class of 0)");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        business.Student student4 = new business.Student("", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (short) 100);
        student4.setName(" - hi! (, Class of 100)");
        int int7 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str11 = student4.toString();
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getMajor();
        int int14 = student4.getEnrollmentYear();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 100)" + "'", str11, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", (-1));
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str7, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (short) 10);
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str7 = student4.toString();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)" + "'", str7, " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        student16.setCompletedCourses((java.util.List<java.lang.String>) strList21);
        int int24 = student16.getEnrollmentYear();
        student16.setMajor(" -  (, Class of 0)");
        int int27 = student16.getEnrollmentYear();
        student16.setStudentId("hi!");
        business.Student student34 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList35 = student34.getCompletedCourses();
        student34.setName("hi!");
        student34.addCompletedCourse("");
        java.util.List<java.lang.String> strList40 = student34.getCompletedCourses();
        java.lang.String str41 = student34.getStudentId();
        java.lang.String str42 = student34.toString();
        business.Student student47 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList48 = student47.getCompletedCourses();
        student34.setCompletedCourses(strList48);
        business.Student student54 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList55 = student54.getCompletedCourses();
        student34.setCompletedCourses(strList55);
        student16.setCompletedCourses(strList55);
        student4.setCompletedCourses(strList55);
        java.lang.String str59 = student4.getStudentId();
        java.lang.String str60 = student4.getStudentId();
        business.Student student65 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList66 = student65.getCompletedCourses();
        student65.setName("hi!");
        business.Student student73 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str74 = student73.getName();
        java.util.List<java.lang.String> strList75 = student73.getCompletedCourses();
        business.Student student80 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList81 = student80.getCompletedCourses();
        student73.setCompletedCourses(strList81);
        student65.setCompletedCourses(strList81);
        student65.setEnrollmentYear((int) (byte) 100);
        java.util.List<java.lang.String> strList86 = student65.getCompletedCourses();
        student4.setCompletedCourses(strList86);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " - hi! (, Class of 0)" + "'", str42, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str59, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str60, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setName("");
        business.Student student14 = new business.Student("hi!", "", "hi!", 0);
        student14.addCompletedCourse("");
        java.util.List<java.lang.String> strList17 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        java.lang.String str19 = student4.toString();
        student4.addCompletedCourse(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 100)" + "'", str19, "hi! -  (hi!, Class of 100)");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        java.lang.String str21 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! - hi! (hi!, Class of 100)" + "'", str21, "hi! - hi! (hi!, Class of 100)");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        student4.setName(" -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.setName(" - hi! (, Class of 100) - hi! - hi! (hi!, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        int int28 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str8 = student4.getName();
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (, Class of 0)" + "'", str8, "hi! -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.String str21 = student4.getName();
        student4.setStudentId(" -  (hi!, Class of 10)");
        java.lang.String str24 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.util.List<java.lang.String> strList80 = student4.getCompletedCourses();
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
        org.junit.Assert.assertNotNull(strList80);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        business.Student student4 = new business.Student("hi! - hi! ( - hi! (, Class of -1), Class of 35)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)", " -  - hi! (, Class of -1) (, Class of 0)", 97);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (, Class of 0)", (int) '#');
        business.Student student9 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str10 = student9.getStudentId();
        student9.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student9.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        java.util.List<java.lang.String> strList15 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList15);
        java.lang.String str17 = student4.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  - hi! (, Class of 0) (, Class of 100)" + "'", str17, " -  - hi! (, Class of 0) (, Class of 100)");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        business.Student student4 = new business.Student(" - hi! -  (hi!, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", (int) '#');
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getName();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 1), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.setStudentId("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        student4.setStudentId(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear(0);
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        business.Student student4 = new business.Student("", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0)", (int) (short) 0);
        java.lang.String str5 = student4.getMajor();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student12 = new business.Student("", "hi!", "", 100);
        student12.setEnrollmentYear((int) (short) -1);
        student12.setEnrollmentYear((int) ' ');
        student12.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str24 = student23.getName();
        java.util.List<java.lang.String> strList25 = student23.getCompletedCourses();
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        student23.setCompletedCourses(strList31);
        student23.setName(" - hi! (, Class of 0)");
        java.lang.String str35 = student23.getName();
        business.Student student40 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList41 = student40.getCompletedCourses();
        student40.setName("hi!");
        student40.addCompletedCourse("");
        student40.setEnrollmentYear((int) (short) 100);
        java.lang.String str48 = student40.getName();
        java.util.List<java.lang.String> strList49 = student40.getCompletedCourses();
        student23.setCompletedCourses(strList49);
        int int51 = student23.getEnrollmentYear();
        java.util.List<java.lang.String> strList52 = student23.getCompletedCourses();
        student12.setCompletedCourses(strList52);
        student4.setCompletedCourses(strList52);
        java.util.List<java.lang.String> strList55 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " - hi! (, Class of 0)" + "'", str35, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  (, Class of 100)");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (, Class of 100)" + "'", str8, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)" + "'", str9, " -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", " - hi! (, Class of 0)", "", (int) '4');
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (, Class of 0)" + "'", str7, " - hi! (, Class of 0)");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " -  (, Class of 10)", 10);
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str5, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str7, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.Class<?> wildcardClass22 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.getName();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str6, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.getName();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getName();
        student4.setStudentId("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        business.Student student4 = new business.Student("hi!", "hi!", "hi! -  -  (, Class of 10) (, Class of 0)", 0);
        student4.setEnrollmentYear((int) ' ');
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        int int10 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        java.lang.String str8 = student4.getMajor();
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str7 = student4.toString();
        student4.setStudentId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)" + "'", str7, " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        student4.setMajor(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        business.Student student4 = new business.Student(" -  - hi! (, Class of -1) (, Class of 0)", " - hi! (, Class of -1)", "", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        business.Student student10 = new business.Student("hi!", "", "hi!", 0);
        student10.addCompletedCourse("");
        java.lang.String str13 = student10.getName();
        student10.setMajor("");
        java.lang.String str16 = student10.getName();
        int int17 = student10.getEnrollmentYear();
        int int18 = student10.getEnrollmentYear();
        business.Student student23 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (, Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", 52);
        java.lang.String str24 = student23.toString();
        java.util.List<java.lang.String> strList25 = student23.getCompletedCourses();
        student10.setCompletedCourses(strList25);
        student4.setCompletedCourses(strList25);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  - hi! (, Class of -1) (, Class of 0)" + "'", str5, " -  - hi! (, Class of -1) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)" + "'", str24, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getName();
        student4.setStudentId(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        student4.addCompletedCourse("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str5, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str10, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", " - hi! (, Class of 100)", " - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)", 52);
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        int int6 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        student4.addCompletedCourse("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)");
        student4.setName(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str8 = student4.getName();
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str8, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.lang.String str5 = student4.getName();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        int int33 = student4.getEnrollmentYear();
        java.lang.String str34 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { " - hi! (, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", " -  (, Class of 10)" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str34, " -  (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        business.Student student16 = new business.Student(" - hi! (, Class of 100)", "hi!", " - hi! (, Class of 0)", (-1));
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        student21.setName(" -  (, Class of 10)");
        student21.setEnrollmentYear((int) '#');
        java.lang.String str26 = student21.toString();
        java.lang.String str27 = student21.getMajor();
        java.lang.String str28 = student21.getStudentId();
        java.util.List<java.lang.String> strList29 = student21.getCompletedCourses();
        student16.setCompletedCourses(strList29);
        student4.setCompletedCourses(strList29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str26, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        student4.setStudentId("hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        java.lang.String str25 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String[] strArray17 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList18);
        java.util.List<java.lang.String> strList22 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        student4.setName(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        student4.setMajor(" - hi! (, Class of 0) -  -  (, Class of 10) (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str15, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " - hi! (, Class of 0)" + "'", str28, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 0)" + "'", str33, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        business.Student student4 = new business.Student("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)", " - hi! -  (hi!, Class of 0) (, Class of 100)", 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        java.lang.String str25 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " - hi! (, Class of 0)" + "'", str25, " - hi! (, Class of 0)");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", "", "hi! - hi! (hi!, Class of 100)", (int) (short) 100);
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!, Class of 100)" + "'", str5, "hi! - hi! (hi!, Class of 100)");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str11 = student4.getMajor();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        int int14 = student4.getEnrollmentYear();
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 100);
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getName();
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        int int22 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 100)" + "'", str20, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getMajor();
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str14, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str15, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str16 = student4.getName();
        java.lang.String str17 = student4.toString();
        int int18 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList19 = student4.getCompletedCourses();
        java.lang.String str20 = student4.getStudentId();
        student4.setName("");
        int int23 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 0)" + "'", str16, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str17, " -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getMajor();
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        java.lang.String str39 = student4.getMajor();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " -  (, Class of 0)" + "'", str39, " -  (, Class of 0)");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        student4.setName(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", 0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        java.lang.String str25 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str25, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        student4.setEnrollmentYear(35);
        int int12 = student4.getEnrollmentYear();
        student4.setStudentId(" -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        int int35 = student4.getEnrollmentYear();
        java.lang.String str36 = student4.getName();
        java.lang.String str37 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str36, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        student4.setEnrollmentYear((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  (, Class of 10)", "", (int) (short) 10);
        java.lang.String str5 = student4.toString();
        student4.setEnrollmentYear(0);
        student4.setStudentId(" - hi! (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.setEnrollmentYear(1);
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 1)" + "'", str10, "hi! -  (hi!, Class of 1)");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        student4.setMajor(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        business.Student student4 = new business.Student("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", " - hi! -  (hi!, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", (int) (short) 10);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        business.Student student4 = new business.Student(" - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)", " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)", (int) (short) 10);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (hi!, Class of 100)", " - hi! (, Class of 0)", 52);
        java.lang.String str5 = student4.toString();
        int int6 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  (, Class of 100)");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (, Class of 100)" + "'", str8, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        java.lang.String str19 = student4.toString();
        int int20 = student4.getEnrollmentYear();
        java.lang.String str21 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)" + "'", str19, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str15 = student4.toString();
        java.lang.String str16 = student4.getName();
        java.lang.String str17 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str15, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str17, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) -1);
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str10, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        student4.setStudentId("hi! -  (hi!, Class of 1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str8, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)" + "'", str18, "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        business.Student student4 = new business.Student("", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", "hi!", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        java.lang.String str28 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str28, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        student4.addCompletedCourse("hi! -  (, Class of 100)");
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
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", "", (int) (byte) 100);
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1) (, Class of 100)" + "'", str5, "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1) (, Class of 100)");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.toString();
        student4.setEnrollmentYear((int) ' ');
        int int8 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        student4.addCompletedCourse("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
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
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getName();
        business.Student student10 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str11 = student10.getMajor();
        business.Student student16 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student16.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList19 = student16.getCompletedCourses();
        student10.setCompletedCourses(strList19);
        student4.setCompletedCourses(strList19);
        int int22 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        java.util.List<java.lang.String> strList25 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 0)" + "'", str11, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", (int) 'a');
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setName("hi! - hi! (hi!, Class of 35)");
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str11, "hi! - hi! (hi!, Class of 35)");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str18 = student4.getStudentId();
        java.lang.String str19 = student4.getName();
        java.lang.String str20 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str18, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 0) (, Class of 0)" + "'", str20, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 0) (, Class of 0)");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str11 = student4.getMajor();
        int int12 = student4.getEnrollmentYear();
        student4.setName("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setMajor(" -  (, Class of 100)");
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0) -  -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10) (hi! -  -  (, Class of 10) (, Class of 1), Class of 1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        student4.setEnrollmentYear(35);
        student4.setStudentId("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str16 = student4.getStudentId();
        int int17 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str16, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        java.lang.String str35 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str35, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str15 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        student4.setEnrollmentYear(52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        int int8 = student4.getEnrollmentYear();
        int int9 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        business.Student student15 = new business.Student("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", " -  (hi!, Class of 10)", " - hi! (hi!, Class of 10)", (int) '#');
        business.Student student20 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList21 = null;
        student20.setCompletedCourses(strList21);
        java.lang.String str23 = student20.getMajor();
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList29 = student28.getCompletedCourses();
        student28.setName("hi!");
        student28.addCompletedCourse("");
        java.lang.String str34 = student28.toString();
        java.lang.String str35 = student28.getStudentId();
        java.lang.String str36 = student28.getMajor();
        java.util.List<java.lang.String> strList37 = student28.getCompletedCourses();
        student20.setCompletedCourses(strList37);
        student15.setCompletedCourses(strList37);
        student4.setCompletedCourses(strList37);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " - hi! (, Class of 0)" + "'", str34, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        int int13 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getName();
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 1)");
        int int9 = student4.getEnrollmentYear();
        int int10 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str15 = student4.toString();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        int int17 = student4.getEnrollmentYear();
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setEnrollmentYear((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str15, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        student4.setEnrollmentYear((int) (byte) 100);
        student4.setEnrollmentYear((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        student4.addCompletedCourse("hi! - hi! (hi!, Class of 100)");
        business.Student student14 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", 100);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList15);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        student4.setEnrollmentYear((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str15, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " - hi! (, Class of 0)" + "'", str28, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 0)" + "'", str33, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        business.Student student4 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        java.lang.String str21 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str18 = student4.getStudentId();
        java.lang.String str19 = student4.getName();
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList25 = student24.getCompletedCourses();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        student24.setCompletedCourses((java.util.List<java.lang.String>) strList29);
        java.lang.String str32 = student24.getName();
        student24.setStudentId(" -  (, Class of 0)");
        student24.setMajor(" -  (, Class of 10)");
        student24.setEnrollmentYear((int) (byte) 100);
        student24.setEnrollmentYear(35);
        java.lang.String str41 = student24.getName();
        student24.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        java.util.List<java.lang.String> strList44 = student24.getCompletedCourses();
        java.util.List<java.lang.String> strList45 = student24.getCompletedCourses();
        student4.setCompletedCourses(strList45);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str18, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        java.lang.String str41 = student4.getName();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " -  (, Class of 10)" + "'", str41, " -  (, Class of 10)");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) 0);
        student4.setName("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        student4.setStudentId("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getStudentId();
        student4.setName("hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str7, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.toString();
        student4.setMajor("hi!");
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str7, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str8, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getMajor();
        int int8 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str12, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.setStudentId("hi! -  - hi! (, Class of 100) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.lang.String str13 = student4.toString();
        student4.setStudentId("hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)" + "'", str13, "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)");
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
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        java.lang.String str12 = student4.getName();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.String str14 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str7 = student4.getMajor();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", 52);
        student4.setName("hi! - hi! (, Class of 100)");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str10 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str10, "hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        student4.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        int int25 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        student4.setEnrollmentYear((int) (short) -1);
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
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  (, Class of 100)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str10 = student4.toString();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)" + "'", str10, " -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " -  (hi!, Class of 100)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", (int) '#');
        student4.setEnrollmentYear((int) '#');
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", (int) 'a');
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (short) -1);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.addCompletedCourse(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        int int18 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", (-1));
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.getName();
        java.lang.String str8 = student4.getMajor();
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)", " - hi! (, Class of 100) - hi! (hi!, Class of 35)", "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)", (-1));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        java.lang.Class<?> wildcardClass24 = strList22.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! (, Class of 0)" + "'", str20, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        java.lang.String str24 = student4.getMajor();
        java.lang.String str25 = student4.getMajor();
        int int26 = student4.getEnrollmentYear();
        java.lang.String str27 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setEnrollmentYear(0);
        business.Student student11 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int12 = student11.getEnrollmentYear();
        student11.setMajor("hi!");
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str20 = student19.getName();
        student19.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList23 = student19.getCompletedCourses();
        java.lang.String str24 = student19.getName();
        business.Student student29 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student29.setStudentId("hi! -  (hi!, Class of 0)");
        int int32 = student29.getEnrollmentYear();
        java.util.List<java.lang.String> strList33 = student29.getCompletedCourses();
        student19.setCompletedCourses(strList33);
        student11.setCompletedCourses(strList33);
        student4.setCompletedCourses(strList33);
        int int37 = student4.getEnrollmentYear();
        student4.setName("");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        business.Student student4 = new business.Student("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", "hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)", (int) '4');
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        student4.setMajor(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        business.Student student4 = new business.Student("", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)", " -  - hi! (, Class of 0) (, Class of 100)", (int) (short) -1);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getMajor();
        business.Student student19 = new business.Student("hi!", "", "hi!", 0);
        student19.setName(" -  (, Class of 10)");
        student19.setMajor("");
        student19.setName(" - hi! (, Class of 100)");
        student19.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList28 = student19.getCompletedCourses();
        student4.setCompletedCourses(strList28);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        java.lang.String str44 = student4.getMajor();
        student4.addCompletedCourse("hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        java.lang.String str13 = student4.toString();
        java.lang.String str14 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)" + "'", str13, "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)" + "'", str14, "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) - hi! (, Class of 100)" + "'", str11, "hi! -  (hi!, Class of 0) - hi! (, Class of 100)");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        business.Student student4 = new business.Student(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)", "", " -  (, Class of 10)", 0);
        java.lang.String str5 = student4.getName();
        student4.setStudentId("hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        business.Student student4 = new business.Student(" -  (, Class of 0) -  (, Class of 100)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  (, Class of -1)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)", 10);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        int int18 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str11, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        business.Student student23 = new business.Student("hi!", "", "hi!", 0);
        student23.setName(" -  (, Class of 10)");
        student23.setMajor("");
        java.lang.String str28 = student23.getMajor();
        java.lang.String str29 = student23.getName();
        java.util.List<java.lang.String> strList30 = student23.getCompletedCourses();
        student18.setCompletedCourses(strList30);
        java.util.List<java.lang.String> strList32 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 10)" + "'", str29, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getName();
        business.Student student17 = new business.Student(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)", " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)", "", 32);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList18);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        business.Student student18 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student23 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        student18.setCompletedCourses(strList24);
        student4.setCompletedCourses(strList24);
        student4.setEnrollmentYear((int) (short) 10);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        java.lang.String str51 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)" + "'", str51, " -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getName();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        student4.addCompletedCourse(" -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.setName("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        student4.addCompletedCourse(" -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        business.Student student4 = new business.Student("", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 100)", (int) (byte) -1);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        business.Student student4 = new business.Student(" -  (, Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  (, Class of -1)", " -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", 0);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", " -  - hi! (, Class of 0) (, Class of 100)", " - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)", 100);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        business.Student student4 = new business.Student("", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0)", (int) (short) 0);
        student4.addCompletedCourse(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear(100);
        student4.setEnrollmentYear(1);
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str9, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", 0);
        student4.setName("hi! -  (, Class of 10)");
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (, Class of 10)" + "'", str7, "hi! -  (, Class of 10)");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        student4.setEnrollmentYear((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getName();
        int int11 = student4.getEnrollmentYear();
        int int12 = student4.getEnrollmentYear();
        student4.setStudentId(" -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)");
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 100)");
        student4.setEnrollmentYear(32);
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        java.lang.String str18 = student4.getName();
        student4.setMajor(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        student4.addCompletedCourse("hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
        int int23 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        student4.setStudentId(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        java.lang.String str13 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) ( -  (, Class of 0), Class of -1)" + "'", str13, " -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) ( -  (, Class of 0), Class of -1)");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        java.util.List<java.lang.String> strList43 = student4.getCompletedCourses();
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
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear(0);
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.String str13 = student4.getName();
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)", "hi! -  -  (, Class of 10) (hi!, Class of 35) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", (int) (short) 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        int int10 = student4.getEnrollmentYear();
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        student15.setEnrollmentYear(0);
        business.Student student22 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int23 = student22.getEnrollmentYear();
        student22.setMajor("hi!");
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str31 = student30.getName();
        student30.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList34 = student30.getCompletedCourses();
        java.lang.String str35 = student30.getName();
        business.Student student40 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student40.setStudentId("hi! -  (hi!, Class of 0)");
        int int43 = student40.getEnrollmentYear();
        java.util.List<java.lang.String> strList44 = student40.getCompletedCourses();
        student30.setCompletedCourses(strList44);
        student22.setCompletedCourses(strList44);
        student15.setCompletedCourses(strList44);
        student4.setCompletedCourses(strList44);
        java.lang.Class<?> wildcardClass49 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (hi!, Class of 100)", "hi! - hi! (hi!, Class of 35)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str5, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str16 = student15.getName();
        java.util.List<java.lang.String> strList17 = student15.getCompletedCourses();
        business.Student student22 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList23 = student22.getCompletedCourses();
        student15.setCompletedCourses(strList23);
        student15.setName(" - hi! (, Class of 0)");
        java.lang.String str27 = student15.getName();
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList33 = student32.getCompletedCourses();
        student32.setName("hi!");
        student32.addCompletedCourse("");
        student32.setEnrollmentYear((int) (short) 100);
        java.lang.String str40 = student32.getName();
        java.util.List<java.lang.String> strList41 = student32.getCompletedCourses();
        student15.setCompletedCourses(strList41);
        int int43 = student15.getEnrollmentYear();
        java.util.List<java.lang.String> strList44 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList44);
        java.lang.Class<?> wildcardClass46 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " - hi! (, Class of 0)" + "'", str27, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse("");
        java.lang.String str12 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        java.lang.String str11 = student4.getName();
        business.Student student16 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        java.lang.String str17 = student16.getName();
        student16.setName("");
        java.util.List<java.lang.String> strList20 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)" + "'", str11, "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! (, Class of 0)" + "'", str17, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        student4.setName(" - hi! (, Class of -1)");
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setStudentId("");
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        int int17 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList18 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setEnrollmentYear(35);
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        java.lang.String str29 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        java.lang.String str20 = student4.getStudentId();
        student4.setName(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        int int23 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)", " - hi! (, Class of 0) - hi! (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)", (int) (short) 100);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        business.Student student4 = new business.Student(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)", "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", " -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)", 100);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        java.util.List<java.lang.String> strList23 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)", (int) (byte) 1);
        student4.setEnrollmentYear(97);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", "", "hi! - hi! ( - hi! (, Class of -1), Class of 35)", (int) '#');
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        business.Student student14 = new business.Student("", "hi!", "", 100);
        java.lang.String str15 = student14.getMajor();
        java.lang.String str16 = student14.toString();
        java.util.List<java.lang.String> strList17 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) -  -  - hi! (, Class of 0) (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 100)" + "'", str16, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)", (int) (short) -1);
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        business.Student student4 = new business.Student(" -  (hi!, Class of 100)", " -  (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        java.util.List<java.lang.String> strList32 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", (int) (short) -1);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str6, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        int int19 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setName(" - hi! (, Class of 100)");
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getName();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! (, Class of 100)" + "'", str14, " - hi! (, Class of 100)");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        student4.setName(" - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        java.lang.String str22 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        student4.addCompletedCourse(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
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
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        java.lang.String str55 = student4.getStudentId();
        java.util.List<java.lang.String> strList56 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str55, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        student4.setEnrollmentYear((int) (short) 0);
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str15 = student4.toString();
        java.lang.Class<?> wildcardClass16 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)" + "'", str15, " -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        business.Student student4 = new business.Student("", " -  -  (, Class of 10) (hi!, Class of 35)", " - hi! (, Class of 100) - hi! (hi!, Class of 35)", 100);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getName();
        int int14 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 100)" + "'", str12, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear(100);
        student4.setMajor("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        int int15 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (, Class of -1)");
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.setEnrollmentYear((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getName();
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.setMajor("");
        java.lang.String str16 = student4.toString();
        java.lang.String str17 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi! (, Class of 100)" + "'", str16, "hi! - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        java.lang.String str12 = student4.getName();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str15 = student4.getMajor();
        student4.addCompletedCourse(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str14 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  - hi! (, Class of 0) (, Class of 10)" + "'", str14, "hi! -  - hi! (, Class of 0) (, Class of 10)");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getMajor();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)" + "'", str12, "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setMajor("hi!");
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) ' ');
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str10 = student4.getMajor();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str10, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        student4.setMajor(" - hi! (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        student4.setName(" -  (, Class of 10)");
        java.lang.String str7 = student4.getName();
        int int8 = student4.getEnrollmentYear();
        student4.setStudentId("hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
        student4.setName(" - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 100)", "hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of -1)", (int) '#');
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) -1);
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        student4.setEnrollmentYear((int) (short) -1);
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
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        student4.addCompletedCourse("hi! -  (, Class of 100)");
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str6, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str12, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str13, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        int int10 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        student4.setMajor(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        student4.setEnrollmentYear(0);
        student4.addCompletedCourse(" - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        student4.addCompletedCourse("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getStudentId();
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        java.lang.String str14 = student4.getStudentId();
        student4.setEnrollmentYear(97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setEnrollmentYear(0);
        java.lang.String str7 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        int int22 = student4.getEnrollmentYear();
        java.lang.Class<?> wildcardClass23 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)" + "'", str19, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        student4.setName(" - hi! (hi!, Class of 10)");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getMajor();
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.String str11 = student4.getMajor();
        student4.setName("hi!");
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str11, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str14, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
        student4.setName("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        student4.setStudentId(" -  (, Class of 0)");
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getStudentId();
        java.lang.String str14 = student4.getMajor();
        java.lang.Class<?> wildcardClass15 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 0)" + "'", str13, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        student4.setStudentId("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 10)" + "'", str18, " -  (, Class of 10)");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)", (int) ' ');
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student9.setStudentId("");
        int int13 = student9.getEnrollmentYear();
        java.lang.String str14 = student9.getMajor();
        student9.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        student21.setCompletedCourses((java.util.List<java.lang.String>) strList26);
        int int29 = student21.getEnrollmentYear();
        student21.setMajor(" -  (, Class of 0)");
        int int32 = student21.getEnrollmentYear();
        student21.setStudentId("hi!");
        business.Student student39 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList40 = student39.getCompletedCourses();
        student39.setName("hi!");
        student39.addCompletedCourse("");
        java.util.List<java.lang.String> strList45 = student39.getCompletedCourses();
        java.lang.String str46 = student39.getStudentId();
        java.lang.String str47 = student39.toString();
        business.Student student52 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList53 = student52.getCompletedCourses();
        student39.setCompletedCourses(strList53);
        business.Student student59 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList60 = student59.getCompletedCourses();
        student39.setCompletedCourses(strList60);
        student21.setCompletedCourses(strList60);
        student9.setCompletedCourses(strList60);
        student4.setCompletedCourses(strList60);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + " - hi! (, Class of 0)" + "'", str47, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        java.lang.String str16 = student4.getMajor();
        student4.setMajor("");
        student4.setStudentId(" -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setStudentId("");
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        int int17 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        business.Student student14 = new business.Student("hi!", "", "hi!", 0);
        student14.setName(" -  (, Class of 10)");
        student14.setEnrollmentYear((int) '#');
        java.lang.String str19 = student14.getMajor();
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        student24.addCompletedCourse("");
        java.lang.String str27 = student24.toString();
        java.lang.String str28 = student24.getStudentId();
        business.Student student33 = new business.Student("hi!", "", "hi!", 0);
        student33.setName(" -  (, Class of 10)");
        student33.setMajor("");
        java.lang.String str38 = student33.getMajor();
        business.Student student43 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList44 = student43.getCompletedCourses();
        student33.setCompletedCourses(strList44);
        student24.setCompletedCourses(strList44);
        student14.setCompletedCourses(strList44);
        student4.setCompletedCourses(strList44);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " -  (, Class of 0)" + "'", str27, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        java.lang.String str30 = student4.getName();
        student4.setStudentId("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.lang.String str33 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " - hi! (, Class of 100)" + "'", str30, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " - hi! (, Class of 100)" + "'", str33, " - hi! (, Class of 100)");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        int int22 = student4.getEnrollmentYear();
        java.lang.String str23 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (, Class of 0)" + "'", str23, " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (, Class of 0)");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  (, Class of 0)");
        java.lang.String str13 = student4.toString();
        java.lang.String str14 = student4.toString();
        student4.setMajor(" -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)");
        java.lang.String str17 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)" + "'", str13, "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)" + "'", str14, "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        int int8 = student4.getEnrollmentYear();
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 0)" + "'", str11, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getName();
        int int10 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setMajor(" -  (, Class of 10)");
        student4.setStudentId(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        java.lang.String str8 = student4.getName();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        int int21 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        student4.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        java.lang.Class<?> wildcardClass25 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.setStudentId(" -  (hi!, Class of 100)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (hi!, Class of 100) -  (, Class of 10)" + "'", str12, " -  (hi!, Class of 100) -  (, Class of 10)");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        student4.setName("hi!");
        java.util.List<java.lang.String> strList20 = student4.getCompletedCourses();
        java.lang.String str21 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! - hi! (, Class of 100)" + "'", str21, "hi! - hi! (, Class of 100)");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        student16.setCompletedCourses((java.util.List<java.lang.String>) strList21);
        int int24 = student16.getEnrollmentYear();
        student16.setMajor(" -  (, Class of 0)");
        int int27 = student16.getEnrollmentYear();
        student16.setStudentId("hi!");
        business.Student student34 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList35 = student34.getCompletedCourses();
        student34.setName("hi!");
        student34.addCompletedCourse("");
        java.util.List<java.lang.String> strList40 = student34.getCompletedCourses();
        java.lang.String str41 = student34.getStudentId();
        java.lang.String str42 = student34.toString();
        business.Student student47 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList48 = student47.getCompletedCourses();
        student34.setCompletedCourses(strList48);
        business.Student student54 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList55 = student54.getCompletedCourses();
        student34.setCompletedCourses(strList55);
        student16.setCompletedCourses(strList55);
        student4.setCompletedCourses(strList55);
        java.lang.String str59 = student4.getStudentId();
        java.lang.String str60 = student4.getStudentId();
        business.Student student65 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList66 = student65.getCompletedCourses();
        student65.setName("hi!");
        business.Student student73 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str74 = student73.getName();
        java.util.List<java.lang.String> strList75 = student73.getCompletedCourses();
        business.Student student80 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList81 = student80.getCompletedCourses();
        student73.setCompletedCourses(strList81);
        student65.setCompletedCourses(strList81);
        student65.setEnrollmentYear((int) (byte) 100);
        java.util.List<java.lang.String> strList86 = student65.getCompletedCourses();
        student4.setCompletedCourses(strList86);
        java.lang.String str88 = student4.getMajor();
        java.lang.Class<?> wildcardClass89 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " - hi! (, Class of 0)" + "'", str42, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str59, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str60, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        int int8 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        student4.setName("hi! -  (, Class of 0)");
        java.lang.String str12 = student4.toString();
        int int13 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi! -  (, Class of 0) (hi!, Class of 35)" + "'", str12, "hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        student4.setEnrollmentYear((int) '4');
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.getStudentId();
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)");
        java.lang.String str15 = student4.getName();
        student4.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of -1) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        java.lang.String str13 = student4.getName();
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        business.Student student4 = new business.Student("", "hi! - hi! (hi!, Class of 100)", " -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", (int) (short) -1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str13 = student4.getName();
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        student18.setName(" -  (, Class of 10)");
        student18.setEnrollmentYear((int) '#');
        java.lang.String str23 = student18.toString();
        java.lang.String str24 = student18.getMajor();
        java.lang.String str25 = student18.getStudentId();
        student18.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        business.Student student32 = new business.Student("hi!", "", "hi!", 0);
        student32.addCompletedCourse("");
        java.util.List<java.lang.String> strList35 = student32.getCompletedCourses();
        java.lang.String str36 = student32.getName();
        business.Student student41 = new business.Student("hi!", "", "hi!", 0);
        student41.setName(" -  (, Class of 10)");
        student41.setEnrollmentYear((int) '#');
        java.lang.String str46 = student41.getMajor();
        java.util.List<java.lang.String> strList47 = student41.getCompletedCourses();
        student32.setCompletedCourses(strList47);
        student18.setCompletedCourses(strList47);
        student4.setCompletedCourses(strList47);
        int int51 = student4.getEnrollmentYear();
        java.lang.String str52 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (, Class of 10)" + "'", str13, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str23, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str52, " -  ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.addCompletedCourse(" -  (, Class of 100)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 10)" + "'", str12, "hi! -  (, Class of 10)");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.toString();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        student4.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str13, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        student4.setName("");
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str15 = student4.toString();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str21 = student4.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str15, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str21, " -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        student4.setName(" -  (, Class of 10)");
        java.lang.String str15 = student4.getName();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        java.lang.String str18 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear(0);
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.String str13 = student4.getMajor();
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) (byte) 0);
        student4.addCompletedCourse(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        java.lang.String str9 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  (hi!, Class of 0) -  -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) ( - hi! (, Class of 100), Class of 0)" + "'", str9, "hi! -  (hi!, Class of 0) -  -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) ( - hi! (, Class of 100), Class of 0)");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)", "hi! -  (hi! -  (, Class of 10), Class of 10)", (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        student4.setName(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", 0);
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  (, Class of 10)");
        student4.setEnrollmentYear((-1));
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setMajor("");
        java.lang.String str8 = student4.toString();
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (, Class of 100)" + "'", str8, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getStudentId();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)", " -  (, Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", "hi! -  - hi! (, Class of 100) (, Class of 0)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! (hi!, Class of 100)", "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", " -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 0)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)", "hi! -  (hi!, Class of 0) - hi! (, Class of 100)", " - hi! (, Class of 35)", "hi! -  ( -  (, Class of 0), Class of 0)", " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)", " - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)", "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (hi!, Class of 100) ( - hi! (, Class of 0), Class of 52)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", " -  (hi! -  (hi!, Class of 0), Class of 0)", " - hi! (, Class of 0)", "hi! - hi! (hi!, Class of 100)", " -  (hi! -  (hi!, Class of 0), Class of 0)", "hi! -  (, Class of 100)", "hi! -  (hi!, Class of 0) - hi! (, Class of 100)", "hi! - hi! (hi!, Class of 100)", " -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) ( -  (, Class of 0), Class of -1)", "hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0)", "hi! -  -  (, Class of 100) (hi!, Class of 35)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", " -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)", " - hi! -  (hi!, Class of 0) (, Class of 100)", " -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)", " - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0), Class of 0)", "hi! - hi! ( - hi! (, Class of -1), Class of 35)", " -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)", " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)", " -  (, Class of 10)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)", " - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)", " -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList75);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        student4.setEnrollmentYear((int) (byte) 10);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getName();
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        student15.setName("hi!");
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str24 = student23.getName();
        java.util.List<java.lang.String> strList25 = student23.getCompletedCourses();
        business.Student student30 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList31 = student30.getCompletedCourses();
        student23.setCompletedCourses(strList31);
        student15.setCompletedCourses(strList31);
        java.lang.String str34 = student15.getStudentId();
        student15.setName(" - hi! (, Class of 0)");
        business.Student student41 = new business.Student("hi!", "", "hi!", 0);
        student41.addCompletedCourse("");
        java.util.List<java.lang.String> strList44 = student41.getCompletedCourses();
        student15.setCompletedCourses(strList44);
        int int46 = student15.getEnrollmentYear();
        business.Student student51 = new business.Student("hi!", "", "hi!", 0);
        student51.addCompletedCourse("");
        student51.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        student51.setName(" - hi! (, Class of 100)");
        business.Student student62 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList63 = student62.getCompletedCourses();
        student62.setName("hi!");
        student62.addCompletedCourse("");
        java.lang.String str68 = student62.toString();
        java.lang.String str69 = student62.getStudentId();
        java.lang.String str70 = student62.getMajor();
        student62.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.util.List<java.lang.String> strList73 = student62.getCompletedCourses();
        student51.setCompletedCourses(strList73);
        java.util.List<java.lang.String> strList75 = student51.getCompletedCourses();
        student15.setCompletedCourses(strList75);
        student4.setCompletedCourses(strList75);
        java.lang.String str78 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + " - hi! (, Class of 0)" + "'", str68, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi! - hi! ( -  (, Class of 10), Class of 100)" + "'", str78, "hi! - hi! ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        java.lang.String str21 = student4.getStudentId();
        student4.setName(" -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getName();
        int int14 = student4.getEnrollmentYear();
        student4.setName(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 100)" + "'", str12, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.toString();
        student4.setStudentId(" -  (, Class of 10)");
        int int11 = student4.getEnrollmentYear();
        java.lang.String str12 = student4.getStudentId();
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str8, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 10)" + "'", str12, " -  (, Class of 10)");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        java.lang.String str20 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str17, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! -  (hi!, Class of 97)" + "'", str20, "hi! -  (hi!, Class of 97)");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        student4.addCompletedCourse(" - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)");
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
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        int int9 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) '4');
        student4.setStudentId(" -  (, Class of 10) - hi! -  (hi!, Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10), Class of 0)");
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        java.lang.String str29 = student4.toString();
        java.util.List<java.lang.String> strList30 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)" + "'", str25, "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)" + "'", str29, "hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)");
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 100);
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getName();
        student4.setName("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        java.lang.Class<?> wildcardClass19 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", " -  ( -  (, Class of 0), Class of 0)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", (int) (short) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)", (int) (byte) 1);
        business.Student student9 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int10 = student9.getEnrollmentYear();
        java.lang.String str11 = student9.toString();
        business.Student student16 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str17 = student16.getStudentId();
        java.lang.String str18 = student16.toString();
        java.lang.String str19 = student16.toString();
        business.Student student24 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList25 = student24.getCompletedCourses();
        business.Student student30 = new business.Student("", "hi!", "", 100);
        java.lang.String str31 = student30.getMajor();
        java.lang.String str32 = student30.toString();
        java.util.List<java.lang.String> strList33 = student30.getCompletedCourses();
        java.lang.String str34 = student30.getName();
        java.lang.String str35 = student30.getStudentId();
        java.lang.String str36 = student30.getName();
        business.Student student41 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList42 = student41.getCompletedCourses();
        student41.setName("hi!");
        student41.addCompletedCourse("");
        java.lang.String str47 = student41.toString();
        java.lang.String str48 = student41.getStudentId();
        java.lang.String str49 = student41.getMajor();
        java.util.List<java.lang.String> strList50 = student41.getCompletedCourses();
        student30.setCompletedCourses(strList50);
        student24.setCompletedCourses(strList50);
        student16.setCompletedCourses(strList50);
        student9.setCompletedCourses(strList50);
        java.util.List<java.lang.String> strList55 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList55);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)" + "'", str11, " - hi! -  (, Class of 0) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 35)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str18, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str19, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " - hi! (, Class of 100)" + "'", str32, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + " - hi! (, Class of 0)" + "'", str47, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", " - hi! (hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10), Class of 100)", " -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) ( -  (, Class of 0), Class of -1)", 35);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        int int9 = student4.getEnrollmentYear();
        student4.setStudentId(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str16 = student4.getName();
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str22 = student21.getName();
        java.lang.String str23 = student21.getName();
        java.lang.String str24 = student21.getStudentId();
        java.util.List<java.lang.String> strList25 = student21.getCompletedCourses();
        student4.setCompletedCourses(strList25);
        java.lang.String str27 = student4.toString();
        student4.addCompletedCourse("hi! -  (hi! -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 0)" + "'", str16, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str27, " -  - hi! (, Class of 0) (, Class of 0)");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str11 = student4.toString();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)" + "'", str11, "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        business.Student student13 = new business.Student("", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (short) 100);
        student13.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList16 = student13.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        java.lang.Class<?> wildcardClass18 = strList16.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str16 = student4.getName();
        java.lang.String str17 = student4.toString();
        int int18 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList19 = student4.getCompletedCourses();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.setEnrollmentYear((int) (short) 10);
        java.lang.String str24 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (, Class of 0)" + "'", str16, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str17, " -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of 0) (, Class of 10)" + "'", str24, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of 0) (, Class of 10)");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        student4.setStudentId(" -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)");
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setEnrollmentYear(0);
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str9 = student4.toString();
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", (int) ' ');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getStudentId();
        student4.setEnrollmentYear(97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str6, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        student4.addCompletedCourse(" -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" - hi! -  (hi!, Class of 97) (, Class of 10)");
        java.lang.String str29 = student4.getMajor();
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        student4.setStudentId(" -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)");
        java.lang.String str49 = student4.getName();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", 97);
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        student4.setMajor("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        int int21 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.setName(" -  (, Class of 0)");
        student4.setName(" -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi! -  (hi!, Class of 0), Class of 10)");
        java.lang.String str24 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " - hi! (, Class of 0)" + "'", str24, " - hi! (, Class of 0)");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", " -  - hi! (, Class of 0) (, Class of 0)", (int) (short) 1);
        student4.setStudentId(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        student4.setName(" - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)");
        student4.setName(" - hi! (, Class of -1)");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)", " -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)", " -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)", 0);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", "hi! -  (hi!, Class of 0) - hi! -  -  (, Class of 10) (, Class of 1) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 0) - hi! (, Class of 100)", 97);
    }
}

