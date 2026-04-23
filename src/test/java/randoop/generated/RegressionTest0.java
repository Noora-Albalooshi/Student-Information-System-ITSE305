package randoop.generated;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        data.User user6 = new data.User("", "", "", "", "hi!", (double) 0);
        java.lang.String str7 = user6.getDepartment();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        data.UserRepository userRepository0 = null;
        business.LoginService loginService1 = new business.LoginService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            data.User user4 = loginService1.authenticate("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.UserRepository.getUserByEmail(String)\" because \"this.repo\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        data.User user4 = userRepository0.getUserByEmail("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = user4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getPassword();
        java.lang.String str8 = user5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        data.User user4 = userRepository0.getUserByEmail("");
        java.lang.Class<?> wildcardClass5 = userRepository0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getDepartment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        java.lang.Class<?> wildcardClass3 = userRepository0.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        data.User user4 = userRepository0.getUserByEmail("");
        business.LoginService loginService5 = new business.LoginService(userRepository0);
        java.lang.Class<?> wildcardClass6 = loginService5.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        data.User user4 = new data.User("hi!", "hi!", "hi!", "hi!");
        double double5 = user4.getGpa();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        data.User user6 = new data.User("", "", "hi!", "hi!", "", (double) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        data.User user4 = new data.User("", "", "", "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getMajor();
        double double8 = user5.getGpa();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        data.UserRepository userRepository0 = null;
        business.LoginService loginService1 = new business.LoginService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            data.User user4 = loginService1.authenticate("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.UserRepository.getUserByEmail(String)\" because \"this.repo\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getMajor();
        java.lang.String str8 = user5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        data.UserRepository userRepository0 = null;
        business.LoginService loginService1 = new business.LoginService(userRepository0);
        // The following exception was thrown during execution in test generation
        try {
            data.User user4 = loginService1.authenticate("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.UserRepository.getUserByEmail(String)\" because \"this.repo\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        data.User user5 = new data.User("hi!", "", "", "", "hi!");
        java.lang.String str6 = user5.getEmail();
        java.lang.String str7 = user5.getMajor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        data.User user5 = new data.User("hi!", "hi!", "", "", "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getMajor();
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        data.User user4 = userRepository0.getUserByEmail("");
        business.LoginService loginService5 = new business.LoginService(userRepository0);
        data.User user8 = loginService5.authenticate("", "hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        java.lang.String str8 = user5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        data.User user6 = new data.User("hi!", "", "hi!", "hi!", "", (double) '#');
        java.lang.String str7 = user6.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getPassword();
        java.lang.String str8 = user5.getEmail();
        java.lang.String str9 = user5.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        data.User user6 = new data.User("", "", "", "", "hi!", (double) 0);
        java.lang.String str7 = user6.getMajor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        data.User user5 = new data.User("", "hi!", "", "hi!", "");
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getPassword();
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        data.User user4 = userRepository0.getUserByEmail("");
        business.LoginService loginService5 = new business.LoginService(userRepository0);
        data.User user8 = loginService5.authenticate("hi!", "");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        data.User user4 = userRepository0.getUserByEmail("");
        data.User user6 = userRepository0.getUserByEmail("hi!");
        business.LoginService loginService7 = new business.LoginService(userRepository0);
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        data.User user6 = new data.User("", "", "", "", "", (double) (short) -1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        data.User user4 = userRepository0.getUserByEmail("hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        data.UserRepository userRepository0 = new data.UserRepository();
        data.User user2 = userRepository0.getUserByEmail("");
        business.LoginService loginService3 = new business.LoginService(userRepository0);
        data.User user5 = userRepository0.getUserByEmail("hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user5);
    }
}

