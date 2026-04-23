import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        business.Student student4 = new business.Student(" - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 35)", " -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10), Class of 97)", 52);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        business.Student student4 = new business.Student(" -  (hi!, Class of 10)", "hi! -  (hi!, Class of 1)", "hi! -  (, Class of 0)", (int) 'a');
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student9.setName("hi!");
        student9.addCompletedCourse("");
        java.util.List<java.lang.String> strList15 = student9.getCompletedCourses();
        int int16 = student9.getEnrollmentYear();
        java.lang.String str17 = student9.toString();
        java.util.List<java.lang.String> strList18 = student9.getCompletedCourses();
        business.Student student23 = new business.Student("hi!", "", "hi!", 0);
        student23.setName(" -  (, Class of 10)");
        student23.setMajor("");
        java.lang.String str28 = student23.getMajor();
        java.lang.String str29 = student23.getName();
        java.util.List<java.lang.String> strList30 = student23.getCompletedCourses();
        student23.setEnrollmentYear(1);
        student23.addCompletedCourse("hi!");
        java.lang.String str35 = student23.toString();
        student23.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str38 = student23.toString();
        java.lang.String str39 = student23.getName();
        java.util.List<java.lang.String> strList40 = student23.getCompletedCourses();
        student9.setCompletedCourses(strList40);
        student4.setCompletedCourses(strList40);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! (, Class of 0)" + "'", str17, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 10)" + "'", str29, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str35, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)" + "'", str38, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " -  (, Class of 10)" + "'", str39, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear(100);
        student4.addCompletedCourse(" -  - hi! (, Class of -1) (, Class of 0)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList21 = student20.getCompletedCourses();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        student20.setCompletedCourses((java.util.List<java.lang.String>) strList25);
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList33 = student32.getCompletedCourses();
        student32.setName("hi!");
        student32.addCompletedCourse("");
        java.lang.String str38 = student32.toString();
        java.lang.String str39 = student32.getStudentId();
        java.lang.String str40 = student32.getMajor();
        student32.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.util.List<java.lang.String> strList43 = student32.getCompletedCourses();
        student20.setCompletedCourses(strList43);
        student4.setCompletedCourses(strList43);
        student4.setEnrollmentYear((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " - hi! (, Class of 0)" + "'", str38, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.toString();
        int int10 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! (hi!, Class of 100)" + "'", str9, "hi! - hi! (hi!, Class of 100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)", " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)" + "'", str5, " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", 10);
        student4.setName(" - hi! (, Class of 0)");
        student4.setEnrollmentYear((int) (byte) 10);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) - hi! - hi! (hi!, Class of 100) ( -  (, Class of 100), Class of 52)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        business.Student student4 = new business.Student(" -  (hi!, Class of 100)", " -  (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", (int) '4');
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        student4.setEnrollmentYear(10);
        student4.setMajor("hi! -  (hi!, Class of 0) - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        java.lang.Class<?> wildcardClass27 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  - hi! (, Class of 0) (, Class of 100)" + "'", str21, " -  - hi! (, Class of 0) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        student9.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList12 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        java.lang.String str14 = student4.getStudentId();
        student4.setName("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.lang.String str7 = student4.getMajor();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of -1) (, Class of 0) (, Class of 100)");
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        business.Student student4 = new business.Student("", " -  (hi! -  (hi!, Class of 0), Class of 0)", " -  (, Class of 100)", 52);
        student4.setName("hi! -  (, Class of 0) -  (, Class of 100)");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        java.lang.String str21 = student4.toString();
        java.lang.String str22 = student4.getStudentId();
        student4.setName(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)" + "'", str21, " -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 0)" + "'", str22, " -  (, Class of 0)");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.util.List<java.lang.String> strList26 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass27 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", (int) 'a');
        java.lang.String str5 = student4.getName();
        int int6 = student4.getEnrollmentYear();
        student4.setStudentId(" - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)" + "'", str5, " -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        business.Student student10 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student10.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList13 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setEnrollmentYear(0);
        java.lang.String str17 = student4.getStudentId();
        java.lang.String str18 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 100)" + "'", str17, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! (, Class of 0), Class of 0)" + "'", str18, " -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        int int8 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.getStudentId();
        business.Student student13 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str14 = student13.getStudentId();
        java.lang.String str15 = student13.toString();
        java.lang.String str16 = student13.toString();
        business.Student student21 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        business.Student student27 = new business.Student("", "hi!", "", 100);
        java.lang.String str28 = student27.getMajor();
        java.lang.String str29 = student27.toString();
        java.util.List<java.lang.String> strList30 = student27.getCompletedCourses();
        java.lang.String str31 = student27.getName();
        java.lang.String str32 = student27.getStudentId();
        java.lang.String str33 = student27.getName();
        business.Student student38 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList39 = student38.getCompletedCourses();
        student38.setName("hi!");
        student38.addCompletedCourse("");
        java.lang.String str44 = student38.toString();
        java.lang.String str45 = student38.getStudentId();
        java.lang.String str46 = student38.getMajor();
        java.util.List<java.lang.String> strList47 = student38.getCompletedCourses();
        student27.setCompletedCourses(strList47);
        student21.setCompletedCourses(strList47);
        student13.setCompletedCourses(strList47);
        student4.setCompletedCourses(strList47);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str15, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str16, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " - hi! (, Class of 100)" + "'", str29, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " - hi! (, Class of 0)" + "'", str44, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strList47);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        student4.setEnrollmentYear((int) '4');
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        student4.setEnrollmentYear(32);
        student4.setStudentId("hi! -  (hi!, Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str8, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 10)" + "'", str24, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        student4.setEnrollmentYear((int) (byte) 0);
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
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        student4.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of -1) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        int int11 = student4.getEnrollmentYear();
        student4.setName(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        business.Student student18 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", "hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", " -  - hi! (, Class of 0) (, Class of 0)", (int) (short) 1);
        java.util.List<java.lang.String> strList19 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList19);
        student4.setStudentId(" -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        student4.setMajor("hi! -  -  (, Class of 10) (hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1), Class of 1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", "", "hi! -  (, Class of 0)", 100);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(97);
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str8, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student4.setMajor(" - hi! (, Class of 100)");
        student4.setStudentId("");
        student4.setName("hi! -  (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str10 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        java.lang.String str13 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear((int) '#');
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
        student19.setName(" -  (, Class of 0)");
        student19.setMajor("");
        java.util.List<java.lang.String> strList42 = student19.getCompletedCourses();
        student19.setMajor(" -  (hi!, Class of 100)");
        business.Student student49 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str50 = student49.getName();
        student49.setEnrollmentYear((int) (short) 100);
        student49.setMajor(" -  (, Class of 10)");
        student49.setEnrollmentYear(100);
        java.lang.String str57 = student49.getName();
        java.util.List<java.lang.String> strList58 = student49.getCompletedCourses();
        student19.setCompletedCourses(strList58);
        student4.setCompletedCourses(strList58);
        business.Student student65 = new business.Student("hi!", "", "", (int) (byte) 100);
        student65.setName(" -  (, Class of 10)");
        java.lang.String str68 = student65.getName();
        java.lang.String str69 = student65.getMajor();
        business.Student student74 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student74.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList77 = student74.getCompletedCourses();
        java.util.List<java.lang.String> strList78 = student74.getCompletedCourses();
        java.lang.String str79 = student74.toString();
        student74.setEnrollmentYear((int) (short) -1);
        student74.setEnrollmentYear((int) (byte) 0);
        student74.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str86 = student74.getMajor();
        java.lang.String str87 = student74.getName();
        java.util.List<java.lang.String> strList88 = student74.getCompletedCourses();
        java.util.List<java.lang.String> strList89 = student74.getCompletedCourses();
        student65.setCompletedCourses(strList89);
        student4.setCompletedCourses(strList89);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + " -  (, Class of 10)" + "'", str68, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str79, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + " -  (, Class of 10)" + "'", str86, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str87, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (, Class of 0)" + "'", str11, "hi! -  (, Class of 0)");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        business.Student student4 = new business.Student("hi! -  ( -  (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (, Class of 100)", 97);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        business.Student student10 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str11 = student10.getName();
        student10.setEnrollmentYear((int) (byte) 10);
        java.lang.String str14 = student10.toString();
        student10.setEnrollmentYear((int) (byte) 100);
        java.lang.String str17 = student10.toString();
        java.lang.String str18 = student10.getName();
        java.lang.String str19 = student10.getMajor();
        business.Student student24 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList25 = student24.getCompletedCourses();
        student24.setStudentId("");
        int int28 = student24.getEnrollmentYear();
        student24.setEnrollmentYear((int) (short) 1);
        student24.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student24.setEnrollmentYear((int) '#');
        business.Student student39 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList40 = student39.getCompletedCourses();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        student39.setCompletedCourses((java.util.List<java.lang.String>) strList44);
        student24.setCompletedCourses((java.util.List<java.lang.String>) strList44);
        student10.setCompletedCourses((java.util.List<java.lang.String>) strList44);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList44);
        java.lang.String str50 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 100)" + "'", str17, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 0)" + "'", str50, " - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 0)");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("");
        java.lang.String str9 = student4.getStudentId();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        java.lang.String str9 = student4.getName();
        int int10 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        int int9 = student4.getEnrollmentYear();
        int int10 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        business.Student student4 = new business.Student(" - hi! (, Class of -1)", " - hi! (hi!, Class of 52) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 52)", "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) (hi!, Class of 0)", (int) (byte) 100);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        java.lang.String str31 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)" + "'", str31, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (hi!, Class of 35)", "hi! -  (hi!, Class of 0)", " -  (, Class of 0)", (int) ' ');
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        student4.setStudentId("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 0)");
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setStudentId(" - hi! (, Class of 100)");
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str9 = student4.toString();
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getName();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        business.Student student17 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str18 = student17.getStudentId();
        java.util.List<java.lang.String> strList19 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList19);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.lang.String str14 = student4.getMajor();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setEnrollmentYear(10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        business.Student student37 = new business.Student("", "hi!", "", 100);
        java.lang.String str38 = student37.getName();
        student37.setName(" - hi! (hi!, Class of 10)");
        int int41 = student37.getEnrollmentYear();
        java.util.List<java.lang.String> strList42 = student37.getCompletedCourses();
        student4.setCompletedCourses(strList42);
        java.lang.String str44 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " - hi! (, Class of 100)" + "'", str44, " - hi! (, Class of 100)");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        student4.setMajor(" - hi! (, Class of 100)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getStudentId();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        student4.setEnrollmentYear(35);
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        business.Student student4 = new business.Student(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", " - hi! -  (hi!, Class of 0) (, Class of 100)", (int) (byte) 0);
        student4.setEnrollmentYear(100);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setStudentId("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        java.lang.String str18 = student4.getName();
        java.util.List<java.lang.String> strList19 = student4.getCompletedCourses();
        int int20 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 0)" + "'", str18, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setEnrollmentYear(1);
        student4.addCompletedCourse("hi!");
        int int16 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  (hi!, Class of 100)");
        student4.setMajor(" -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        student4.setName(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        student4.setMajor(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        student4.setName(" -  ( -  (, Class of 10), Class of 0)");
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) '4');
        student4.setEnrollmentYear((int) (short) 0);
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str15 = student4.getMajor();
        java.lang.String str16 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)" + "'", str16, " -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        java.lang.String str63 = student4.toString();
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi! -  (, Class of 0)" + "'", str63, "hi! -  (, Class of 0)");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str8 = student4.getStudentId();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str8, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        student4.setName(" - hi! (hi!, Class of 10)");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 0);
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (hi!, Class of 10)" + "'", str11, " - hi! (hi!, Class of 10)");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)");
        int int38 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        student4.setStudentId("hi! -  (hi!, Class of 0) - hi! -  -  (, Class of 10) (, Class of 1) ( -  (, Class of 10), Class of 100)");
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
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        java.lang.String str23 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0) -  (, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0) -  (, Class of 0)");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        java.lang.String str14 = student4.toString();
        student4.setMajor("hi! -  (, Class of 0)");
        java.lang.String str17 = student4.getStudentId();
        int int18 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str14, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str11 = student4.toString();
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)");
        student4.setStudentId(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 100)" + "'", str11, " -  (, Class of 100)");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)", " - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)", (int) (byte) 1);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getMajor();
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setMajor(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str7, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear(1);
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
        java.lang.String str26 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " - hi! (, Class of 0)" + "'", str26, " - hi! (, Class of 0)");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setEnrollmentYear((int) (byte) 100);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        student4.setStudentId(" -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str8, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str9, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)" + "'", str7, " -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "hi!", " - hi! (, Class of 0)", (-1));
        student4.setStudentId("hi! -  (hi!, Class of 35)");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  - hi! (, Class of 0) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", (int) (byte) 0);
        student4.setEnrollmentYear((int) (byte) -1);
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  - hi! (, Class of 0) (, Class of 100)" + "'", str11, " -  - hi! (, Class of 0) (, Class of 100)");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str11 = student4.toString();
        java.lang.String str12 = student4.getName();
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)" + "'", str11, "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        java.lang.String str26 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0)");
        java.lang.String str9 = student4.getName();
        student4.addCompletedCourse("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 0)" + "'", str9, " - hi! (, Class of 0)");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", (-1));
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str6, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", (-1));
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getMajor();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1) - hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32), Class of 97)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        student4.setStudentId("");
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        business.Student student18 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList19 = student18.getCompletedCourses();
        business.Student student24 = new business.Student("", "hi!", "", 100);
        java.lang.String str25 = student24.getMajor();
        java.lang.String str26 = student24.toString();
        java.util.List<java.lang.String> strList27 = student24.getCompletedCourses();
        java.lang.String str28 = student24.getName();
        java.lang.String str29 = student24.getStudentId();
        java.lang.String str30 = student24.getName();
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        student35.setName("hi!");
        student35.addCompletedCourse("");
        java.lang.String str41 = student35.toString();
        java.lang.String str42 = student35.getStudentId();
        java.lang.String str43 = student35.getMajor();
        java.util.List<java.lang.String> strList44 = student35.getCompletedCourses();
        student24.setCompletedCourses(strList44);
        student18.setCompletedCourses(strList44);
        student4.setCompletedCourses(strList44);
        java.lang.String str48 = student4.getMajor();
        java.lang.String str49 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " - hi! (, Class of 100)" + "'", str26, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " - hi! (, Class of 0)" + "'", str41, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + " -  -  (, Class of 10) (hi!, Class of 35)" + "'", str49, " -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "", (int) ' ');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getStudentId();
        student4.setMajor(" -  (, Class of 0)");
        student4.setEnrollmentYear((-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str6, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        java.lang.String str25 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str21, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str25, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        java.lang.String str19 = student4.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str19, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getMajor();
        int int11 = student4.getEnrollmentYear();
        business.Student student16 = new business.Student(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 0)", (int) ' ');
        java.util.List<java.lang.String> strList17 = student16.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  (, Class of 10) (hi! -  (, Class of 0), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)", (int) (byte) -1);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        java.lang.String str7 = student4.toString();
        student4.setName(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.setName(" -  (, Class of 0)");
        student4.setMajor(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) (, Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)" + "'", str10, " -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student9.setStudentId("");
        int int13 = student9.getEnrollmentYear();
        student9.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        int int16 = student9.getEnrollmentYear();
        java.util.List<java.lang.String> strList17 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) 0);
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        int int80 = student4.getEnrollmentYear();
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", (-1));
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str5, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)" + "'", str9, "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        student4.setEnrollmentYear((int) (short) 1);
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)");
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        student20.setName("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student20.setStudentId("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.util.List<java.lang.String> strList25 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList25);
        java.lang.String str27 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str27, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear(0);
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.toString();
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str11 = student4.toString();
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int15 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 100)" + "'", str11, " -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        java.lang.String str12 = student4.toString();
        student4.setStudentId("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        student4.setName(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)");
        java.lang.Class<?> wildcardClass17 = student4.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 100)" + "'", str12, "hi! -  (, Class of 100)");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)", "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", 0);
        student4.setEnrollmentYear((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        student4.setEnrollmentYear((int) ' ');
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
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" - hi! (, Class of 100)");
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        student15.setName("hi!");
        student15.addCompletedCourse("");
        java.lang.String str21 = student15.toString();
        java.lang.String str22 = student15.getStudentId();
        java.lang.String str23 = student15.getMajor();
        student15.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.util.List<java.lang.String> strList26 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList26);
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 0)" + "'", str21, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        business.Student student22 = new business.Student("hi!", "", "hi!", 0);
        student22.setName(" -  (, Class of 10)");
        student22.setMajor("");
        java.lang.String str27 = student22.getStudentId();
        java.lang.String str28 = student22.getMajor();
        java.lang.String str29 = student22.getStudentId();
        business.Student student34 = new business.Student("", "", "", (int) (short) 0);
        student34.addCompletedCourse("");
        java.lang.String str37 = student34.toString();
        java.lang.String str38 = student34.getStudentId();
        business.Student student43 = new business.Student("hi!", "", "hi!", 0);
        student43.setName(" -  (, Class of 10)");
        student43.setMajor("");
        java.lang.String str48 = student43.getMajor();
        business.Student student53 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList54 = student53.getCompletedCourses();
        student43.setCompletedCourses(strList54);
        student34.setCompletedCourses(strList54);
        student22.setCompletedCourses(strList54);
        student4.setCompletedCourses(strList54);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " -  (, Class of 0)" + "'", str37, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strList54);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        student4.setMajor(" - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str42, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        java.lang.String str7 = student4.toString();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str6, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        business.Student student11 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        java.util.List<java.lang.String> strList14 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setEnrollmentYear((int) (byte) -1);
        java.lang.String str18 = student4.toString();
        student4.addCompletedCourse("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! (, Class of -1)" + "'", str18, " - hi! (, Class of -1)");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        business.Student student4 = new business.Student(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)", " - hi! (, Class of 100) - hi! - hi! (hi!, Class of 100) (hi!, Class of 35)", " -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)", (int) (short) 0);
        student4.setEnrollmentYear((int) 'a');
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 0)" + "'", str12, " -  (, Class of 0)");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.getStudentId();
        java.lang.String str17 = student4.toString();
        business.Student student22 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  (, Class of 10)", "", (int) (short) 10);
        business.Student student27 = new business.Student("", "", "", (int) (short) 0);
        student27.setEnrollmentYear(0);
        business.Student student34 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int35 = student34.getEnrollmentYear();
        student34.setMajor("hi!");
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str43 = student42.getName();
        student42.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList46 = student42.getCompletedCourses();
        java.lang.String str47 = student42.getName();
        business.Student student52 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student52.setStudentId("hi! -  (hi!, Class of 0)");
        int int55 = student52.getEnrollmentYear();
        java.util.List<java.lang.String> strList56 = student52.getCompletedCourses();
        student42.setCompletedCourses(strList56);
        student34.setCompletedCourses(strList56);
        student27.setCompletedCourses(strList56);
        student22.setCompletedCourses(strList56);
        business.Student student65 = new business.Student("hi!", "", "hi!", 0);
        student65.setName(" -  (, Class of 10)");
        student65.setEnrollmentYear((int) '#');
        java.lang.String str70 = student65.getMajor();
        java.util.List<java.lang.String> strList71 = student65.getCompletedCourses();
        student22.setCompletedCourses(strList71);
        student4.setCompletedCourses(strList71);
        student4.addCompletedCourse("");
        java.lang.String str76 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str13, "hi! -  -  (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)", " - hi! (, Class of 100)", " - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)", 52);
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.toString();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 100)", " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)", 100);
        student4.setEnrollmentYear((int) (short) 10);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.getStudentId();
        java.lang.String str17 = student4.toString();
        business.Student student22 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  (, Class of 10)", "", (int) (short) 10);
        business.Student student27 = new business.Student("", "", "", (int) (short) 0);
        student27.setEnrollmentYear(0);
        business.Student student34 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int35 = student34.getEnrollmentYear();
        student34.setMajor("hi!");
        business.Student student42 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str43 = student42.getName();
        student42.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList46 = student42.getCompletedCourses();
        java.lang.String str47 = student42.getName();
        business.Student student52 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student52.setStudentId("hi! -  (hi!, Class of 0)");
        int int55 = student52.getEnrollmentYear();
        java.util.List<java.lang.String> strList56 = student52.getCompletedCourses();
        student42.setCompletedCourses(strList56);
        student34.setCompletedCourses(strList56);
        student27.setCompletedCourses(strList56);
        student22.setCompletedCourses(strList56);
        business.Student student65 = new business.Student("hi!", "", "hi!", 0);
        student65.setName(" -  (, Class of 10)");
        student65.setEnrollmentYear((int) '#');
        java.lang.String str70 = student65.getMajor();
        java.util.List<java.lang.String> strList71 = student65.getCompletedCourses();
        student22.setCompletedCourses(strList71);
        student4.setCompletedCourses(strList71);
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList76 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList76);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) -1);
        int int8 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  - hi! (, Class of 0) (, Class of 100)");
        java.lang.String str11 = student4.getName();
        business.Student student16 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str17 = student16.getName();
        java.util.List<java.lang.String> strList18 = student16.getCompletedCourses();
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        student16.setCompletedCourses(strList24);
        student16.setName(" - hi! (, Class of 0)");
        java.lang.String str28 = student16.getName();
        business.Student student33 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str34 = student33.getName();
        java.lang.String str35 = student33.getName();
        java.lang.String str36 = student33.getStudentId();
        java.util.List<java.lang.String> strList37 = student33.getCompletedCourses();
        student16.setCompletedCourses(strList37);
        student4.setCompletedCourses(strList37);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " - hi! (, Class of 0)" + "'", str28, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getMajor();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        int int12 = student4.getEnrollmentYear();
        java.lang.String str13 = student4.getStudentId();
        java.lang.String str14 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setEnrollmentYear(35);
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        java.lang.String str10 = student4.toString();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 35)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 35)");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! -  (, Class of 100)" + "'", str22, "hi! -  (, Class of 100)");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.getMajor();
        student4.addCompletedCourse("hi!");
        student4.setName("");
        java.lang.String str14 = student4.getMajor();
        student4.setStudentId("");
        student4.addCompletedCourse("hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        student4.setName("hi! -  -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100) (, Class of 100)");
        java.lang.String str20 = student4.toString();
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " - hi! -  -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100) (, Class of 100) (, Class of 0)" + "'", str20, " - hi! -  -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100) (, Class of 100) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        business.Student student20 = new business.Student(" - hi! (hi!, Class of 52)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " -  (, Class of 10)", 10);
        java.lang.String str21 = student20.toString();
        java.lang.String str22 = student20.getName();
        business.Student student27 = new business.Student("hi!", "", "hi!", 0);
        student27.addCompletedCourse("");
        java.lang.String str30 = student27.getName();
        student27.addCompletedCourse(" -  (, Class of 100)");
        java.lang.String str33 = student27.getStudentId();
        java.util.List<java.lang.String> strList34 = student27.getCompletedCourses();
        student20.setCompletedCourses(strList34);
        student4.setCompletedCourses(strList34);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str21, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str22, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        student4.setStudentId("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        java.util.List<java.lang.String> strList27 = null;
        student4.setCompletedCourses(strList27);
        java.lang.Class<?> wildcardClass29 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        student9.setName(" -  (, Class of 10)");
        student9.setMajor("");
        java.lang.String str14 = student9.getMajor();
        java.lang.String str15 = student9.getName();
        java.util.List<java.lang.String> strList16 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList16);
        java.lang.String str18 = student4.toString();
        java.lang.String str19 = student4.getStudentId();
        java.lang.String str20 = student4.getName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str18, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 0)", (int) (short) 10);
        student4.setName(" - hi! (, Class of 100)");
        student4.setEnrollmentYear((-1));
        int int9 = student4.getEnrollmentYear();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str12 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str12, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        int int13 = student4.getEnrollmentYear();
        java.lang.String str14 = student4.getMajor();
        java.lang.String str15 = student4.toString();
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str21 = student20.getName();
        java.util.List<java.lang.String> strList22 = student20.getCompletedCourses();
        business.Student student27 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList28 = student27.getCompletedCourses();
        student20.setCompletedCourses(strList28);
        student20.setName(" - hi! (, Class of 0)");
        java.lang.String str32 = student20.getName();
        business.Student student37 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList38 = student37.getCompletedCourses();
        student37.setName("hi!");
        student37.addCompletedCourse("");
        student37.setEnrollmentYear((int) (short) 100);
        java.lang.String str45 = student37.getName();
        java.util.List<java.lang.String> strList46 = student37.getCompletedCourses();
        student20.setCompletedCourses(strList46);
        int int48 = student20.getEnrollmentYear();
        java.util.List<java.lang.String> strList49 = student20.getCompletedCourses();
        student20.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        java.util.List<java.lang.String> strList52 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList52);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! (, Class of 0)" + "'", str15, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " - hi! (, Class of 0)" + "'", str32, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList52);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.toString();
        student4.setMajor("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (, Class of -1)" + "'", str8, " - hi! (, Class of -1)");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        java.lang.String str25 = student4.getName();
        int int26 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " - hi! (, Class of 100)" + "'", str25, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        java.lang.String str19 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str17, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str18, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 97)" + "'", str19, "hi! -  (hi!, Class of 97)");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        java.lang.String str24 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str23, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str24, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getName();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        business.Student student4 = new business.Student("hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 100) (, Class of -1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", (int) (byte) -1);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        java.util.List<java.lang.String> strList40 = student4.getCompletedCourses();
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
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        student4.setName(" -  (, Class of 10)");
        java.lang.String str7 = student4.getName();
        student4.setEnrollmentYear(10);
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)", "", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", 32);
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        student4.setStudentId(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str9 = student4.getName();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        business.Student student4 = new business.Student(" -  - hi! (, Class of 0) (, Class of 100)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (, Class of 0), Class of 10)", (int) (short) -1);
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getName();
        student4.setEnrollmentYear(1);
        int int11 = student4.getEnrollmentYear();
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setMajor("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)");
        student4.addCompletedCourse(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        student4.setName("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        java.lang.String str11 = student4.getName();
        int int12 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.lang.String str15 = student4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)" + "'", str11, "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)" + "'", str15, "hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        business.Student student4 = new business.Student("", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", "hi!", (int) ' ');
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.getMajor();
        student4.setName(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) ( -  (, Class of 0), Class of -1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        business.Student student4 = new business.Student("hi! -  ( -  (, Class of 0), Class of 0)", " -  (hi! -  (hi!, Class of 0), Class of 0)", "", (int) 'a');
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getName();
        java.util.List<java.lang.String> strList14 = student4.getCompletedCourses();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str12, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(strList14);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.addCompletedCourse(" -  (, Class of 100)");
        int int10 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        business.Student student4 = new business.Student(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)", "hi! -  ( -  (, Class of 0), Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) (byte) -1);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str7, "hi! -  ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        student9.setEnrollmentYear((int) '4');
        java.util.List<java.lang.String> strList12 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        java.lang.String str14 = student4.toString();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 52)" + "'", str14, "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 52)");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        student4.setName(" - hi! (, Class of -1)");
        java.lang.String str7 = student4.getMajor();
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  - hi! (, Class of -1) ( -  (, Class of 0), Class of 1)" + "'", str8, "hi! -  (hi!, Class of 0) -  - hi! (, Class of -1) ( -  (, Class of 0), Class of 1)");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.addCompletedCourse(" - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)");
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", (int) '#');
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setMajor("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.setStudentId(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1)");
        java.lang.String str13 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1) - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)" + "'", str13, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1) - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        student4.addCompletedCourse("hi! - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35), Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str6, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.getStudentId();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str6, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)", "hi! -  (hi!, Class of 0) -  (, Class of 0)", "hi! -  (hi!, Class of 1)", (int) (byte) -1);
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
        java.lang.String str31 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)", " -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi! -  (, Class of 10), Class of 10)", (int) (short) -1);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        java.lang.String str61 = student4.getStudentId();
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        student4.setEnrollmentYear(10);
        java.lang.String str9 = student4.getMajor();
        student4.setMajor(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        java.lang.String str12 = student4.toString();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)" + "'", str12, "hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student4.setEnrollmentYear((-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str7 = student4.getMajor();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str7, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        business.Student student26 = new business.Student("hi!", "", "hi!", 0);
        student26.setName(" -  (, Class of 10)");
        student26.setEnrollmentYear((int) '#');
        java.lang.String str31 = student26.getMajor();
        java.util.List<java.lang.String> strList32 = student26.getCompletedCourses();
        student26.setMajor(" - hi! (hi!, Class of 52)");
        student26.setEnrollmentYear((int) (byte) 1);
        business.Student student41 = new business.Student("hi!", "", "hi!", 0);
        student41.setName(" -  (, Class of 10)");
        student41.setEnrollmentYear((int) '#');
        java.lang.String str46 = student41.getMajor();
        int int47 = student41.getEnrollmentYear();
        java.util.List<java.lang.String> strList48 = student41.getCompletedCourses();
        student26.setCompletedCourses(strList48);
        student4.setCompletedCourses(strList48);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  - hi! (, Class of 0) (, Class of 10)", "hi! -  (, Class of 0) -  (, Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", (int) (short) 100);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        student4.setEnrollmentYear(10);
        java.lang.String str9 = student4.getMajor();
        student4.setMajor(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        student4.setStudentId("hi! - hi! (hi!, Class of 100)");
        java.lang.String str14 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! (hi!, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)" + "'", str14, "hi! - hi! (hi!, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        student4.setStudentId(" -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)");
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
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 0)" + "'", str21, " - hi! (, Class of 0)");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str12 = student4.getName();
        student4.setStudentId(" - hi! (, Class of -1)");
        student4.addCompletedCourse(" -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str17 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str16 = student4.getName();
        java.lang.String str17 = student4.getName();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str17, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", " - hi! (, Class of 0)", (int) (byte) -1);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        student4.setName("hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        student4.setStudentId("hi!");
        student4.setMajor("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 97)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        int int14 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", "hi! - hi! (hi!, Class of 100)", "", 52);
        student4.addCompletedCourse(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        business.Student student4 = new business.Student("", " - hi! (, Class of 0)", " -  (, Class of 0)", (int) (short) 0);
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        student4.addCompletedCourse(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        business.Student student15 = new business.Student("hi!", "", "", (int) (byte) 100);
        student15.setName(" -  (, Class of 10)");
        java.lang.String str18 = student15.getName();
        int int19 = student15.getEnrollmentYear();
        business.Student student24 = new business.Student(" - hi! (hi!, Class of 52)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " -  (, Class of 10)", 10);
        java.lang.String str25 = student24.toString();
        java.lang.String str26 = student24.getName();
        business.Student student31 = new business.Student("hi!", "", "hi!", 0);
        student31.addCompletedCourse("");
        java.lang.String str34 = student31.getName();
        student31.addCompletedCourse(" -  (, Class of 100)");
        java.lang.String str37 = student31.getStudentId();
        java.util.List<java.lang.String> strList38 = student31.getCompletedCourses();
        student24.setCompletedCourses(strList38);
        student15.setCompletedCourses(strList38);
        student4.setCompletedCourses(strList38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -  (, Class of 10)" + "'", str18, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str25, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str26, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        business.Student student4 = new business.Student(" -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)", "hi! - hi! -  -  (, Class of 10) (, Class of 1) (, Class of 1)", " -  (, Class of 0)", 52);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 0)");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        student4.addCompletedCourse("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setStudentId(" -  (, Class of 0)");
        student4.setStudentId(" -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setStudentId(" - hi! (, Class of 100) -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0), Class of 52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        student4.setStudentId(" - hi! (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        java.util.List<java.lang.String> strList7 = null;
        student4.setCompletedCourses(strList7);
        student4.setName("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        java.lang.String str11 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        java.lang.String str29 = student4.toString();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str16, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str17, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)" + "'", str26, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " - hi! (, Class of 100)" + "'", str27, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)" + "'", str29, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        java.lang.String str29 = student4.toString();
        java.util.List<java.lang.String> strList30 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)" + "'", str28, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)" + "'", str29, " -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = student4.getName();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.String str14 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        business.Student student4 = new business.Student(" - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)", "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) ( -  (, Class of 10), Class of 100)", " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)", (int) (short) -1);
        student4.setMajor(" - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (, Class of 0)");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setName(" - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        student4.addCompletedCourse(" -  (, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (, Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        java.lang.String str12 = student4.getMajor();
        business.Student student17 = new business.Student("hi!", "", "hi!", 0);
        student17.setName(" -  (, Class of 10)");
        student17.setMajor("");
        student17.setMajor("hi! -  (hi!, Class of 0)");
        student17.setName("");
        student17.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str28 = student17.toString();
        java.util.List<java.lang.String> strList29 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList29);
        student4.setEnrollmentYear((int) (short) 100);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0)" + "'", str10, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)" + "'", str28, "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.lang.String str5 = student4.getStudentId();
        int int6 = student4.getEnrollmentYear();
        java.lang.String str7 = student4.getMajor();
        java.lang.Class<?> wildcardClass8 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", 10);
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.lang.String str7 = student4.toString();
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)" + "'", str7, " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 100)" + "'", str8, " -  (, Class of 100)");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        business.Student student25 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.util.List<java.lang.String> strList26 = student25.getCompletedCourses();
        business.Student student31 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str32 = student31.getName();
        java.util.List<java.lang.String> strList33 = student31.getCompletedCourses();
        student25.setCompletedCourses(strList33);
        java.util.List<java.lang.String> strList35 = student25.getCompletedCourses();
        student4.setCompletedCourses(strList35);
        java.lang.Class<?> wildcardClass37 = strList35.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getName();
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str15, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", 10);
        java.lang.String str5 = student4.getMajor();
        student4.setStudentId("hi! -  (, Class of 100)");
        student4.setEnrollmentYear(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str5, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        student4.setName("hi! -  (, Class of 0) -  (, Class of 100)");
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.setEnrollmentYear(0);
        java.lang.String str7 = student4.getStudentId();
        student4.addCompletedCourse(" -  (, Class of 0)");
        student4.setStudentId(" - hi! (, Class of -1)");
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        java.lang.String str43 = student4.getStudentId();
        int int44 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str42, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str43, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str29 = student28.getName();
        student28.setEnrollmentYear(10);
        student28.setStudentId("hi!");
        business.Student student38 = new business.Student("", "hi!", "", 100);
        java.lang.String str39 = student38.getMajor();
        java.lang.String str40 = student38.toString();
        java.util.List<java.lang.String> strList41 = student38.getCompletedCourses();
        student28.setCompletedCourses(strList41);
        student28.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.lang.String str45 = student28.toString();
        business.Student student50 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        student50.setCompletedCourses((java.util.List<java.lang.String>) strList55);
        int int58 = student50.getEnrollmentYear();
        java.lang.String str59 = student50.getMajor();
        int int60 = student50.getEnrollmentYear();
        student50.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1)");
        student50.setMajor("hi! -  (hi!, Class of 0)");
        student50.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str67 = student50.toString();
        student50.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList70 = student50.getCompletedCourses();
        student28.setCompletedCourses(strList70);
        business.Student student76 = new business.Student("hi!", "", "hi!", 0);
        student76.addCompletedCourse("");
        java.lang.String str79 = student76.getName();
        student76.setMajor("");
        java.lang.String str82 = student76.getMajor();
        java.util.List<java.lang.String> strList83 = student76.getCompletedCourses();
        student28.setCompletedCourses(strList83);
        student4.setCompletedCourses(strList83);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " - hi! (, Class of 100)" + "'", str40, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)" + "'", str45, "hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str67, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(strList83);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 10)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", 10);
        java.lang.String str5 = student4.toString();
        student4.setEnrollmentYear(97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)" + "'", str5, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1) (, Class of 100)", " -  - hi! (, Class of 0) (, Class of 0)", " -  ( -  (, Class of 0), Class of 0)", 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str7 = student4.getName();
        student4.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        student4.addCompletedCourse(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.lang.String str14 = student4.getMajor();
        business.Student student19 = new business.Student("", "hi!", "", 100);
        java.lang.String str20 = student19.getName();
        java.lang.String str21 = student19.toString();
        int int22 = student19.getEnrollmentYear();
        student19.setMajor("hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
        student19.setEnrollmentYear((int) (short) 100);
        java.util.List<java.lang.String> strList27 = student19.getCompletedCourses();
        student4.setCompletedCourses(strList27);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 100)" + "'", str21, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setStudentId("");
        java.lang.String str16 = student4.getMajor();
        student4.setMajor(" - hi! (, Class of 100) -  - hi! (, Class of 0) (, Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.getMajor();
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getName();
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        student15.setCompletedCourses((java.util.List<java.lang.String>) strList20);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList20);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str10, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        student4.addCompletedCourse("");
        student4.setStudentId("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str13 = student4.getStudentId();
        java.lang.String str14 = student4.getStudentId();
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)" + "'", str13, "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)" + "'", str14, "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        business.Student student4 = new business.Student(" - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (, Class of 0)", " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)", (int) (byte) -1);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.toString();
        java.lang.String str14 = student4.getStudentId();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 10)" + "'", str12, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0)" + "'", str13, "hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        business.Student student18 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", "", (int) (byte) 100);
        java.lang.String str19 = student18.getName();
        student18.setName(" -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) (, Class of 0)");
        java.util.List<java.lang.String> strList22 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList22);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)" + "'", str19, " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", " - hi! (, Class of -1) -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)", (-1));
        student4.setEnrollmentYear(0);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        student4.setName(" -  (hi!, Class of 100) -  (, Class of 10)");
        java.lang.String str22 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str18, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0)" + "'", str19, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (hi!, Class of 100) -  (, Class of 10)" + "'", str22, " -  (hi!, Class of 100) -  (, Class of 10)");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList12 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList12);
        student4.setName(" - hi! (, Class of 0)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        java.lang.String str18 = student4.getName();
        java.lang.String str19 = student4.getMajor();
        java.lang.String str20 = student4.getStudentId();
        student4.addCompletedCourse("");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  (, Class of 10)" + "'", str19, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 0)" + "'", str20, " -  (, Class of 0)");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        java.util.List<java.lang.String> strList7 = null;
        student4.setCompletedCourses(strList7);
        java.lang.String str9 = student4.getStudentId();
        student4.setName("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str9, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.toString();
        student4.addCompletedCourse(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (, Class of -1)" + "'", str8, " - hi! (, Class of -1)");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        business.Student student4 = new business.Student("", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0)", (int) (short) 0);
        student4.addCompletedCourse(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str29 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str29, " - hi! (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        student4.setName(" -  (, Class of 10)");
        java.lang.String str7 = student4.getName();
        student4.setMajor("hi! -  (, Class of 100)");
        java.lang.String str10 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 10)" + "'", str7, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (, Class of 100)" + "'", str10, "hi! -  (, Class of 100)");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        business.Student student4 = new business.Student("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", 35);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        java.util.List<java.lang.String> strList6 = null;
        student4.setCompletedCourses(strList6);
        student4.setEnrollmentYear((int) (byte) 10);
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str11, " - hi! (hi!, Class of 52)");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        business.Student student4 = new business.Student("", " -  (hi! -  (hi!, Class of 0), Class of 0)", " -  (, Class of 100)", 52);
        java.lang.String str5 = student4.getStudentId();
        business.Student student10 = new business.Student("", "hi!", "", 100);
        java.lang.String str11 = student10.getName();
        java.lang.String str12 = student10.toString();
        business.Student student17 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList18 = student17.getCompletedCourses();
        java.util.List<java.lang.String> strList19 = student17.getCompletedCourses();
        java.util.List<java.lang.String> strList20 = student17.getCompletedCourses();
        student10.setCompletedCourses(strList20);
        student4.setCompletedCourses(strList20);
        java.lang.String str23 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 100)" + "'", str12, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 100)" + "'", str23, " -  (, Class of 100)");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        java.lang.String str25 = student4.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  -  (, Class of 10) ( -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100), Class of 0)" + "'", str25, "hi! -  -  (, Class of 10) ( -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100), Class of 0)");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        int int13 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        student4.setEnrollmentYear(97);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.toString();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getName();
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        student15.setName("hi!");
        student15.addCompletedCourse("");
        java.lang.String str21 = student15.toString();
        java.lang.String str22 = student15.getStudentId();
        java.lang.String str23 = student15.getMajor();
        java.util.List<java.lang.String> strList24 = student15.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str28 = student4.toString();
        java.lang.String str29 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 100)" + "'", str6, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - hi! (, Class of 0)" + "'", str21, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " - hi! (, Class of 1)" + "'", str28, " - hi! (, Class of 1)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " - hi! (, Class of 1)" + "'", str29, " - hi! (, Class of 1)");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (, Class of -1)");
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        int int10 = student4.getEnrollmentYear();
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" - hi! (hi!, Class of 52)");
        student4.setEnrollmentYear((int) (short) 0);
        student4.setStudentId("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 100) (, Class of -1)", " - hi! -  (hi!, Class of 0) (, Class of 100)", 10);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 35)", " - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100)", "hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)", 35);
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 35) -  - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100) (hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35), Class of 35)" + "'", str5, "hi! -  (hi!, Class of 35) -  - hi! ( - hi! ( - hi! (hi!, Class of 52), Class of -1), Class of 100) (hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35), Class of 35)");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        java.lang.String str22 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", (int) (byte) 0);
        business.Student student9 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str10 = student9.getStudentId();
        student9.setMajor("");
        student9.setStudentId(" - hi! (, Class of 0)");
        java.util.List<java.lang.String> strList15 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList15);
        java.lang.String str17 = student4.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 0)" + "'", str17, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
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
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)");
        student4.addCompletedCourse("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 10)" + "'", str29, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        student4.setEnrollmentYear((int) (byte) 0);
        java.lang.String str37 = student4.getName();
        java.lang.String str38 = student4.getName();
        java.lang.String str39 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 0)" + "'", str39, " - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 0)");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        business.Student student4 = new business.Student(" -  - hi! (, Class of -1) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", (int) 'a');
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.setName(" - hi! (, Class of 100)");
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        business.Student student4 = new business.Student(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", "hi! -  -  (, Class of 10) ( -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100), Class of 0)", "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)", 52);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        java.lang.String str61 = student4.getMajor();
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getMajor();
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
        java.lang.String str29 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " - hi! (, Class of 0)" + "'", str24, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -  - hi! (, Class of 0) (, Class of 0)" + "'", str25, " -  - hi! (, Class of 0) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getStudentId();
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        student4.setEnrollmentYear((int) (short) 10);
        student4.setEnrollmentYear(100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        java.lang.String str16 = student4.toString();
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str16, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        java.lang.String str8 = student4.getMajor();
        business.Student student13 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str14 = student13.getName();
        java.util.List<java.lang.String> strList15 = student13.getCompletedCourses();
        business.Student student20 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList21 = student20.getCompletedCourses();
        student13.setCompletedCourses(strList21);
        student13.setName(" - hi! (, Class of 0)");
        student13.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        java.lang.String str27 = student13.getStudentId();
        java.util.List<java.lang.String> strList28 = student13.getCompletedCourses();
        student4.setCompletedCourses(strList28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str27, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        business.Student student4 = new business.Student("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0)", "", " -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)", 0);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 10) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) (hi!, Class of 0)" + "'", str12, " -  (, Class of 10) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) (hi!, Class of 0)");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setStudentId("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        java.lang.String str15 = student4.toString();
        student4.setEnrollmentYear(0);
        student4.setName(" -  (, Class of 10) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str15, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)", "", (int) (byte) 100);
        student4.setMajor("hi! - hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0) (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.toString();
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        student23.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str27 = student23.getName();
        student23.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        student23.setEnrollmentYear((int) 'a');
        java.util.List<java.lang.String> strList32 = student23.getCompletedCourses();
        student23.setMajor(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1)");
        java.util.List<java.lang.String> strList35 = student23.getCompletedCourses();
        student4.setCompletedCourses(strList35);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str27, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        java.lang.String str45 = student4.toString();
        java.util.List<java.lang.String> strList46 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (, Class of -1)");
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)" + "'", str45, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        business.Student student4 = new business.Student("hi! -  ( -  (, Class of 0), Class of 0)", " - hi! (, Class of 0)", " - hi! (, Class of 100)", 0);
        java.lang.String str5 = student4.getName();
        business.Student student10 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str11 = student10.getName();
        student10.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList14 = student10.getCompletedCourses();
        java.lang.String str15 = student10.getName();
        business.Student student20 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student20.setStudentId("hi! -  (hi!, Class of 0)");
        int int23 = student20.getEnrollmentYear();
        java.util.List<java.lang.String> strList24 = student20.getCompletedCourses();
        student10.setCompletedCourses(strList24);
        business.Student student30 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 0)", (int) (byte) 10);
        java.lang.String str31 = student30.getStudentId();
        student30.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student30.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        java.util.List<java.lang.String> strList36 = student30.getCompletedCourses();
        student10.setCompletedCourses(strList36);
        student4.setCompletedCourses(strList36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strList36);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi!, Class of 100)" + "'", str8, " -  (hi!, Class of 100)");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        java.lang.Class<?> wildcardClass18 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)" + "'", str15, " - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", (-1));
        student4.setStudentId("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setName(" - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        student4.setName("");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        business.Student student4 = new business.Student("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)", " - hi! (, Class of -1)", "hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)", 35);
        java.lang.String str5 = student4.toString();
        student4.setMajor("hi! -  -  ( -  (, Class of 0), Class of 0) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0) -  - hi! (, Class of -1) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 35)" + "'", str5, "hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0) -  - hi! (, Class of -1) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 35)");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        java.lang.String str10 = student4.getStudentId();
        student4.setName("hi! -  (, Class of 100)");
        student4.setName(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        student4.setStudentId(" - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 97)", "hi! -  -  (, Class of 10) (, Class of 1)", 1);
        student4.setEnrollmentYear((int) (byte) 100);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        student4.setMajor(" -  (, Class of 10) - hi! -  (hi!, Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10), Class of 0)");
        student4.setStudentId(" -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)");
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        int int10 = student4.getEnrollmentYear();
        business.Student student15 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList16 = student15.getCompletedCourses();
        student15.setStudentId("");
        java.lang.String str19 = student15.getStudentId();
        business.Student student24 = new business.Student("hi!", "", "hi!", 0);
        student24.setName(" -  (, Class of 10)");
        student24.setEnrollmentYear((int) '#');
        java.lang.String str29 = student24.getMajor();
        student24.addCompletedCourse("hi!");
        student24.setName("");
        java.lang.String str34 = student24.getStudentId();
        student24.setMajor(" -  (hi!, Class of 10)");
        java.util.List<java.lang.String> strList37 = student24.getCompletedCourses();
        student15.setCompletedCourses(strList37);
        student4.setCompletedCourses(strList37);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        business.Student student4 = new business.Student(" -  (, Class of 0)", " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of -1) (, Class of 0)", (int) '4');
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getName();
        student4.setName(" -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)", "", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", 32);
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)", " - hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) (, Class of 1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)", (int) (byte) -1);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str5, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getName();
        student4.setStudentId("hi! -  (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 1)");
        student4.setStudentId("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (hi!, Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 10)", " -  (hi!, Class of 100) -  (, Class of 10)", "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 52)", 0);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)" + "'", str10, " - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (, Class of 0)" + "'", str11, " - hi! (, Class of 0)");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", (int) (byte) 0);
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.toString();
        student4.setName(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 0)" + "'", str6, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", " - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (byte) -1);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 1), Class of -1)" + "'", str6, "hi! -  -  (, Class of 10) (, Class of 1) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 1), Class of -1)");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)", " -  - hi! (, Class of 0) (, Class of 0)", (int) '4');
        java.lang.String str5 = student4.getName();
        int int6 = student4.getEnrollmentYear();
        int int7 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        student4.setMajor("hi! -  (hi!, Class of 0) - hi! -  -  (, Class of 10) (, Class of 1) ( -  (, Class of 10), Class of 100)");
        student4.setMajor(" -  (, Class of 10) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) -  -  (, Class of 10) (, Class of 100)", " - hi! (, Class of 32)", " -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)", (int) (short) 10);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        business.Student student4 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) ' ');
        student4.setStudentId("");
        student4.setEnrollmentYear(0);
        int int12 = student4.getEnrollmentYear();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", 35);
        java.lang.String str5 = student4.toString();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
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
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)");
        java.lang.String str36 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 10)" + "'", str29, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        int int21 = student4.getEnrollmentYear();
        student4.setMajor(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        student4.setStudentId(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)");
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
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", "", (int) (byte) 10);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        student9.setCompletedCourses((java.util.List<java.lang.String>) strList14);
        int int17 = student9.getEnrollmentYear();
        student9.setMajor(" -  (, Class of 0)");
        int int20 = student9.getEnrollmentYear();
        student9.setStudentId("hi!");
        java.lang.String str23 = student9.toString();
        java.util.List<java.lang.String> strList24 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        java.lang.Class<?> wildcardClass26 = strList24.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str23, "hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) ' ');
        student4.addCompletedCourse("");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setStudentId(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        java.lang.String str12 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 0)" + "'", str12, " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 0)");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        student4.addCompletedCourse("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35) (hi! -  (, Class of 0), Class of 10)");
        student4.addCompletedCourse(" -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100)");
        java.lang.String str26 = student4.getStudentId();
        student4.setStudentId(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35) -  (hi! - hi! (hi!, Class of 100), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 0)" + "'", str21, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 0)" + "'", str26, " -  (, Class of 0)");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        java.lang.String str25 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        business.Student student4 = new business.Student("hi! -  (, Class of 1)", " - hi! (hi!, Class of 52)", " -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)", (int) (short) -1);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        student4.addCompletedCourse("hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 10)" + "'", str26, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " -  (, Class of 0)" + "'", str31, " -  (, Class of 0)");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        student4.setEnrollmentYear((int) (short) -1);
        int int7 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str10 = student4.getStudentId();
        student4.setMajor(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        student4.setMajor(" - hi! (hi!, Class of 52)");
        java.lang.String str15 = student4.toString();
        java.lang.String str16 = student4.getMajor();
        java.lang.String str17 = student4.getName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! ( - hi! (hi!, Class of 52), Class of -1)" + "'", str15, " - hi! ( - hi! (hi!, Class of 52), Class of -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str16, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.addCompletedCourse(" -  (, Class of 0)");
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str19 = student4.getStudentId();
        java.lang.Class<?> wildcardClass20 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  (, Class of 100)");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (, Class of 100)" + "'", str8, "hi! -  (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  (, Class of 100)" + "'", str9, "hi! -  (, Class of 100)");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.util.List<java.lang.String> strList23 = student4.getCompletedCourses();
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear(1);
        student4.setMajor("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        student4.setMajor("hi! -  (, Class of 100)");
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str10 = student4.toString();
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)" + "'", str10, " -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getStudentId();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        business.Student student17 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str18 = student17.getName();
        student17.setEnrollmentYear(10);
        student17.setStudentId("hi!");
        business.Student student27 = new business.Student("", "hi!", "", 100);
        java.lang.String str28 = student27.getMajor();
        java.lang.String str29 = student27.toString();
        java.util.List<java.lang.String> strList30 = student27.getCompletedCourses();
        student17.setCompletedCourses(strList30);
        student17.setName("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        student17.setMajor(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        business.Student student40 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList41 = student40.getCompletedCourses();
        student40.setStudentId("");
        int int44 = student40.getEnrollmentYear();
        java.lang.String str45 = student40.getMajor();
        student40.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        business.Student student52 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList53 = student52.getCompletedCourses();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        student52.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        int int60 = student52.getEnrollmentYear();
        student52.setMajor(" -  (, Class of 0)");
        int int63 = student52.getEnrollmentYear();
        student52.setStudentId("hi!");
        business.Student student70 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList71 = student70.getCompletedCourses();
        student70.setName("hi!");
        student70.addCompletedCourse("");
        java.util.List<java.lang.String> strList76 = student70.getCompletedCourses();
        java.lang.String str77 = student70.getStudentId();
        java.lang.String str78 = student70.toString();
        business.Student student83 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList84 = student83.getCompletedCourses();
        student70.setCompletedCourses(strList84);
        business.Student student90 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList91 = student90.getCompletedCourses();
        student70.setCompletedCourses(strList91);
        student52.setCompletedCourses(strList91);
        student40.setCompletedCourses(strList91);
        student17.setCompletedCourses(strList91);
        student4.setCompletedCourses(strList91);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " - hi! (, Class of 100)" + "'", str29, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + " - hi! (, Class of 0)" + "'", str78, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(strList91);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        student4.setStudentId(" -  (, Class of 0)");
        student4.setName(" - hi! (, Class of 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", (int) 'a');
        java.lang.String str5 = student4.getStudentId();
        int int6 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str5, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        java.lang.String str27 = student4.getMajor();
        student4.addCompletedCourse(" -  (, Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str27, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        java.lang.String str18 = student4.getName();
        java.lang.String str19 = student4.getMajor();
        java.lang.Class<?> wildcardClass20 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  (, Class of 10)" + "'", str19, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        business.Student student4 = new business.Student(" -  (hi!, Class of 100)", " -  (, Class of 10) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 0)", " -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! (, Class of 0), Class of 0)", (int) (short) 0);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        business.Student student4 = new business.Student("", "hi!", "", 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        student4.setStudentId(" - hi! (, Class of -1)");
        java.lang.String str11 = student4.getName();
        student4.addCompletedCourse("hi! -  (, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", "hi! - hi! -  (, Class of 0) (hi!, Class of 35)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", "", "hi! - hi! (hi!, Class of 35)", (int) (byte) 10);
        student4.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        student4.setStudentId("");
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getStudentId();
        student4.setEnrollmentYear(35);
        student4.setStudentId(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 35)", "hi! -  (hi!, Class of 0)", "hi! -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) (, Class of 0)", (int) ' ');
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        int int38 = student4.getEnrollmentYear();
        java.lang.String str39 = student4.getName();
        java.lang.String str40 = student4.getName();
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str39, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str40, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        business.Student student4 = new business.Student("hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)", " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 100) (hi! -  (hi!, Class of 0), Class of 35)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", 52);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)");
        java.lang.String str9 = student4.getName();
        student4.setName("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0)", (int) (byte) 0);
        java.lang.String str5 = student4.getStudentId();
        student4.setStudentId("hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52)");
        java.lang.String str8 = student4.toString();
        student4.setStudentId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 0)" + "'", str8, "hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) ( - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0), Class of 0)");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        business.Student student20 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int21 = student20.getEnrollmentYear();
        student20.setMajor("hi!");
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str29 = student28.getName();
        student28.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList32 = student28.getCompletedCourses();
        java.lang.String str33 = student28.getName();
        business.Student student38 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student38.setStudentId("hi! -  (hi!, Class of 0)");
        int int41 = student38.getEnrollmentYear();
        java.util.List<java.lang.String> strList42 = student38.getCompletedCourses();
        student28.setCompletedCourses(strList42);
        student20.setCompletedCourses(strList42);
        java.util.List<java.lang.String> strList45 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList45);
        student4.setEnrollmentYear((int) '4');
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        student4.setEnrollmentYear((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str23, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setName(" - hi! (, Class of 100)");
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int13 = student4.getEnrollmentYear();
        int int14 = student4.getEnrollmentYear();
        student4.addCompletedCourse(" -  (, Class of 0) -  ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)", "hi! -  -  (, Class of 10) ( -  (, Class of 100), Class of 1)", (int) ' ');
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
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
        student4.setMajor(" -  ( -  (, Class of 10), Class of 0)");
        student4.setName(" -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 10)" + "'", str21, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " -  (, Class of 10)" + "'", str22, " -  (, Class of 10)");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        student4.setMajor("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        business.Student student4 = new business.Student(" -  - hi! (, Class of -1) (, Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", (int) '4');
        student4.setMajor("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  - hi! (, Class of -1) (, Class of 0)" + "'", str8, " -  - hi! (, Class of -1) (, Class of 0)");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        business.Student student23 = new business.Student("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", " -  (hi!, Class of 10)", " - hi! (hi!, Class of 10)", (int) '#');
        business.Student student28 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList29 = null;
        student28.setCompletedCourses(strList29);
        java.lang.String str31 = student28.getMajor();
        business.Student student36 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList37 = student36.getCompletedCourses();
        student36.setName("hi!");
        student36.addCompletedCourse("");
        java.lang.String str42 = student36.toString();
        java.lang.String str43 = student36.getStudentId();
        java.lang.String str44 = student36.getMajor();
        java.util.List<java.lang.String> strList45 = student36.getCompletedCourses();
        student28.setCompletedCourses(strList45);
        student23.setCompletedCourses(strList45);
        student4.setCompletedCourses(strList45);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " - hi! (, Class of 0)" + "'", str42, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        java.lang.String str14 = student4.getStudentId();
        student4.setEnrollmentYear(35);
        student4.setEnrollmentYear(10);
        int int19 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        int int10 = student4.getEnrollmentYear();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        java.lang.String str13 = student4.getMajor();
        java.lang.String str14 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        student4.setName(" - hi! (, Class of 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", "hi! - hi! -  (, Class of 0) (hi!, Class of 35)", "hi! - hi! (hi!, Class of 35)", (int) (byte) 100);
        student4.setEnrollmentYear(0);
        java.lang.String str7 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str7, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)", " - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) ( - hi! (, Class of 0), Class of 97)", 1);
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)" + "'", str7, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)" + "'", str8, " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 100) -  ( -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100), Class of 10)", "", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", (int) (short) -1);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        business.Student student4 = new business.Student(" -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)", " -  - hi! (, Class of -1) (, Class of 0)", "hi! -  (hi!, Class of 1)", (int) (short) -1);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32) ( - hi! (, Class of 100), Class of 0)");
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", " -  - hi! (, Class of 0) (, Class of 0)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.lang.String str7 = student4.getMajor();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.getName();
        student4.setStudentId(" -  (hi!, Class of 10) - hi! -  (, Class of 100) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (, Class of 0)", " -  (, Class of 10)", (int) 'a');
        java.lang.String str5 = student4.getMajor();
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        java.lang.String str8 = student4.getMajor();
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        business.Student student4 = new business.Student(" -  ( -  (, Class of 0), Class of 0) -  (, Class of 52)", " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (hi!, Class of 10)", " - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 0)", (int) 'a');
        student4.setMajor("hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0)");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        business.Student student4 = new business.Student(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35)", (-1));
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35), Class of -1)" + "'", str5, " - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 35), Class of -1)");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList15);
        student4.setName("hi! -  (hi!, Class of 0)");
        java.lang.String str19 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str19, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " - hi! (, Class of 100)", (int) ' ');
        student4.setEnrollmentYear(35);
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getMajor();
        int int9 = student4.getEnrollmentYear();
        student4.setEnrollmentYear(35);
        student4.setMajor(" -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10), Class of 97)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (, Class of 100)" + "'", str8, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        java.lang.String str8 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) (hi!, Class of 10)" + "'", str8, " -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) (hi!, Class of 10)");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        java.lang.String str13 = student4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str13, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        business.Student student27 = new business.Student("hi!", "", "hi!", 0);
        int int28 = student27.getEnrollmentYear();
        student27.setStudentId("");
        java.lang.String str31 = student27.getMajor();
        java.lang.String str32 = student27.getStudentId();
        java.util.List<java.lang.String> strList33 = student27.getCompletedCourses();
        student4.setCompletedCourses(strList33);
        student4.setStudentId(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        student4.setMajor("");
        java.lang.Class<?> wildcardClass12 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        business.Student student4 = new business.Student("hi! - hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) (, Class of 10)", "", " - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (, Class of 0)", (int) '#');
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        int int98 = student4.getEnrollmentYear();
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
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)");
        java.lang.String str48 = student4.getName();
        int int49 = student4.getEnrollmentYear();
        int int50 = student4.getEnrollmentYear();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str48, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.toString();
        student4.setStudentId("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)" + "'", str5, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10) -  (, Class of 0)", 52);
        student4.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 100) (hi! -  (hi!, Class of 0), Class of 35)");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", " -  - hi! (, Class of 0) (, Class of 100)", "", (int) (byte) 10);
        java.lang.String str5 = student4.getStudentId();
        student4.setEnrollmentYear(1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str5, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        student4.setMajor("hi!");
        java.lang.String str11 = student4.toString();
        int int12 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (hi!, Class of 10)" + "'", str11, " -  (hi!, Class of 10)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)", " -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)", 0);
        java.lang.String str5 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)" + "'", str5, "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", (int) '4');
        student4.setName("hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)");
        student4.setMajor("hi! -  (, Class of 0) -  (, Class of 100)");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        java.lang.String str26 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  (, Class of 10)" + "'", str26, " -  (, Class of 10)");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int14 = student4.getEnrollmentYear();
        int int15 = student4.getEnrollmentYear();
        java.lang.String str16 = student4.getMajor();
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        student4.setMajor(" - hi! (, Class of 35)");
        student4.setName(" -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) ( - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10), Class of 97)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", 100);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)" + "'", str5, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)" + "'", str6, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)" + "'", str7, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 10)" + "'", str20, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getMajor();
        student4.setStudentId("");
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        java.lang.String str24 = student4.getName();
        java.lang.String str25 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! -  (hi!, Class of 0) -  (, Class of 0)" + "'", str25, "hi! -  (hi!, Class of 0) -  (, Class of 0)");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  (, Class of 10)" + "'", str12, " -  (, Class of 10)");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor(" -  (, Class of 10) -  -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        java.lang.String str12 = student4.getMajor();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        student4.setEnrollmentYear((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str12, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setMajor("hi! -  (hi!, Class of 0)");
        java.lang.String str11 = student4.getMajor();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str14 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str14, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)", " -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", 10);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        business.Student student4 = new business.Student("", "hi!", "", 0);
        java.lang.String str5 = student4.getName();
        student4.setName(" -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", "hi! -  (hi!, Class of 0)", " - hi! (, Class of 100)", 0);
        student4.setStudentId(" - hi! (, Class of 100)");
        student4.setEnrollmentYear((int) (byte) 100);
        java.lang.String str9 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        java.lang.String str8 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        business.Student student4 = new business.Student(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", " -  (, Class of 10)", " -  (, Class of 100)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100)" + "'", str5, " -  (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 100), Class of 100)" + "'", str9, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 100), Class of 100)");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        java.lang.String str31 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        business.Student student21 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList22 = student21.getCompletedCourses();
        student21.setName("hi!");
        student21.addCompletedCourse("");
        student21.setEnrollmentYear((int) (short) 100);
        java.lang.String str29 = student21.getName();
        java.util.List<java.lang.String> strList30 = student21.getCompletedCourses();
        student4.setCompletedCourses(strList30);
        java.lang.String str32 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        int int6 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getMajor();
        student4.setEnrollmentYear((int) ' ');
        java.util.List<java.lang.String> strList11 = null;
        student4.setCompletedCourses(strList11);
        java.lang.Class<?> wildcardClass13 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.setMajor("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList11 = student4.getCompletedCourses();
        // The following exception was thrown during execution in test generation
        try {
            student4.addCompletedCourse(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.contains(Object)\" because \"this.completedCourses\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.setName(" - hi! (, Class of 100)");
        int int11 = student4.getEnrollmentYear();
        java.lang.String str12 = student4.getName();
        business.Student student17 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str18 = student17.getName();
        java.lang.String str19 = student17.getName();
        java.lang.String str20 = student17.getStudentId();
        java.lang.String str21 = student17.getName();
        student17.setEnrollmentYear((int) '4');
        student17.setMajor("hi! -  ( -  (, Class of 0), Class of 0)");
        student17.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        business.Student student32 = new business.Student("hi!", "", "hi!", 0);
        student32.setName(" -  (, Class of 10)");
        student32.setMajor("");
        student32.setName(" - hi! (, Class of 100)");
        student32.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int41 = student32.getEnrollmentYear();
        int int42 = student32.getEnrollmentYear();
        java.util.List<java.lang.String> strList43 = student32.getCompletedCourses();
        business.Student student48 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList49 = student48.getCompletedCourses();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        student48.setCompletedCourses((java.util.List<java.lang.String>) strList53);
        int int56 = student48.getEnrollmentYear();
        java.lang.String str57 = student48.getMajor();
        int int58 = student48.getEnrollmentYear();
        student48.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        business.Student student65 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList66 = student65.getCompletedCourses();
        student65.setName("hi!");
        student65.addCompletedCourse("");
        student65.setEnrollmentYear((int) (short) 100);
        java.lang.String str73 = student65.getName();
        java.util.List<java.lang.String> strList74 = student65.getCompletedCourses();
        business.Student student79 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList80 = student79.getCompletedCourses();
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        student79.setCompletedCourses((java.util.List<java.lang.String>) strList84);
        student65.setCompletedCourses((java.util.List<java.lang.String>) strList84);
        student48.setCompletedCourses((java.util.List<java.lang.String>) strList84);
        student32.setCompletedCourses((java.util.List<java.lang.String>) strList84);
        student17.setCompletedCourses((java.util.List<java.lang.String>) strList84);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList84);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 100)" + "'", str12, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        business.Student student12 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str13 = student12.getName();
        java.util.List<java.lang.String> strList14 = student12.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        java.lang.String str16 = student4.getStudentId();
        student4.setStudentId(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.lang.String str19 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) -  (, Class of 0)" + "'", str19, " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) -  (, Class of 0)");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        student4.setMajor(" -  (, Class of 0)");
        java.lang.String str10 = student4.getStudentId();
        java.lang.String str11 = student4.getMajor();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.setEnrollmentYear(32);
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)");
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 0)" + "'", str11, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        business.Student student4 = new business.Student("hi! -  (, Class of 100)", "", " -  (, Class of 0)", (-1));
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        student4.setEnrollmentYear(10);
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.getMajor();
        student4.setStudentId(" -  - hi! (, Class of -1) (, Class of 0)");
        student4.setEnrollmentYear((int) ' ');
        java.lang.String str15 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 0)" + "'", str9, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 0)" + "'", str10, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        java.lang.String str18 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " -  (, Class of 10)" + "'", str11, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 10)" + "'", str15, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        business.Student student4 = new business.Student("hi!", "hi! -  -  (, Class of 10) (, Class of 1)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)", (int) (byte) 1);
        java.lang.String str5 = student4.toString();
        student4.addCompletedCourse("hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)" + "'", str5, " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        java.lang.String str9 = student4.getMajor();
        java.lang.String str10 = student4.toString();
        student4.setMajor(" -  (, Class of 0) - hi! -  (hi!, Class of 0) ( - hi! (, Class of 100), Class of 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10)" + "'", str9, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
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
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        int int13 = student4.getEnrollmentYear();
        business.Student student18 = new business.Student("hi! -  -  (, Class of 10) (, Class of 1)", " - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 1)", (int) (byte) -1);
        student18.setStudentId(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.util.List<java.lang.String> strList21 = student18.getCompletedCourses();
        student4.setCompletedCourses(strList21);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        student4.setName(" -  (, Class of 100) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student9 = new business.Student("hi!", "", "hi!", 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList10);
        student4.setEnrollmentYear((int) (byte) 1);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        java.lang.String str16 = student4.getName();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  -  (, Class of 10) (hi!, Class of 35), Class of 10)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 1)" + "'", str16, "hi! -  -  (, Class of 10) (, Class of 1)");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
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
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        java.lang.String str5 = student4.getStudentId();
        java.lang.String str6 = student4.getStudentId();
        student4.setName(" - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 0)" + "'", str5, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 0)" + "'", str6, " - hi! (, Class of 0)");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", " - hi! (hi!, Class of 52)", " -  (, Class of 100)", (int) (short) 0);
        java.lang.String str5 = student4.getStudentId();
        java.util.List<java.lang.String> strList6 = null;
        student4.setCompletedCourses(strList6);
        student4.setEnrollmentYear((int) (byte) 10);
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 10)" + "'", str11, " - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 10)");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setEnrollmentYear((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        business.Student student4 = new business.Student(" - hi! (, Class of -1)", "hi! - hi! (hi!, Class of 100)", "hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)", 100);
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        business.Student student4 = new business.Student("", "hi! - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (hi!, Class of 0)", "hi! - hi! (hi!, Class of 100)", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! (hi!, Class of 100)" + "'", str6, "hi! - hi! (hi!, Class of 100)");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        business.Student student17 = new business.Student("hi!", "", "hi!", 0);
        student17.setName(" -  (, Class of 10)");
        student17.setMajor("");
        java.lang.String str22 = student17.getMajor();
        java.lang.String str23 = student17.getStudentId();
        java.lang.String str24 = student17.getName();
        java.util.List<java.lang.String> strList25 = student17.getCompletedCourses();
        student17.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str28 = student17.getStudentId();
        java.lang.String str29 = student17.toString();
        student17.setMajor(" -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10), Class of 100)");
        java.util.List<java.lang.String> strList32 = student17.getCompletedCourses();
        student4.setCompletedCourses(strList32);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 10)" + "'", str24, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)" + "'", str29, "hi! -  -  (, Class of 10) ( -  ( -  (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  ( -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52), Class of 0)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", "hi! -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)", (int) (short) 100);
        business.Student student9 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList10 = student9.getCompletedCourses();
        student9.setName("hi!");
        student9.addCompletedCourse("");
        student9.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        java.util.List<java.lang.String> strList17 = student9.getCompletedCourses();
        student4.setCompletedCourses(strList17);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)", (-1));
        java.lang.String str5 = student4.getMajor();
        student4.setEnrollmentYear((int) (byte) 0);
        int int8 = student4.getEnrollmentYear();
        student4.setStudentId(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)" + "'", str5, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        int int7 = student4.getEnrollmentYear();
        java.lang.String str8 = student4.getMajor();
        int int9 = student4.getEnrollmentYear();
        java.lang.String str10 = student4.toString();
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        java.lang.String str15 = student4.getMajor();
        student4.setStudentId(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) -  -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35) ( -  (, Class of 0), Class of -1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (, Class of 10)" + "'", str8, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)" + "'", str15, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str11 = student4.getMajor();
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)");
        student4.setName(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100)");
        student4.setStudentId(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        student4.addCompletedCourse("");
        java.util.List<java.lang.String> strList9 = null;
        student4.setCompletedCourses(strList9);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        int int9 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        student4.setMajor(" -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
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
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        java.lang.String str18 = student4.getName();
        java.lang.String str19 = student4.getMajor();
        java.lang.String str20 = student4.getStudentId();
        student4.setEnrollmentYear((int) ' ');
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " -  (, Class of 10)" + "'", str19, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  (, Class of 0)" + "'", str20, " -  (, Class of 0)");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        business.Student student4 = new business.Student("", "hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", (int) (short) 1);
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)", "hi! - hi! (hi!, Class of 100)", "", 52);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)" + "'", str6, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0)");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        student4.setEnrollmentYear((int) 'a');
        java.lang.String str8 = student4.toString();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 97)" + "'", str8, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 97)");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)", "hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)", (int) (byte) 1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)" + "'", str6, " - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) - hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1), Class of 1)");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setStudentId("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        student4.addCompletedCourse(" - hi! (, Class of 0)");
        java.lang.String str13 = student4.toString();
        student4.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 1) - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)" + "'", str13, "hi! -  -  (, Class of 10) (hi!, Class of 35) -  (, Class of 0)");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", " -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52), Class of 52)", "hi! - hi! -  -  (, Class of 10) (, Class of 1) (hi! -  (hi!, Class of 0) -  - hi! (, Class of 0) ( -  (, Class of 0), Class of 10), Class of 1)", (int) 'a');
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.getName();
        student4.setMajor("");
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        java.lang.String str12 = student4.toString();
        java.util.List<java.lang.String> strList13 = student4.getCompletedCourses();
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 0) - hi! - hi! (hi!, Class of 100) ( -  (, Class of 100), Class of 52)");
        int int16 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  (, Class of 0)" + "'", str12, "hi! -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (hi!, Class of 35)", "hi! -  (hi!, Class of 0)", " -  (, Class of 0)", (int) ' ');
        student4.setMajor("");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1)", "hi! -  -  (, Class of 10) (, Class of 0) - hi! -  (hi!, Class of 97) (hi! -  -  (, Class of 10) (, Class of 1), Class of 100)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", 52);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        student4.setMajor(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        java.lang.String str18 = student4.getName();
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str24 = student23.getName();
        student23.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList27 = student23.getCompletedCourses();
        java.lang.String str28 = student23.getStudentId();
        student23.setName(" - hi! (, Class of 100)");
        business.Student student35 = new business.Student("", "hi!", "", 100);
        student35.setEnrollmentYear((int) (short) -1);
        java.util.List<java.lang.String> strList38 = student35.getCompletedCourses();
        student23.setCompletedCourses(strList38);
        student4.setCompletedCourses(strList38);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        student4.setEnrollmentYear((int) (short) 1);
        student4.setEnrollmentYear((-1));
        java.lang.String str29 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " - hi! (, Class of 0)" + "'", str22, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " - hi! (, Class of 0)" + "'", str29, " - hi! (, Class of 0)");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
        java.util.List<java.lang.String> strList34 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", " -  (hi!, Class of 100)", " - hi! (, Class of 0)", 52);
        java.lang.String str5 = student4.getName();
        business.Student student10 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str11 = student10.getName();
        student10.setEnrollmentYear((int) (short) 100);
        student10.setMajor(" -  (, Class of 10)");
        student10.setEnrollmentYear(100);
        java.lang.String str18 = student10.getName();
        student10.setName(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
        student10.setName(" -  - hi! (, Class of 0) (, Class of 100)");
        student10.setMajor("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        java.util.List<java.lang.String> strList25 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList25);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi!, Class of 100)" + "'", str5, " -  (hi!, Class of 100)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        java.util.List<java.lang.String> strList27 = student4.getCompletedCourses();
        java.lang.String str28 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str10 = student4.toString();
        java.lang.String str11 = student4.getStudentId();
        student4.addCompletedCourse("hi! -  -  (, Class of 100) (hi!, Class of 35)");
        java.lang.Class<?> wildcardClass14 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)" + "'", str10, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str11, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        student4.setStudentId(" -  (, Class of 10)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student("", "", "", (int) (short) 0);
        student14.addCompletedCourse("");
        java.lang.String str17 = student14.toString();
        java.lang.String str18 = student14.getStudentId();
        java.lang.String str19 = student14.getName();
        java.util.List<java.lang.String> strList20 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList20);
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 0)");
        java.lang.String str24 = student4.getStudentId();
        student4.setStudentId(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 0)" + "'", str5, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)" + "'", str9, " -  (, Class of 10) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " -  (, Class of 0)" + "'", str17, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " -  (, Class of 10)" + "'", str24, " -  (, Class of 10)");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        java.lang.String str8 = student4.getName();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        java.lang.String str10 = student4.toString();
        business.Student student15 = new business.Student("hi!", "", "", (int) (byte) 100);
        business.Student student20 = new business.Student("hi!", "", "hi!", 0);
        student20.setName(" -  (, Class of 10)");
        student20.setMajor("");
        java.lang.String[] strArray28 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        student20.setCompletedCourses((java.util.List<java.lang.String>) strList29);
        student15.setCompletedCourses((java.util.List<java.lang.String>) strList29);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList29);
        business.Student student38 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList39 = student38.getCompletedCourses();
        student38.setName("hi!");
        student38.addCompletedCourse("");
        student38.setEnrollmentYear((int) (short) 100);
        java.lang.String str46 = student38.getName();
        java.util.List<java.lang.String> strList47 = student38.getCompletedCourses();
        business.Student student52 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList53 = student52.getCompletedCourses();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        student52.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student38.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList57);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  (, Class of 10)" + "'", str10, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        business.Student student4 = new business.Student(" -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97)", " - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100)", " - hi! (, Class of 32)", 32);
        java.lang.String str5 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97) -  - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100) ( - hi! (, Class of 32), Class of 32)" + "'", str5, " -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97) -  - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100) ( - hi! (, Class of 32), Class of 32)");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", "", "hi!", (int) (short) 10);
        java.lang.String str5 = student4.toString();
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (hi!, Class of 10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)" + "'", str5, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        business.Student student10 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int11 = student10.getEnrollmentYear();
        student10.setMajor("hi!");
        business.Student student18 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str19 = student18.getName();
        student18.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList22 = student18.getCompletedCourses();
        java.lang.String str23 = student18.getName();
        business.Student student28 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student28.setStudentId("hi! -  (hi!, Class of 0)");
        int int31 = student28.getEnrollmentYear();
        java.util.List<java.lang.String> strList32 = student28.getCompletedCourses();
        student18.setCompletedCourses(strList32);
        student10.setCompletedCourses(strList32);
        java.util.List<java.lang.String> strList35 = student10.getCompletedCourses();
        student4.setCompletedCourses(strList35);
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList39 = student4.getCompletedCourses();
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 10)" + "'", str5, " -  (, Class of 10)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.addCompletedCourse("");
        business.Student student11 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str12 = student11.getName();
        java.util.List<java.lang.String> strList13 = student11.getCompletedCourses();
        student4.setCompletedCourses(strList13);
        student4.setName("hi! -  -  (, Class of 10) (, Class of 0)");
        int int17 = student4.getEnrollmentYear();
        java.lang.String str18 = student4.getMajor();
        business.Student student23 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList24 = student23.getCompletedCourses();
        student23.setName("hi!");
        business.Student student31 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str32 = student31.getName();
        java.util.List<java.lang.String> strList33 = student31.getCompletedCourses();
        business.Student student38 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList39 = student38.getCompletedCourses();
        student31.setCompletedCourses(strList39);
        student23.setCompletedCourses(strList39);
        student23.setEnrollmentYear((int) (byte) 100);
        business.Student student48 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList49 = student48.getCompletedCourses();
        student48.setStudentId("");
        business.Student student56 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str57 = student56.getName();
        java.util.List<java.lang.String> strList58 = student56.getCompletedCourses();
        student48.setCompletedCourses(strList58);
        java.lang.String str60 = student48.toString();
        student48.setStudentId("hi! -  (hi!, Class of 0)");
        student48.setMajor("");
        java.util.List<java.lang.String> strList65 = student48.getCompletedCourses();
        student23.setCompletedCourses(strList65);
        student4.setCompletedCourses(strList65);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + " -  (, Class of 0)" + "'", str60, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList65);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", " - hi! -  -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100) (, Class of 100) (, Class of 0)", "", 1);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        java.util.List<java.lang.String> strList21 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList22 = student4.getCompletedCourses();
        student4.setMajor(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)");
        java.util.List<java.lang.String> strList25 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        business.Student student23 = new business.Student("", "hi!", "", 100);
        student23.setEnrollmentYear((int) (short) -1);
        java.util.List<java.lang.String> strList26 = student23.getCompletedCourses();
        java.lang.String str27 = student23.getStudentId();
        business.Student student32 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList33 = student32.getCompletedCourses();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        student32.setCompletedCourses((java.util.List<java.lang.String>) strList37);
        int int40 = student32.getEnrollmentYear();
        java.lang.String str41 = student32.getMajor();
        int int42 = student32.getEnrollmentYear();
        student32.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        business.Student student49 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList50 = student49.getCompletedCourses();
        student49.setName("hi!");
        student49.addCompletedCourse("");
        student49.setEnrollmentYear((int) (short) 100);
        java.lang.String str57 = student49.getName();
        java.util.List<java.lang.String> strList58 = student49.getCompletedCourses();
        business.Student student63 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList64 = student63.getCompletedCourses();
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        student63.setCompletedCourses((java.util.List<java.lang.String>) strList68);
        student49.setCompletedCourses((java.util.List<java.lang.String>) strList68);
        student32.setCompletedCourses((java.util.List<java.lang.String>) strList68);
        student23.setCompletedCourses((java.util.List<java.lang.String>) strList68);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList68);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str18, "hi! -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        business.Student student40 = new business.Student("hi!", "", "hi!", 0);
        student40.setName(" -  (, Class of 10)");
        student40.setMajor("");
        java.lang.String str45 = student40.getMajor();
        business.Student student50 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList51 = student50.getCompletedCourses();
        student40.setCompletedCourses(strList51);
        student4.setCompletedCourses(strList51);
        java.lang.String str54 = student4.getName();
        student4.setName("hi! -  -  (, Class of 10) (, Class of 1)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " -  (, Class of 10)" + "'", str33, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        java.lang.String[] strArray12 = new java.lang.String[] { "", " - hi! (, Class of 100)", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList13);
        business.Student student20 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int21 = student20.getEnrollmentYear();
        student20.setMajor("hi!");
        business.Student student28 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str29 = student28.getName();
        student28.setEnrollmentYear((int) (byte) 10);
        java.util.List<java.lang.String> strList32 = student28.getCompletedCourses();
        java.lang.String str33 = student28.getName();
        business.Student student38 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student38.setStudentId("hi! -  (hi!, Class of 0)");
        int int41 = student38.getEnrollmentYear();
        java.util.List<java.lang.String> strList42 = student38.getCompletedCourses();
        student28.setCompletedCourses(strList42);
        student20.setCompletedCourses(strList42);
        java.util.List<java.lang.String> strList45 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList45);
        java.lang.Class<?> wildcardClass47 = student4.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        business.Student student4 = new business.Student("", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (short) 100);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setStudentId("hi!");
        student4.setStudentId(" -  (hi!, Class of 100)");
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getStudentId();
        java.lang.String str14 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  (hi!, Class of 100)" + "'", str13, " -  (hi!, Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setName(" - hi! (hi!, Class of 52)");
        java.lang.String str15 = student4.getName();
        int int16 = student4.getEnrollmentYear();
        java.util.List<java.lang.String> strList17 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str15, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100)", "hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)", 0);
        java.lang.Class<?> wildcardClass5 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        java.util.List<java.lang.String> strList26 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList27 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        int int12 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 0)");
        business.Student student19 = new business.Student("hi!", "", "hi!", 0);
        student19.setName(" -  (, Class of 10)");
        student19.setEnrollmentYear((int) '#');
        java.lang.String str24 = student19.toString();
        student19.setStudentId("");
        student19.addCompletedCourse(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  - hi! (, Class of 0) ( -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35), Class of 52)");
        student19.setStudentId("");
        business.Student student35 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        java.lang.String str36 = student35.getMajor();
        java.lang.String str37 = student35.getStudentId();
        java.util.List<java.lang.String> strList38 = null;
        student35.setCompletedCourses(strList38);
        business.Student student44 = new business.Student("", "hi!", "", 100);
        java.lang.String str45 = student44.getMajor();
        java.lang.String str46 = student44.toString();
        java.util.List<java.lang.String> strList47 = student44.getCompletedCourses();
        java.lang.String str48 = student44.getName();
        java.lang.String str49 = student44.getStudentId();
        java.util.List<java.lang.String> strList50 = student44.getCompletedCourses();
        student35.setCompletedCourses(strList50);
        student19.setCompletedCourses(strList50);
        student4.setCompletedCourses(strList50);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str24, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " -  (, Class of 0)" + "'", str36, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str37, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + " - hi! (, Class of 100)" + "'", str46, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList50);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        java.lang.String str32 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10)" + "'", str23, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97), Class of 100)" + "'", str32, "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97), Class of 100)");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        business.Student student4 = new business.Student("hi! -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) (hi! -  (hi!, Class of 0), Class of 0)", " - hi! (, Class of 35)", "hi! -  -  (, Class of 100) (hi!, Class of 35)", (int) (short) 10);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        java.lang.String str8 = student4.getName();
        student4.setMajor("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97)");
        student4.setName(" - hi! ( -  ( -  (, Class of 0), Class of 0), Class of 0) - hi! -  (hi!, Class of 97) (hi!, Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str8, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0) -  - hi! (, Class of 100) (, Class of 0)");
        student4.addCompletedCourse("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 0)" + "'", str16, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        student4.setName(" -  - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse(" -  (, Class of 0)");
        int int12 = student4.getEnrollmentYear();
        student4.setName(" -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0)");
        java.lang.String str15 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) (, Class of 10)" + "'", str15, " -  -  (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 0) (, Class of 10)");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        java.lang.String str39 = student4.getMajor();
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10) -  - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97) (hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100), Class of -1) - hi! - hi! (hi!, Class of 35) - hi! -  (hi!, Class of 0) -  (hi!, Class of 10) (hi! -  (hi!, Class of 0), Class of -1) (hi! -  (hi!, Class of 0) -  (hi!, Class of 10), Class of 32)");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        student4.setEnrollmentYear(100);
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
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        java.lang.String str20 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", " - hi! (, Class of 100)", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi!");
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getName();
        java.util.List<java.lang.String> strList10 = student4.getCompletedCourses();
        java.lang.Class<?> wildcardClass11 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! (, Class of 100)" + "'", str9, " - hi! (, Class of 100)");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        business.Student student4 = new business.Student(" -  (, Class of 0)", "", "", 100);
        student4.setName("hi! -  (, Class of 100)");
        student4.addCompletedCourse(" - hi! (hi!, Class of 52)");
        student4.setName(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) (, Class of 52)");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        java.lang.String str29 = student4.getMajor();
        student4.setMajor(" -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  (, Class of 0) ( -  (, Class of 10), Class of 52), Class of 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " -  (, Class of 10)" + "'", str29, " -  (, Class of 10)");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        student4.addCompletedCourse("");
        java.lang.String str7 = student4.toString();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0)" + "'", str7, " -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        int int20 = student4.getEnrollmentYear();
        java.lang.String str21 = student4.getStudentId();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " -  (, Class of 0)" + "'", str21, " -  (, Class of 0)");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        business.Student student14 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", 0);
        java.util.List<java.lang.String> strList15 = student14.getCompletedCourses();
        student4.setCompletedCourses(strList15);
        java.lang.String str17 = student4.getStudentId();
        student4.setName("hi! - hi! ( - hi! (, Class of -1), Class of 35) -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) ( -  - hi! (, Class of -1) (, Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        student4.addCompletedCourse(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - hi! (, Class of 0)" + "'", str18, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        java.lang.String str8 = student4.getName();
        student4.addCompletedCourse(" - hi! (hi!, Class of 52) -  - hi! (hi!, Class of 52) ( -  (, Class of 100), Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (, Class of 0)" + "'", str8, "hi! -  (, Class of 0)");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        java.lang.String str34 = student4.getStudentId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)" + "'", str34, " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        business.Student student4 = new business.Student(" -  (, Class of 100)", " - hi! (, Class of 0)", " - hi! (, Class of 0)", (int) 'a');
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 1)");
        student4.setEnrollmentYear((int) 'a');
        student4.setEnrollmentYear((int) ' ');
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList9);
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        student4.setEnrollmentYear(100);
        student4.setName(" -  ( -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        business.Student student37 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)", "hi! -  (hi!, Class of 0)", (int) (short) 10);
        student37.setName(" - hi! (, Class of 100)");
        student37.setEnrollmentYear((-1));
        business.Student student46 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList47 = student46.getCompletedCourses();
        student46.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student46.setMajor("hi! - hi! (hi! -  (hi!, Class of 0), Class of 0)");
        business.Student student56 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList57 = student56.getCompletedCourses();
        student56.setName("hi!");
        business.Student student64 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str65 = student64.getName();
        java.util.List<java.lang.String> strList66 = student64.getCompletedCourses();
        business.Student student71 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList72 = student71.getCompletedCourses();
        student64.setCompletedCourses(strList72);
        student56.setCompletedCourses(strList72);
        student46.setCompletedCourses(strList72);
        student37.setCompletedCourses(strList72);
        student4.setCompletedCourses(strList72);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " -  (, Class of 10)" + "'", str30, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList72);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", (int) 'a');
        student4.setMajor(" -  - hi! (, Class of 0) (, Class of 0)");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0)");
        student4.setStudentId("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)");
        java.lang.String str13 = student4.getName();
        student4.setEnrollmentYear((int) '#');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)" + "'", str13, " -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        student4.setMajor(" - hi! (, Class of 100)");
        java.lang.String str10 = student4.getName();
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str10, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)" + "'", str11, " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        business.Student student4 = new business.Student("hi! - hi! (hi!, Class of 35)", " -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)", "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)", (-1));
        int int5 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.toString();
        business.Student student13 = new business.Student("", "", "hi!", (int) (short) 100);
        java.util.List<java.lang.String> strList14 = student13.getCompletedCourses();
        student4.setCompletedCourses(strList14);
        student4.setMajor(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setStudentId(" -  (, Class of 0) -  (hi! -  -  (, Class of 10) (, Class of 1), Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str8, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) '4');
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        student4.setName(" - hi! (, Class of 0)");
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (hi!, Class of 52)" + "'", str5, " - hi! (hi!, Class of 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        business.Student student4 = new business.Student("hi! -  -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100) (, Class of 100)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (, Class of 100)", (int) (byte) 10);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        java.lang.String str26 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " - hi! (, Class of 100) -  (, Class of 0)" + "'", str26, " - hi! (, Class of 100) -  (, Class of 0)");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)", " -  (, Class of 10) -  - hi! (, Class of 100) ( -  (, Class of 10), Class of -1)", (int) (byte) 100);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        business.Student student4 = new business.Student(" -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)", " -  (hi!, Class of 100) -  (, Class of 10)", " -  - hi! (, Class of -1) (, Class of 0)", 52);
        student4.setName("hi! -  -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0) (hi!, Class of 35)");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.util.List<java.lang.String> strList5 = null;
        student4.setCompletedCourses(strList5);
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.lang.String str8 = student4.getStudentId();
        java.lang.String str9 = student4.getName();
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        business.Student student35 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) '4');
        int int36 = student35.getEnrollmentYear();
        business.Student student41 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str42 = student41.getName();
        java.util.List<java.lang.String> strList43 = student41.getCompletedCourses();
        business.Student student48 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList49 = student48.getCompletedCourses();
        student41.setCompletedCourses(strList49);
        student41.setName(" - hi! (, Class of 0)");
        java.lang.String str53 = student41.getName();
        business.Student student58 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList59 = student58.getCompletedCourses();
        student58.setName("hi!");
        student58.addCompletedCourse("");
        student58.setEnrollmentYear((int) (short) 100);
        java.lang.String str66 = student58.getName();
        java.util.List<java.lang.String> strList67 = student58.getCompletedCourses();
        student41.setCompletedCourses(strList67);
        student35.setCompletedCourses(strList67);
        student4.setCompletedCourses(strList67);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " - hi! (, Class of 100)" + "'", str30, " - hi! (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + " - hi! (, Class of 0)" + "'", str53, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(strList67);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        business.Student student4 = new business.Student(" -  (hi!, Class of 100) - hi! -  (, Class of 100) ( -  (, Class of 100), Class of 1)", " - hi! (hi!, Class of 10)", " - hi! (, Class of 1)", (int) (byte) 1);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        student4.setName(" -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        business.Student student4 = new business.Student("", "hi!", "hi!", (int) (byte) 10);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setEnrollmentYear((int) (byte) 10);
        student4.addCompletedCourse(" -  (, Class of 100) -  - hi! (, Class of 0) ( - hi! (, Class of 0), Class of 0)");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", "hi! -  -  (, Class of 10) (, Class of 0) -  -  ( -  (, Class of 0), Class of 0) ( - hi! (, Class of 100), Class of 100)", "hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1)", (int) (short) 1);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35)");
        java.lang.String str8 = student4.getMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)" + "'", str8, "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setMajor("");
        student4.addCompletedCourse("hi! -  (hi!, Class of 97)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1)");
        int int13 = student4.getEnrollmentYear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 0)", " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)", " -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)", (int) (short) 10);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        business.Student student4 = new business.Student(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)", "hi! - hi! -  (, Class of 0) (hi!, Class of 35)", "hi! - hi! (hi!, Class of 35)", (int) (byte) 100);
        java.lang.String str5 = student4.toString();
        java.lang.String str6 = student4.getMajor();
        student4.setEnrollmentYear(32);
        student4.setMajor(" - hi! (, Class of 1)");
        java.lang.String str11 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)" + "'", str5, " -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! - hi! -  (, Class of 0) (hi!, Class of 35) (hi! - hi! (hi!, Class of 35), Class of 100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! (hi!, Class of 35)" + "'", str6, "hi! - hi! (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! -  (, Class of 0) (hi!, Class of 35)" + "'", str11, "hi! - hi! -  (, Class of 0) (hi!, Class of 35)");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        business.Student student4 = new business.Student("", "", "hi!", (int) (short) 100);
        java.lang.String str5 = student4.getName();
        student4.addCompletedCourse(" -  (hi! -  -  (, Class of 10) (, Class of 0), Class of 35) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  -  (, Class of 10) (, Class of 1), Class of 35)");
        student4.addCompletedCourse("hi! -  -  (, Class of 10) (, Class of 1) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 1), Class of -1)");
        int int10 = student4.getEnrollmentYear();
        java.lang.String str11 = student4.getMajor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        business.Student student4 = new business.Student("hi! - hi! -  -  (, Class of 10) (, Class of 1) ( -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100), Class of 1)", " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10) -  (, Class of 10)", "", (int) (short) 0);
        student4.setMajor("hi! -  (hi!, Class of 0) -  - hi! (, Class of -1) ( -  (, Class of 0), Class of 1)");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear(10);
        student4.setEnrollmentYear((int) (byte) 0);
        student4.setMajor(" - hi! (, Class of 0)");
        java.lang.String str12 = student4.getMajor();
        java.lang.String str13 = student4.getStudentId();
        student4.setMajor(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        student4.setEnrollmentYear((int) (short) 10);
        java.lang.String str20 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " -  ( -  (, Class of 10), Class of 10)" + "'", str20, " -  ( -  (, Class of 10), Class of 10)");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        business.Student student4 = new business.Student("hi!", "", "", (int) (byte) 100);
        java.lang.String str5 = student4.getMajor();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        student4.setName(" -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)");
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100) (, Class of 100)" + "'", str9, "hi! -  -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100) (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)" + "'", str10, " -  -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) (, Class of 100)");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList8 = student4.getCompletedCourses();
        java.lang.String str9 = student4.toString();
        student4.setEnrollmentYear((int) (short) -1);
        student4.setEnrollmentYear((int) (byte) 0);
        java.lang.String str14 = student4.getMajor();
        java.util.List<java.lang.String> strList15 = student4.getCompletedCourses();
        java.lang.String str16 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str9, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (, Class of 10)" + "'", str14, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " -  (, Class of 10)" + "'", str16, " -  (, Class of 10)");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        student4.setMajor("hi! -  -  (, Class of 10) (, Class of 0)");
        student4.setEnrollmentYear((int) '#');
        business.Student student19 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList20 = student19.getCompletedCourses();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        student19.setCompletedCourses((java.util.List<java.lang.String>) strList24);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList24);
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        java.lang.Class<?> wildcardClass30 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setName("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        java.lang.String str9 = student4.toString();
        student4.addCompletedCourse(" - hi! (, Class of -1)");
        java.lang.String str12 = student4.toString();
        java.lang.String str13 = student4.getMajor();
        java.lang.String str14 = student4.getStudentId();
        java.lang.String str15 = student4.getName();
        java.util.List<java.lang.String> strList16 = student4.getCompletedCourses();
        student4.setMajor(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10) -  ( -  (, Class of 0), Class of -1)");
        student4.setStudentId("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32) -  (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97), Class of 100)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str9, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)" + "'", str12, "hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str15, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str42 = student4.toString();
        student4.addCompletedCourse("hi! -  (hi!, Class of 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " -  (, Class of 10)" + "'", str36, " -  (, Class of 10)");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)" + "'", str42, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        business.Student student4 = new business.Student(" - hi! (hi!, Class of 52)", "hi! -  -  (, Class of 10) (hi!, Class of 35)", " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)", (int) '4');
        student4.setName("hi! -  (hi!, Class of 0) -  (hi!, Class of 10)");
        student4.addCompletedCourse(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) - hi! -  (hi!, Class of 97) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 0)");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        business.Student student4 = new business.Student(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  -  (, Class of 0) ( -  (, Class of 10), Class of -1)", "hi! -  (hi!, Class of 97)", (-1));
        student4.setStudentId(" -  -  (, Class of 10) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 100)");
        student4.addCompletedCourse(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) (, Class of 52)");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        student4.setName(" -  - hi! (, Class of 0) ( - hi! (, Class of 100), Class of 0)");
        student4.addCompletedCourse(" -  (, Class of 10)");
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
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", "", " -  (, Class of 10)", 100);
        java.lang.String str5 = student4.getName();
        student4.setMajor("hi! - hi! (hi!, Class of 35)");
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (, Class of 35)");
        student4.setName("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 97) -  - hi! ( - hi! (hi!, Class of 52), Class of -1) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  (, Class of 10) (, Class of 10) -  (hi! -  (hi!, Class of 0), Class of 0), Class of 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        business.Student student4 = new business.Student("", "hi!", "", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getStudentId();
        java.lang.String str7 = student4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        business.Student student4 = new business.Student(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 100) (hi! -  (hi!, Class of 0), Class of 35)", "hi! -  -  (, Class of 10) ( -  - hi! (, Class of 100) ( -  (, Class of 10), Class of 100), Class of 0)", " -  (, Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) ( -  - hi! (, Class of 0) (, Class of 0), Class of 97) -  - hi! (hi! - hi! -  (, Class of 0) (hi!, Class of 35), Class of 100) ( - hi! (, Class of 32), Class of 32)", (int) (byte) -1);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        business.Student student4 = new business.Student(" -  (, Class of 100)", "hi! -  (, Class of 0)", "hi! -  -  (, Class of 10) (, Class of 0)", 10);
        java.lang.String str5 = student4.toString();
        java.lang.Class<?> wildcardClass6 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)" + "'", str5, " -  (, Class of 100) - hi! -  (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0), Class of 10)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        business.Student student4 = new business.Student(" - hi! (, Class of 0)", " - hi! (, Class of 100)", "", (int) '#');
        int int5 = student4.getEnrollmentYear();
        int int6 = student4.getEnrollmentYear();
        student4.setName("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        student4.addCompletedCourse("hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setMajor(" -  (, Class of 10)");
        java.lang.String str10 = student4.getName();
        student4.setStudentId(" - hi! (hi!, Class of 52)");
        student4.setEnrollmentYear((int) (byte) 1);
        int int15 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        java.lang.Class<?> wildcardClass21 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " -  (, Class of 0)" + "'", str15, " -  (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        java.lang.String str26 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " -  - hi! -  (hi!, Class of 97) (, Class of 10) (, Class of 0)" + "'", str26, " -  - hi! -  (hi!, Class of 97) (, Class of 10) (, Class of 0)");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        business.Student student4 = new business.Student("hi! -  (hi!, Class of 0)", " -  (, Class of 10)", " -  (, Class of 0)", (int) (short) 1);
        student4.setName(" - hi! (, Class of -1)");
        java.lang.String str7 = student4.getStudentId();
        student4.setMajor(" - hi! (hi!, Class of 52) -  - hi! (, Class of 0) ( -  (, Class of 10), Class of 97)");
        student4.setStudentId("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
        java.lang.String str12 = student4.getName();
        java.lang.String str13 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str7, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of -1)" + "'", str12, " - hi! (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)" + "'", str13, "hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setStudentId("");
        int int8 = student4.getEnrollmentYear();
        student4.setEnrollmentYear((int) (short) 1);
        java.lang.String str11 = student4.getMajor();
        int int12 = student4.getEnrollmentYear();
        student4.setName("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        java.lang.String str15 = student4.getName();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)" + "'", str15, "hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        int int21 = student4.getEnrollmentYear();
        int int22 = student4.getEnrollmentYear();
        student4.setMajor(" -  (, Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        business.Student student4 = new business.Student("hi!", "hi!", "hi!", (int) '#');
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (short) 100);
        student4.setName("");
        student4.setName(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10)");
        student4.addCompletedCourse("");
        student4.setName(" -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) (, Class of 0)");
        student4.addCompletedCourse("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0) -  -  - hi! (, Class of -1) (, Class of 0) (hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35), Class of 35)");
        student4.setMajor(" - hi! (hi!, Class of 52) - hi! ( -  (, Class of 10), Class of 100)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        student4.setName("hi!");
        java.lang.String str8 = student4.getName();
        java.lang.String str9 = student4.getStudentId();
        student4.setMajor(" -  ( -  (, Class of 0), Class of 0)");
        java.lang.String str12 = student4.getMajor();
        student4.addCompletedCourse(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        java.lang.String str15 = student4.getName();
        business.Student student20 = new business.Student(" -  (, Class of 10)", " - hi! (, Class of 100)", " -  (, Class of 10)", (int) (byte) -1);
        java.util.List<java.lang.String> strList21 = student20.getCompletedCourses();
        student20.addCompletedCourse(" -  ( -  (, Class of 0), Class of 0)");
        java.util.List<java.lang.String> strList24 = student20.getCompletedCourses();
        student4.setCompletedCourses(strList24);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " -  ( -  (, Class of 0), Class of 0)" + "'", str12, " -  ( -  (, Class of 0), Class of 0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        business.Student student4 = new business.Student(" - hi! (, Class of 100)", " - hi! (hi!, Class of 52)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100)", 1);
        student4.setStudentId(" -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)");
        java.lang.String str7 = student4.toString();
        student4.setStudentId(" -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) -  -  (, Class of 10) (hi! -  - hi! (, Class of 0) ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  - hi! (, Class of 100) (hi! -  (hi!, Class of 0), Class of 10), Class of 0), Class of 100)");
        java.lang.Class<?> wildcardClass10 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)" + "'", str7, " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97) -  - hi! (hi!, Class of 52) (hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100), Class of 1)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        business.Student student4 = new business.Student("", " -  (, Class of 10)", " -  (, Class of 10)", (int) (byte) 100);
        student4.setStudentId("hi! -  (hi!, Class of 0)");
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.getName();
        java.lang.String str7 = student4.getStudentId();
        java.lang.String str8 = student4.getName();
        student4.setEnrollmentYear((int) '4');
        student4.setMajor("hi! -  ( -  (, Class of 0), Class of 0)");
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 100), Class of 0)");
        business.Student student19 = new business.Student("hi!", "", "hi!", 0);
        student19.setName(" -  (, Class of 10)");
        student19.setMajor("");
        student19.setName(" - hi! (, Class of 100)");
        student19.setStudentId(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        int int28 = student19.getEnrollmentYear();
        int int29 = student19.getEnrollmentYear();
        java.util.List<java.lang.String> strList30 = student19.getCompletedCourses();
        business.Student student35 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList36 = student35.getCompletedCourses();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        student35.setCompletedCourses((java.util.List<java.lang.String>) strList40);
        int int43 = student35.getEnrollmentYear();
        java.lang.String str44 = student35.getMajor();
        int int45 = student35.getEnrollmentYear();
        student35.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35)");
        business.Student student52 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList53 = student52.getCompletedCourses();
        student52.setName("hi!");
        student52.addCompletedCourse("");
        student52.setEnrollmentYear((int) (short) 100);
        java.lang.String str60 = student52.getName();
        java.util.List<java.lang.String> strList61 = student52.getCompletedCourses();
        business.Student student66 = new business.Student("", "", "", (int) (short) 0);
        java.util.List<java.lang.String> strList67 = student66.getCompletedCourses();
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        student66.setCompletedCourses((java.util.List<java.lang.String>) strList71);
        student52.setCompletedCourses((java.util.List<java.lang.String>) strList71);
        student35.setCompletedCourses((java.util.List<java.lang.String>) strList71);
        student19.setCompletedCourses((java.util.List<java.lang.String>) strList71);
        student4.setCompletedCourses((java.util.List<java.lang.String>) strList71);
        java.lang.Class<?> wildcardClass78 = strList71.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        business.Student student4 = new business.Student("", "hi! -  (, Class of 0)", "hi! -  (hi!, Class of 0) -  (hi!, Class of 10)", (int) '#');
        int int5 = student4.getEnrollmentYear();
        student4.addCompletedCourse("hi! - hi! - hi! (hi! -  (hi!, Class of 0), Class of 0) (, Class of 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        business.Student student4 = new business.Student("hi! -  ( -  (, Class of 0), Class of 0)", " -  (, Class of 0) - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) (, Class of 100)", "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 0) -  -  -  (, Class of 0) ( -  (, Class of 10), Class of 100) (, Class of 32), Class of 97)", (int) (byte) 100);
        java.lang.String str5 = student4.getStudentId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  ( -  (, Class of 0), Class of 0)" + "'", str5, "hi! -  ( -  (, Class of 0), Class of 0)");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        business.Student student4 = new business.Student("", "hi! -  (hi!, Class of 0)", " - hi! (hi!, Class of 52) -  -  -  (, Class of 10) ( - hi! (, Class of 0), Class of 10) ( -  (, Class of 10), Class of 10)", (int) (byte) 0);
        student4.setName(" -  (, Class of 0) - hi! ( - hi! (, Class of 0), Class of 0)");
        student4.setMajor("hi! -  (, Class of 100)");
        java.lang.Class<?> wildcardClass9 = student4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        business.Student student4 = new business.Student(" - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)", " - hi! ( - hi! (hi!, Class of 52), Class of -1)", " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)", 52);
        java.lang.String str5 = student4.getMajor();
        java.lang.String str6 = student4.getStudentId();
        java.lang.Class<?> wildcardClass7 = student4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)" + "'", str5, " -  -  (, Class of 10) ( - hi! (, Class of 100), Class of 32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)" + "'", str6, " - hi! (, Class of 0) -  - hi! (, Class of 100) (hi!, Class of 35)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        student4.addCompletedCourse(" - hi! (, Class of 100)");
        java.lang.String str13 = student4.toString();
        student4.addCompletedCourse(" - hi! (, Class of 0) - hi! - hi! -  -  (, Class of 10) (hi!, Class of 35) (hi!, Class of 0) (, Class of 35)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str13, "hi! -  (hi!, Class of 0)");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        student4.setName(" -  (, Class of 10)");
        student4.setEnrollmentYear((int) '#');
        java.lang.String str9 = student4.toString();
        java.lang.String str10 = student4.getMajor();
        int int11 = student4.getEnrollmentYear();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! -  -  (, Class of 10) (hi!, Class of 35)" + "'", str9, "hi! -  -  (, Class of 10) (hi!, Class of 35)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.lang.String str7 = student4.getStudentId();
        student4.setStudentId("hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1)");
        java.lang.String str10 = student4.getMajor();
        java.lang.String str11 = student4.toString();
        java.util.List<java.lang.String> strList12 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  (hi!, Class of 0) -  -  (, Class of 100) (, Class of -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)" + "'", str11, "hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 0), Class of 1) -  (, Class of 0)");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        business.Student student4 = new business.Student("hi!", "", "hi!", 0);
        int int5 = student4.getEnrollmentYear();
        java.lang.String str6 = student4.toString();
        int int7 = student4.getEnrollmentYear();
        int int8 = student4.getEnrollmentYear();
        java.lang.String str9 = student4.getStudentId();
        java.lang.String str10 = student4.getStudentId();
        student4.setName(" - hi! (, Class of 0) - hi! -  -  (, Class of 10) (, Class of 0) (hi! -  -  (, Class of 10) (, Class of 1), Class of 10)");
        student4.setStudentId("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        java.lang.Class<?> wildcardClass15 = student4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  (hi!, Class of 0)" + "'", str6, "hi! -  (hi!, Class of 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        student4.setStudentId("hi! -  -  (, Class of 10) (, Class of 0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - hi! (, Class of 0)" + "'", str12, " - hi! (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        int int24 = student4.getEnrollmentYear();
        java.lang.String str25 = student4.getMajor();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)" + "'", str23, " -  (, Class of 10) - hi! -  (hi!, Class of 0) (, Class of 0)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        java.lang.Class<?> wildcardClass23 = student4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        business.Student student4 = new business.Student("hi! - hi! -  (hi!, Class of 0) -  -  (, Class of 10) ( -  (, Class of 10), Class of 100) (hi!, Class of 35) - hi! (, Class of 0)", " -  (, Class of 0) -  ( - hi! (, Class of 0), Class of 97)", "", (int) (short) 1);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        business.Student student4 = new business.Student("hi! -  -  (, Class of 10) (, Class of 0)", " - hi! (, Class of 100)", "hi! -  -  (, Class of 10) (, Class of 0)", 35);
        java.lang.String str5 = student4.getName();
        java.lang.String str6 = student4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! (, Class of 100)" + "'", str5, " - hi! (, Class of 100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)" + "'", str6, "hi! -  -  (, Class of 10) (, Class of 0) -  - hi! (, Class of 100) (hi! -  -  (, Class of 10) (, Class of 0), Class of 35)");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        int int20 = student4.getEnrollmentYear();
        student4.setMajor("hi! -  -  (, Class of 10) (hi!, Class of 35) - hi! (, Class of 32) - hi! (hi!, Class of 100)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        business.Student student4 = new business.Student("", "", "", (int) (short) 0);
        java.lang.String str5 = student4.getName();
        student4.setEnrollmentYear((int) (byte) 10);
        java.lang.String str8 = student4.getStudentId();
        java.util.List<java.lang.String> strList9 = student4.getCompletedCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        business.Student student4 = new business.Student("hi!", " -  (, Class of 10)", " -  (, Class of 10)", (int) (short) 1);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList6 = student4.getCompletedCourses();
        java.util.List<java.lang.String> strList7 = student4.getCompletedCourses();
        student4.addCompletedCourse("hi! -  ( -  -  (, Class of 0) ( -  (, Class of 10), Class of 100), Class of 32)");
        student4.setName(" -  -  (, Class of 10) (hi! -  (, Class of 100), Class of 100) - hi! -  -  (, Class of 10) ( -  (, Class of 10), Class of 1) (, Class of 52)");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        business.Student student4 = new business.Student("", " -  (, Class of 0)", " -  (, Class of 10)", (int) (byte) 100);
        java.util.List<java.lang.String> strList5 = student4.getCompletedCourses();
        java.lang.String str6 = student4.toString();
        student4.setEnrollmentYear((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)" + "'", str6, " -  -  (, Class of 0) ( -  (, Class of 10), Class of 100)");
    }
}

